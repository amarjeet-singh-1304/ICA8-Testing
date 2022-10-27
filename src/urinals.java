//Author - Amarjeet Singh

public class urinals {

    public static boolean goodString(String str)
    {
        if(str.replaceAll("\\s", "").length() == 0)
            return false;

        return true;

    }

    public static void main(String[] args)
    {
        boolean check = goodString("");
        System.out.println(check);


    }
}
