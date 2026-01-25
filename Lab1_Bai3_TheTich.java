import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài cạnh:
        System.out.print("Nhập độ dài cạnh: ");
        double canh = scanner.nextDouble();

        // Thể tích:
        double TheTich = canh * canh * canh;
        double TheTich_cach2 = Math.pow(canh,3);
        
        // Xuất ra màn hình:
        System.out.println("Chiều dài cạnh: " + canh);
        System.out.println("Thể tích: " + TheTich);
        System.out.println("Thể tích: " + TheTich_cach2);
        
        scanner.close();
    }
}