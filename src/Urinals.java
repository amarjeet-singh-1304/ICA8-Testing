//Author - Amarjeet Singh

import java.io.*;
import java.net.URL;
import java.util.Scanner;


public class Urinals {
    public  static String readFile(String filename) throws IOException {


        StringBuilder sb = new StringBuilder();
        ClassLoader classLoader = Urinals.class.getClass().getClassLoader();
        URL fileURL = classLoader.getResource(filename);
        if (fileURL != null) {
                File file = new File(fileURL.getFile());
                InputStream in = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String line;
                while ((line = br.readLine()) != null) {
                    boolean check = goodString(line);
                    if (check) {
                        sb.append(countUrinals(line) + System.lineSeparator());
                    } else {
                        sb.append(-1 + System.lineSeparator());
                    }
                }

            }
        return sb.toString();

    }



    public static void writeFile(String outputStr) throws IOException {

        File outFile = new File("resources/rule.txt");
        int i = 0;
        while(outFile.exists())
        {
            i++;
            outFile = new File("resources/rule" + i + ".txt");
        }
        FileWriter fw = new FileWriter(i == 0 ? "resources/rule.txt":"resources/rule" + i + ".txt", true);
        fw.write(outputStr);
        fw.close();


    }


    public static void fileProcess() throws IOException {
        Urinals urinals = new Urinals();
        String ans  = urinals.readFile("urinal.dat");
        urinals.writeFile(ans);
    }

    public static int countUrinals(String str)
    {
        StringBuilder stringBuilder = new StringBuilder(str);
        int count = 0;

        if(stringBuilder.charAt(1) == '0' && stringBuilder.charAt(0) == '0') {
            stringBuilder.setCharAt(0, '1');
            count = count + 1;
        }

        for(int i = 1; i< str.length() -1; i++)
        {
            if(stringBuilder.charAt(i-1) == '0' && stringBuilder.charAt(i) == '0' &&
                    stringBuilder.charAt(i+1) == '0')
            {

                stringBuilder.setCharAt(i, '1');
                count = count + 1;
            }

        }

        if(stringBuilder.charAt(stringBuilder.length()-1) == '0' && stringBuilder.charAt(stringBuilder.length()-2) == '0')
        {
            stringBuilder.setCharAt(stringBuilder.length()-1, '1');
            count = count +1;
        }

        return count;
    }

    public static boolean goodString(String str)
    {
        if(str.replaceAll("\\s", "").length() == 0 ||
                str.replaceAll("\\s", "").length() >=21 )
            return false;
        boolean check = true;
        for(int i = 0; i < str.length()-1; i++)
        {
            if (str.charAt(i) == '1' && str.charAt(i+1) == str.charAt(i))
            {
                check = false;
                break;
            }
        }

        return check;

    }


    public static void main(String[] args) throws IOException {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a choice to take input: \n1. Keyboard \n2. File");
        int inputMode = scanner.nextInt();
        if(inputMode == 1)
        {
            boolean exitLoop = false;
            while (!exitLoop) {
                System.out.println("Please Enter the String");
                String input = scanner.next();

                if (input.equals("-1")) {
                    exitLoop = true;
                    System.exit(0);
                }
                boolean check = goodString(input);
                if(check)
                {
                    int count = countUrinals(input);
                    System.out.println(count);
                }
                else
                {
                    System.out.println("-1");

                }
            }
        }

        else if(inputMode == 2) {
            fileProcess();
        }


    }
}
