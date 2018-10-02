package JudyLeung;
// create methods here
public class JLeungLib {
    public static String test(String input)
    {
        String out = "Hello";
        return (input + out + "There");
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
}

