//Author - Amarjeet Singh

public class urinals {

    public static boolean goodString(String str)
    {
        if(str.replaceAll("\\s", "").length() == 0 || str.replaceAll("\\s", "").length() >=21 )
            return false;
        boolean check = true;
        for(int i = 0; i < str.length()-1; i++)
        {
            if(str.charAt(i) == '0')
                continue;
            else
            if (str.charAt(i) == '1' && str.charAt(i+1) == str.charAt(i))
            {
                check = false;
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
