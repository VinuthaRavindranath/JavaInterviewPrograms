//WAP to Check Whether A Number is Prime or Not
package JavaInterviewPrograms;

public class Lesson12 {
    public static void main(String[] args) {
        int number = 11;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is prime no: " + number);
        } else {
            System.out.println("Number is not prime no: " + number);
        }
    }
}
