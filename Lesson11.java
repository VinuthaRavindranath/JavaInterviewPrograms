//WAP to Print Fibonacci Series Using Recursion in Java
package JavaInterviewPrograms;

public class Lesson11 {
    static int a = 0, b = 1, c;

    public static void printFib(int i) {
        if (i >= 1) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(c + " ");
            printFib(i - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(a + " " + b + " ");
        printFib(10);
    }

}
