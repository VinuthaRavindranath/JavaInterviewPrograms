//WAP to demonstrate Palindrome of a sentense(words) in Java
package JavaInterviewPrograms;

public class Lesson14 {
    public static void main(String[] args) {
        String OriginalWords = "mom dad", newWords = "", paliWords = " ";
        String reversedWords[] = OriginalWords.split(" ");

        for (int i = reversedWords.length - 1; i >= 0; i--) {
            newWords = newWords + reversedWords[i] + ' ';
        }

        for (int i = newWords.length() - 1; i >= 0; i--) {
            paliWords = paliWords + newWords.charAt(i);
        }

        if (OriginalWords.equals(paliWords.trim())) {
            System.out.println("Entered string is a palindrome.");
        } else {
            System.out.println("Entered string is not a palindrome.");
        }
    }
}
