package JudyLeung;
// create methods here
public class JLeungLib {
    public static String test(String input)
    {
        return input + "There";
        //delete later

    }
    //returns true if same backwards and forwards
    public static boolean isPalindrome(String input){
        String backwards = "";
        int i = input.length();
        while (i > 0) {
            backwards = backwards + input.substring(i - 1, i);
            i--;
        }
        return (backwards.equals(input));
    }


    public static String multiplicationTable(int base, int range){
        if (range > 0 || range < 0) //accounts for both a negative and positive range
        {
            int i = 0;
            if (range > 0)
            {
                while (i <= range)
                {
                    System.out.println(base + " * " + i + " = " + ( base * i ));
                    i++;
                }


            }
            else //if range is negative
            {
                while (i >= range)
                {
                    System.out.println(base + " * " + i + " = " + (base * i));
                    i--;
                }
            }
        }
        else //if range is 0
        {
            System.out.println(base + " * " + range + " = 0");
        }
        return null; //the code stops here and all the multiplication tables end with "null"
    }
}

