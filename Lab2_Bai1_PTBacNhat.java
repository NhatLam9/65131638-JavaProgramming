import java.util.Scanner;

public class Lab2_Bai1_PTBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập a và b
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        // In phương trình bậc nhất: ax + b = 0
        System.out.print("Phương trình bậc nhất có dạng: " + a + "x + " + b + "= 0");

        // Giải phương trình
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            } 
        } else {
            double x = -b/a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }

        scanner.close();
    }
}
