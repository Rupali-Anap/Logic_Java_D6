package java_logic_programs;
import java.util.Scanner;

public class prime_no {

            public static void main(String[] args) {int Number;
            int prime;
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the Number ");
            Number = num.nextInt();
            if (Number % 2 == 0 && Number >= 2) {
                prime = 0;
                System.out.println(Number+" is prime number");
            } else {
                prime = 1;
                System.out.println(Number+" is not prime number");
            }
        }

}
