import java.util.Scanner;

public class Lab2_Bai4_Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luachon;

        do {
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.print("Chọn chức năng: ");
            luachon = scanner.nextInt();

            switch (luachon) {
                case 1:
                    Lab2_Bai1_PTBacNhat.main(new String[]{});
                    break;
                case 2:
                    Lab2_Bai2_PTBacHai.main(new String[]{});
                    break;
                case 3:
                    Lab2_Bai3_TienDien.main(new String[]{});
                    break;
                case 4:
                    break;
            }
        } while (luachon != 0);

        scanner.close();
    }
}
