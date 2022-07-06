package java_logic_programs;
import java.util.Scanner;

public class reverse_number {

        public static void main(String[] args) {


            int number;
            int Reverse = 0;
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the Number :");
            number= num.nextInt();
            while(number != 0)
            {
                int remainder = number % 10;
                Reverse = Reverse * 10 + remainder;
                number = number/10;
            }
            System.out.println("The reverse of the given number is: " + Reverse);
        }

}
