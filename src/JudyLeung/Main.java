package JudyLeung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(JLeungLib.test("hi"));

        System.out.println(JLeungLib.isPalindrome("racecar"));
        System.out.println(JLeungLib.isPalindrome("cat"));
        System.out.println(JLeungLib.isPalindrome("askdljasl"));
        System.out.println(JLeungLib.isPalindrome("reviver"));

        System.out.println(JLeungLib.multiplicationTable(3,10));
        System.out.println(JLeungLib.multiplicationTable(3,-10));
        System.out.println(JLeungLib.multiplicationTable(3,0));
    }
}
