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


    // returns mainStr with the first instance of subStr deleted from mainStr
   public static String cutOut(String mainStr, String subStr){
        if (mainStr.contains(subStr))
        {
            String front = mainStr.substring(0, (mainStr.indexOf(subStr)));
            String back = mainStr.substring((mainStr.indexOf(subStr)+subStr.length()));
            return front + back;
        }
        else
        {
          return mainStr;
        }
   }


    // returns a multiplication table for a base number
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

