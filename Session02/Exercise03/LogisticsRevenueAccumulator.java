import java.util.Scanner;

public class LogisticsRevenueAccumulator {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- THỐNG KÊ DOANH THU LOGISTICS 12 THÁNG (Đơn vị: Triệu VNĐ) ---");
        int validMonthsCount = 0;
        double totalRevenue = 0,trungBinhThang = 0;
        for (int i =1; i<13;i++){
            System.out.printf("Nhap doanh thu thang %d :",i);
            double revenue = scanner.nextDouble();
            if (revenue <100){
                System.out.printf(" Nhắc nhở: Tháng %d có doanh thu < 100M -> Bỏ qua thống kê bình quân.\n",i);
                continue;
            }
            totalRevenue += revenue;
            validMonthsCount ++;
        }
        if(validMonthsCount != 0){
            trungBinhThang = totalRevenue/validMonthsCount;
        }
        System.out.printf("""
                +-------------------------------------------------------+
                |           BÁO CÁO DOANH THU ĐẠT CHUẨN NĂM             |
                +-------------------------------------------------------+
                | Số tháng đạt tiêu chuẩn (>= 100M): %d tháng           |
                | Tổng doanh thu hợp lệ:             %,.2f Triệu VNĐ |
                | Doanh thu bình quân tháng:         %,.2f Triệu VNĐ   |
                +-------------------------------------------------------+
                """,
                validMonthsCount,
                totalRevenue,
                trungBinhThang);

    }
}
