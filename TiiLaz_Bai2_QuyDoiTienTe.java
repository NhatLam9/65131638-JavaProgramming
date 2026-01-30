import java.util.Scanner;

public class TiiLaz_Bai2_QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mệnh giá quy đổi
        final double USD_TO_VND = 23500;
        final double EUR_TO_VND = 27000;

        // Nhập số tiền cần đổi
        System.out.print("Nhập số tiền: ");
        double sotien = scanner.nextDouble();

        // Chọn loại tiền quy đổi
        System.out.println("Chọn loại tiền:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int luachon = scanner.nextInt();

        double vnd;

        if (luachon == 1) {
            vnd = sotien * USD_TO_VND;
        } else if (luachon == 2) {
            vnd = sotien * EUR_TO_VND;
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            scanner.close();
            return;
        }

        System.out.println("Số tiền sau quy đổi = " + vnd + " VND");

        scanner.close();
    }
}
