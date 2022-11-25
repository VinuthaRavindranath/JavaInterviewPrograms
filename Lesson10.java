//WAP to demonstrate Fibonacci series
package JavaInterviewPrograms;

public class Lesson10 {
    public static void main(String[] args) {
        int a = 0, b = 1, c, count = 10;
        for (int i = 0; i <= count; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
