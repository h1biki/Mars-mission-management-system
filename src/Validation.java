public class Validation
{
    public Validation()
    {
    }


    public boolean stringIsBlank(String value)
    {
        boolean blank = true;
        if (value.trim().length() > 0)
            blank = false;
        return blank;
    }


    public boolean stringLengthWithinRange(String value, int min, int max)
    {
        boolean withinRange = false;
        if ((value.trim().length() >= min) && (value.trim().length() <= max))
            withinRange = true;
        return withinRange;
    }

    public static boolean isNumeric(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            int chr = str.charAt(i);
            if(chr<48 || chr>57)
            {
                return false;
            }
        }
        return true;
    }

    public boolean hasBlank(String str)
    {
        if (str.contains(" "))
        {
            return true;
        }
        return false;
    }
}