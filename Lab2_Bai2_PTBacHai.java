import java.util.Scanner;

public class Lab2_Bai2_PTBacHai {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập a,b và c
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c = ");
        double c = scanner.nextDouble();

        // In phương trình bậc 2
        System.out.println("Phương trình bậc hai: " + a + "x^2 + " + b + "x + " + c + " = 0");

        // Giải phương trình bậc 2
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Phương trình có vô số nghiệm"); // a,b,c = 0
                } else {
                    System.out.println("Phương trình vô nghiệm"); // a,b = 0
                }
            } else {
                double x = -c/b;
                System.out.println("Phương trình có nghiệm x = " + x); // a = 0
            }
        }

        if(a != 0) {

            // Delta: b bình trừ 4 ac
            double delta = b * b - 4 * a * c;

            if(delta < 0) {
                System.out.println("Vô nghiệm");
            } else if(delta == 0) {
                double x = -b/(2*a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        
        scanner.close();
    }
}
