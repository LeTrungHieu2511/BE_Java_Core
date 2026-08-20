package vn.edu.rikkei.session02.ex02;

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
                    double pay = scanner.nextDouble();
                    if (pay > 0) {
                        balance += pay;
                        System.out.printf("""
                                => Nộp thành công %,.2f VNĐ. Số dư mới: %,.2f VNĐ
                                +-------------------------------------------------------+
                                """,
                                pay,
                                balance);
                    } else {
                        System.out.println("Số tiền cần nộp phải lớn hơn 0");
                    }
                    break;
                case 3:
                    System.out.println("Nhap so tien can rut: ");
                    double withdraw  = scanner.nextDouble();
                    if (withdraw >0 && withdraw<= balance){
                        balance -=withdraw;
                        System.out.printf("""
                             => Rút thành công %,.2f VNĐ. Số dư mới: %,.2f VNĐ
                            +-------------------------------------------------------+
                            """,
                                withdraw,
                                balance);
                    } else{
                        System.out.print("Số tiền cần rút phải lớn hơn 0 và nhỏ hơn số dư");
                    }
                    break;
                case 4:
                    System.out.print("=> Cảm ơn quý khách đã sử dụng dịch vụ ATM. Xin chào!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn từ 1-4");

            }
        } while (num != 4);
        scanner.close();

    }
}
