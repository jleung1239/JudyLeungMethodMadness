package JudyLeung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(JLeungLib.test("hi"));
    }

    public static boolean isPalindrome(String input){
        String backwards = "";
        int i = input.length();
        while (i > 0)
        {
            backwards = backwards + input.substring(i-1, i);
        }
        return (backwards.equals(input));
    }
}
