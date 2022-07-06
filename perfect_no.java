package java_logic_programs;
import java.util.Scanner;
public class perfect_no {

        public static void main(String[] args) {

            int a;
            int num;
            int sum = 0;
            Scanner user = new Scanner(System.in);
            System.out.println("Enter The Number To Check a Perfect Number: ");
            num = user.nextInt();

            for (a = 1; a < num; a++) {
                if (num % a == 0) ;
                sum += a;
            }
            if (sum == num) {
                System.out.print( "Entered Number "+ num );
                System.out.print(" is Perfect Number");
            } else {
                System.out.print("Entered Number "+ num );
                System.out.print(" is not Perfect Number");
            }

        }

}
