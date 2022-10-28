//Author - Amarjeet Singh

import java.util.Scanner;

public class Urinals {

    public static int countUrinals(String str)
    {
        StringBuilder stringBuilder = new StringBuilder(str);
        int count = 0;

        for(int i = 1; i< str.length() -1; i++)
        {
            if(stringBuilder.charAt(i-1) == '0' && stringBuilder.charAt(i) == '0' &&
                    stringBuilder.charAt(i+1) == '0')
            {

                stringBuilder.setCharAt(i, '1');
                count = count + 1;
            }

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


    public static void main(String[] args)
    {

        boolean check = goodString("");
        System.out.println(check);


    }
}
