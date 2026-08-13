/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.edu.rikkei.session01.ex01;

import java.util.Scanner;

public class LibraryCardRegistration {

    public static void main(String[] args) {

        // Khởi tạo đối tượng để có thể nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- HỆ THỐNG ĐĂNG KÝ THẺ THƯ VIỆN SỐ ---");

        // Nhập mã thẻ
        System.out.print("Nhập mã thẻ độc giả: ");
        String cardId = scanner.nextLine();

        // Nhập họ và tên
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();

        // Nhập tuổi
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        // lưu lại 1 nút enter
        // sử dụng thêm nextLine()
        scanner.nextLine();

        // Nhập giới tính
        System.out.print("Nhập giới tính (Nam/Nữ): ");
        String gender = scanner.nextLine();

        // Nhập tiền đặt cọc
        System.out.print("Nhập tiền đặt cọc (VNĐ): ");
        double depositAmount = scanner.nextDouble();

        // Xử lý lỗi trôi lệnh sau nextDouble()
        scanner.nextLine();

        // Nhập email
        System.out.print("Nhập email liên hệ: ");
        String email = scanner.nextLine();

    
        System.out.printf("""
                +-------------------------------------------------------------------+
                |               PHIẾU XÁC NHẬN ĐĂNG KÝ THẺ ĐỘC GIẢ                  |
                +-------------------------------------------------------------------+
                | Mã thẻ         : %-49s |
                | Họ và tên      : %-49s |
                | Tuổi           : %-49s |
                | Giới tính      : %-49s |
                | Tiền đặt cọc   : %,.2f VNĐ%37s |
                | Email liên hệ  : %-49s |
                +-------------------------------------------------------------------+
                | Trạng thái     : %-49s |
                +-------------------------------------------------------------------+
                """,
                cardId,
                fullName,
                age + " tuổi",
                gender,
                depositAmount,
                "",
                email,
                "THÀNH CÔNG - Hợp lệ kích hoạt thẻ thư viện"
        );
        

        // Đóng Scanner
        scanner.close();
    }
}