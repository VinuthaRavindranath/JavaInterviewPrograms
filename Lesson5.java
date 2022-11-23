//WAP to check if a given number is even or odd
package JavaInterviewPrograms;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " is a odd number");
        }
        sc.close();
    }
}
