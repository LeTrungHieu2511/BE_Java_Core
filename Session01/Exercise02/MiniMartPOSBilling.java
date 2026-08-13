/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.edu.rikkei.session01.ex02;

import java.util.Locale;
import java.util.Scanner;

public class MiniMartPOSBilling {

    public static void main(String[] args) {

        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Khai báo tỷ lệ VAT và chiết khấu
        final double VAT_RATE = 0.08;
        final double DISCOUNT_RATE = 0.05;

        System.out.println("--- HỆ THỐNG THU NGÂN MINIMART POS ---");

        // Nhập thông tin mặt hàng 1
        System.out.print("Nhập tên mặt hàng 1: ");
        String itemName1 = scanner.nextLine();

        System.out.print("Nhập giá mặt hàng 1 (VNĐ): ");
        double price1 = scanner.nextDouble();
        // Xử lý lỗi trôi lệnh sau nextDouble()
        scanner.nextLine();

        // Nhập thông tin mặt hàng 2
        System.out.print("Nhập tên mặt hàng 2: ");
        String itemName2 = scanner.nextLine();

        System.out.print("Nhập giá mặt hàng 2 (VNĐ): ");
        double price2 = scanner.nextDouble();
        // Xử lý lỗi trôi lệnh sau nextDouble()
        scanner.nextLine();

        // Nhập thông tin mặt hàng 3
        System.out.print("Nhập tên mặt hàng 3: ");
        String itemName3 = scanner.nextLine();

        System.out.print("Nhập giá mặt hàng 3 (VNĐ): ");
        double price3 = scanner.nextDouble();

        // Tính tổng tiền của 3 mặt hàng
        double subTotal = 0;
        subTotal += price1;
        subTotal += price2;
        subTotal += price3;

        // Tính tiền VAT
        double vatAmount = subTotal * VAT_RATE;

        // Tính tiền chiết khấu thành viên
        double discountAmount = subTotal * DISCOUNT_RATE;

        // Tính số tiền khách hàng cần thanh toán
        double totalAmount = subTotal + vatAmount - discountAmount;

        // In hóa đơn
        System.out.printf("""
                =====================================================================
                                  HÓA ĐƠN THANH TOÁN MINIMART
                =====================================================================
                STT | Tên mặt hàng                   | Thành tiền (VNĐ)
                ---------------------------------------------------------------------
                1   | %-30s | %,15.2f
                2   | %-30s | %,15.2f
                3   | %-30s | %,15.2f
                ---------------------------------------------------------------------
                TỔNG TIỀN HÀNG (SUBTOTAL)            : %,15.2f
                THUẾ GTGT (VAT 8%%)                  : %,15.2f
                CHIẾT KHẤU THÀNH VIÊN (5%%)          : %,15.2f
                =====================================================================
                TỔNG TIỀN THANH TOÁN (TOTAL)         : %,15.2f
                =====================================================================
                       Cảm ơn Quý khách & Hẹn gặp lại tại MiniMart!
                =====================================================================
                """,
                itemName1, price1,
                itemName2, price2,
                itemName3, price3,
                subTotal,
                vatAmount,
                -discountAmount,
                totalAmount
        );

        // Đóng Scanner sau khi nhập xong
        scanner.close();
    }
}