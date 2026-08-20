package vn.edu.rikkei.session02.ex04;

import java.util.Scanner;

public class SecurityPinAuthentication {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        final String SECRET_PIN = "889900";
        int maxAttempts = 1;
        while (maxAttempts <=3) {
            System.out.printf("[Lần %d/3] Nhập mã PIN bảo mật: ",maxAttempts);
            String matKhau =  scanner.nextLine();

            if (matKhau.equals(SECRET_PIN)) {
                System.out.print("""
                        +-------------------------------------------------------+
                        |  XÁC THỰC THÀNH CÔNG — CHÀO MỪNG QUẢN TRỊ VIÊN!       |
                        +-------------------------------------------------------+
                        
                        """);
                break;
            }
            System.out.printf(" => Mật khẩu không chính xác! Bạn còn %d lần thử.\n",3-maxAttempts);
            maxAttempts++;
        }
        System.out.print(" Tài khoản bị quá do đã hết 3 lần thử");
        scanner.close();

    }
}
