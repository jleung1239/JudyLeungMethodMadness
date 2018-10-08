package JudyLeung;

public class Main {

    public static void main(String[] args) {
	// write your testing code here
        System.out.println(JLeungLib.test("hi"));

        System.out.println(JLeungLib.isPalindrome("racecar")); //true
        System.out.println(JLeungLib.isPalindrome("cat")); //false
        System.out.println(JLeungLib.isPalindrome("askdljasl")); //false
        System.out.println(JLeungLib.isPalindrome("reviver")); //true

        System.out.println(JLeungLib.multiplicationTable(3,10)); //positive range
        System.out.println(JLeungLib.multiplicationTable(3,-10)); //negative range
        System.out.println(JLeungLib.multiplicationTable(3,0)); //range is 0

        System.out.println(JLeungLib.cutOut("catatonic cat", "cat")); //beginning deleted
        System.out.println(JLeungLib.cutOut("catatonic cat", "atonic")); //middle deleted
        System.out.println(JLeungLib.cutOut("ice cream man", "man")); //end deleted
    }
}
