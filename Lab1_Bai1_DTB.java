import java.util.Scanner;

public class Lab1_Bai1_DTB {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // Nhập họ và tên
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = scanner.nextDouble();

        // Xuất ra màn hình
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);

        scanner.close();
    }
}
