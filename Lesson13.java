//WAP to demonstrate Palindrome of a string in Java
package JavaInterviewPrograms;

public class Lesson13 {

    public static void main(String[] args) {
        String originalWord = "mom dad", reversedWord = "";
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + originalWord.charAt(i);
        }
        System.out.println(reversedWord);

        if (originalWord.equals(reversedWord)) {
            System.out.println("Entered string is a palindrome.");
        } else {
            System.out.println("Entered string is not a palindrome.");
        }
    }
}
