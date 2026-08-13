/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.edu.rikkei.session01.ex03;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyExchangeCasting {

    public static void main(String[] args) {

        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("--- MODULE QUY ĐỔI NGOẠI TỆ & KIỂM TOÁN HỐI ĐOÁI ---");

        // Nhập tỷ giá và số lượng ngoại tệ
        System.out.print("Nhập tỷ giá USD -> VNĐ : ");
        double usdRate = scanner.nextDouble();

        System.out.print("Nhập tỷ giá EUR -> VNĐ : ");
        double eurRate = scanner.nextDouble();

        System.out.print("Nhập số lượng USD     : ");
        double usdAmount = scanner.nextDouble();

        System.out.print("Nhập số lượng EUR     : ");
        double eurAmount = scanner.nextDouble();

        // Tính số tiền quy đổi từ USD và EUR sang VNĐ
        double usdToVndDouble = usdAmount * usdRate;
        double eurToVndDouble = eurAmount * eurRate;

        // Tính tổng số tiền VNĐ trước khi ép kiểu
        double totalVndDouble = usdToVndDouble + eurToVndDouble;

        /*
         * Khi ép kiểu từ double sang long, phần thập phân sẽ bị cắt bỏ
         * chứ không được làm tròn. Đây là kiểu ép dữ liệu thu hẹp
         * (Narrowing Casting), có thể làm mất độ chính xác.
         */
        long officialVndAmount = (long) totalVndDouble;

        // Tính phần tiền lẻ bị mất sau khi ép kiểu
        double truncationLoss = totalVndDouble - (double) officialVndAmount;

        // Ép kiểu ngầm định từ long sang double
        double auditReportValue = officialVndAmount;

        // Tính số tờ 500.000 VNĐ và số tiền còn lại
        long numberOf500k = officialVndAmount / 500000;
        long remainingAmount = officialVndAmount % 500000;

        /*
         * Biến nguyên thủy như int, long, double thường được lưu trong Stack
         * khi chúng là biến cục bộ.
         * String là kiểu đối tượng tham chiếu, đối tượng String được lưu trên Heap,
         * còn biến tham chiếu đến String có thể nằm trên Stack.
         */

        // In báo cáo
        System.out.printf("""
                +-------------------------------------------------------------------+
                |               BÁO CÁO CHUYỂN ĐỔI NGOẠI TỆ HỐI ĐOÁI                |
                +-------------------------------------------------------------------+
                | 1. Giá trị USD chuyển đổi (double)  : %,20.2f VNĐ |
                | 2. Giá trị EUR chuyển đổi (double)  : %,20.2f VNĐ |
                | 3. Tổng giá trị chính xác (double)  : %,20.2f VNĐ |
                +-------------------------------------------------------------------+
                | QUY TRÌNH ÉP KIỂU DỮ LIỆU (TYPE CASTING ANALYSIS)                 |
                | - Chốt sổ kế toán (Narrowing -> long) : %15d VNĐ     |
                | - Phần dư thập phân bị cắt (Loss)    : %15.2f VNĐ     |
                | - Giá trị kiểm toán (Widening -> dbl) : %,13.2f VNĐ |
                +-------------------------------------------------------------------+
                | PHÂN TÍCH CHI TRẢ TIỀN MẶT (MỆNH GIÁ 500,000 VNĐ)                 |
                | - Số tờ tiền 500,000 VNĐ tối đa       : %15d tờ       |
                | - Số tiền lẻ còn lại (Toán tử %%)    : %,15d VNĐ     |
                +-------------------------------------------------------------------+
                """,
                usdToVndDouble,
                eurToVndDouble,
                totalVndDouble,
                officialVndAmount,
                truncationLoss,
                auditReportValue,
                numberOf500k,
                remainingAmount
        );

        // Đóng Scanner
        scanner.close();
    }
}