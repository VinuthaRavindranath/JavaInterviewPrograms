//WAP to Swap 2 numbers using the 3rd variable
package JavaInterviewPrograms;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x + " " + "y: " + y);
        sc.close();
    }

}
