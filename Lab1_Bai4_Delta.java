import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void  main(String[] arg) 
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập 
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        // Tính delta:
        double delta = Math.pow(b,2) - 4 * a * c;
        System.out.println("Delta = " + delta);

        if (delta >=0) {
            double CanBacdelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + CanBacdelta);
        } else System.out.println("Delta âm, không có căn bậc hai");

        scanner.close();
    }
}