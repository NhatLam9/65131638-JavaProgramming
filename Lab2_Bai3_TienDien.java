import java.util.Scanner;

public class Lab2_Bai3_TienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện sử dụng
        System.out.print("Nhập số điện sử dụng: ");
        double sodien = scanner.nextDouble();

        // Tính tiền điện
        double tiendien;
        if (sodien <= 50) {
            tiendien = sodien * 1000;
        } else {
            tiendien = 50 * 1000 + (sodien - 50) * 1200;
        }

        // In ra tiền phải trả
        System.out.print("Tiền điện phải trả: " + tiendien + " VND");

        scanner.close();
    }
}
