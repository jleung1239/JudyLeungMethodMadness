package JudyLeung;
// create methods here
public class JLeungLib {

    //returns true if input is the same backwards and forwards
    public static boolean isPalindrome(String input){
        String backwards = "";
        int i = input.length();
        while (i > 0) { // creates a backwards string of input
            backwards = backwards + input.substring(i - 1, i);
            i--;
        }
        return (backwards.equals(input)); //returns true if backwards string is same as input
    }


    // returns mainStr with the first instance of subStr deleted from mainStr
   public static String cutOut(String mainStr, String subStr){
        if (mainStr.contains(subStr))
        {
            String front = mainStr.substring(0, (mainStr.indexOf(subStr))); //from beginning of mainStr to before subStr
            String back = mainStr.substring((mainStr.indexOf(subStr)+subStr.length())); //the string in mainStr after the subStr
            return front + back;
        }
        else // if subStr isn't in the mainStr it just returns mainStr
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


    // adds all numbers in order from 0 to the integer (ie. input 3 = 0 + 1 + 2 + 3 = 5)
    public static int sumUpTo(int integer) {
        int out = 0;
        if (integer >= 0)
        {
            for (int count = 0 ; count <= integer ; count++ )
            {
                out = out + count;
            }
        }
        else // if integer is negative
        {
            for (int index = integer ; index <= 0 ; index++)
            {
                out = out + index;
            }
        }
        return out;
    }

  // input string in the format mm/dd/yyyy, returns dd - mm - yyyy
    public static String dateStr(String input ){
        String mm = input.substring(0,2);
        String dd = input.substring(3,5);
        String yyyy = input.substring(6,10);
        return dd + " - " + mm + " - " + yyyy;
    }
}

