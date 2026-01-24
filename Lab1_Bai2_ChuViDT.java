import java.util.Scanner;

public class Lab1_Bai2_ChuViDT {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài:
        System.out.print("Nhập chiều dài: ");
        double chieudai = scanner.nextDouble();

        // Nhập chiều rộng:
        System.out.print("Nhập chiều rộng: ");
        double chieurong = scanner.nextDouble();

        // Tính chu vi:
        double chuVi = 2*(chieudai + chieurong);
        
        // Tính diện tích:
        double DienTich = chieudai * chieurong;

        // Cạnh nhỏ nhất:
        double CanhNhoNhat = Math.min(chieudai,chieurong);

        // Xuất ra màn hình:
        System.out.println("Chiều dài: " + chieudai);
        System.out.println("Chiều rộng: " + chieurong);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật:   " + DienTich);
        System.out.println("Cạnh nhỏ nhất: " + CanhNhoNhat);

        scanner.close();
    }
}