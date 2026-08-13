/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.edu.rikkei.session01.ex04;

import java.util.Scanner;

public class LogisticsFleetSafetyCheck {

    public static void main(String[] args) {

        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- HỆ THỐNG KIỂM ĐỊNH AN TOÀN ĐỘI XE LOGISTICS ---");

        // Nhập thông tin xe
        System.out.print("Nhập mã xe tải                   : ");
        String truckId = scanner.nextLine();

        System.out.print("Nhập lượng nhiên liệu hiện có (L): ");
        double currentFuel = scanner.nextDouble();

        System.out.print("Nhập mức hiệu suất (km/L)        : ");
        double efficiency = scanner.nextDouble();

        System.out.print("Nhập tải trọng thực tế (Tấn)     : ");
        double currentWeight = scanner.nextDouble();

        System.out.print("Nhập tải trọng tối đa (Tấn)      : ");
        double maxWeight = scanner.nextDouble();

        System.out.print("Nhập trạng thái bảo dưỡng (true/false): ");
        boolean isMaintained = scanner.nextBoolean();

        // Tính quãng đường tối đa xe có thể đi
        double maxDistance = currentFuel * efficiency;

        // Kiểm tra các tiêu chí an toàn
        boolean isFuelOk = maxDistance >= 200.0;
        boolean isWeightOk = currentWeight <= maxWeight;

        // Xe chỉ được xuất bến khi cả 3 tiêu chí đều đạt
        boolean isReadyToDepart = isFuelOk && isWeightOk && isMaintained;

        // Cảnh báo nếu xe quá tải hoặc lượng nhiên liệu quá thấp
        boolean isWarning = (currentWeight > maxWeight)
                || (currentFuel < 30.0);

        // Kiểm tra sự khác nhau giữa hậu tố và tiền tố
        int inspectionCount = 1;

        int postfixResult = inspectionCount++;
        int prefixResult = ++inspectionCount;

        // In báo cáo
        System.out.printf("""
                =====================================================================
                            BÁO CÁO KIỂM ĐỊNH XUẤT BẾN XE LOGISTICS
                =====================================================================
                Mã phương tiện               : %s
                Quãng đường tối đa khả thi   : %.2f km
                ---------------------------------------------------------------------
                CỜ ĐÁNH GIÁ TIÊU CHÍ (BOOLEAN FLAGS):
                - Tiêu chí Nhiên liệu (>=200km) : %s
                - Tiêu chí Tải trọng (<=%.0f Tấn) : %s
                - Tiêu chí Bảo dưỡng định kỳ    : %s
                ---------------------------------------------------------------------
                CẢNH BÁO KHẨN CẤP (OR CHECK) : %s
                =====================================================================
                QUYẾT ĐỊNH XUẤT BẾN (AND CHECK): %s
                =====================================================================
                [Kiểm thử toán tử ++]: Lần kiểm định hậu tố (count++) : %d
                [Kiểm thử toán tử ++]: Lần kiểm định tiền tố (++count) : %d
                =====================================================================
                """,
                truckId,
                maxDistance,
                isFuelOk,
                maxWeight,
                isWeightOk,
                isMaintained,
                isWarning,
                isReadyToDepart,
                postfixResult,
                prefixResult
        );

        // Đóng Scanner
        scanner.close();
    }
}