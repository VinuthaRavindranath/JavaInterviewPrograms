//WAP to print star pattern in the console
package JavaInterviewPrograms;

public class Lesson7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = i - 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
