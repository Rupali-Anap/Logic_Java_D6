package java_logic_programs;

public class coupon_no {

        public static void main(String[] args) {

            char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
            int max = 10000000;
            int random = (int) (Math.random() * max);
            StringBuffer sc = new StringBuffer();


            while (random > 0) {

                sc.append(chars[random % chars.length]);
                random /= chars.length;
            }

            String couponCode = sc.toString();
            System.out.println("Coupon Code: " + couponCode);
        }



}
