import java.util.Scanner;

public class TiiLaz_Bai1_TinhTienLuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số giờ làm và lương theo giờ
        System.out.print("Nhập số giờ làm: ");
        double giolam = scanner.nextDouble();
        System.out.print("Nhập lương theo giờ (đơn vị: VNĐ/h): ");
        double luongtheogio = scanner.nextDouble();

        // Tính tiền lương
        double tongluong;
        if(giolam > 40) {
            double giotangca = giolam - 40;
            tongluong = 40 * luongtheogio + giotangca * luongtheogio * 1.5;
        } else {
            tongluong = giolam * luongtheogio;
        }
        System.out.println("Tổng lương = " +tongluong);

        scanner.close();
    }
}
