package StrRev;

public class StringUtils
{
    private StringUtils() {
        // nem példányosítható
    }

    public static String strrev(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static boolean isPalindrome(String s)
    {
        // TODO
        return false; // temporary
    }
}
