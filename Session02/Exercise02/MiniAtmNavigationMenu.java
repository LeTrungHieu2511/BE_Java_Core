import java.util.Scanner;

public class MiniAtmNavigationMenu {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        double balance = 5000000;
        int num ;

        do {
            System.out.print("""
                    --- MENU GIAO DỊCH ATM MINI ---
                    1. Xem số dư | 2. Nộp tiền | 3. Rút tiền | 4. Thoát
                    Chọn chức năng (1-4):
                    """);
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.printf("""
                            | SỐ DƯ HIỆN TẠI:              %,.2f VNĐ         |
                            +-------------------------------------------------------+
                            """,
                            balance);
                    break;
                case 2:
                    System.out.println("Nhập số tiền cần nộp: ");
                    double nop = scanner.nextDouble();
                    if (nop > 0) {
                        balance += nop;
                        System.out.printf("""
                                => Nộp thành công %,.2f VNĐ. Số dư mới: %,.2f VNĐ
                                +-------------------------------------------------------+
                                """,
                                nop,
                                balance);
                    } else {
                        System.out.println("So tien nop phai lon hon 0");
                    }
                    break;
                case 3:
                    System.out.println("Nhap so tien can rut: ");
                    double rut = scanner.nextDouble();
                    if (rut >0 && rut<= balance){
                        balance -=rut;
                        System.out.printf("""
                             => Rut thành công %,.2f VNĐ. Số dư mới: %,.2f VNĐ
                            +-------------------------------------------------------+
                            """,
                                rut,
                                balance);
                    } else{
                        System.out.print("So tien rut phai lon hon 0 va nho hon so du");
                    }
                    break;
                case 4:
                    System.out.print("=> Cảm ơn quý khách đã sử dụng dịch vụ ATM. Xin chào!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon tu 1-4");

            }
        } while (num != 4);

    }
}
