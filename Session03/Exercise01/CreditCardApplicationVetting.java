import java.util.Scanner;

public class CreditCardApplicationVetting {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- HỆ THỐNG THẨM ĐỊNH HỒ SƠ TÍN DỤNG RIKKEI BANK ---");

        System.out.print("Nhập họ tên người nộp đơn: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhập độ tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập thu nhập ròng tháng (VNĐ): ");
        double monthlyIncome = scanner.nextDouble();

        System.out.print("Khách hàng có nợ xấu không? (true/false): ");
        boolean hasBadDebt = scanner.nextBoolean();
        double creditLimit =0;
        String isApproved ;

        if ( age <20 || age >60 ) {
            isApproved  = "Ngoai do tuoi quy dinh";
        } else if (hasBadDebt == true) {
            isApproved = "Lich su tin dung co no xau";
        } else if (monthlyIncome < 10000000) {
            isApproved = "Thu nhap duoi muc toi thieu 10 trieu VND";
        } else {
            isApproved = "DAT YEU CAU";
            creditLimit = monthlyIncome * 3;
        }

        String noXau ;
        if (hasBadDebt == false) {
            noXau ="Khong co";
        } else {
            noXau = "Co";
        }

        System.out.printf("""
                +-------------------------------------------------------+
                |              KẾT QUẢ THẨM ĐỊNH TÍN DỤNG               |
                +-------------------------------------------------------+
                | Người nộp đơn:               %s           |
                | Tuổi:                        %d tuổi                  |
                | Thu nhập tháng:              %,.2f VNĐ        |
                | Trạng thái nợ xấu:           %s                 |
                |-------------------------------------------------------|
                | KẾT QUẢ PHÊ DUYỆT:           %s              |
                | HẠN MỨC THẺ ĐƯỢC CẤP:        %,.2f VNĐ        |
                +-------------------------------------------------------+
                
                """,
                fullName,
                age,
                monthlyIncome,
                noXau,
                isApproved,
                creditLimit

        );

    }
}
