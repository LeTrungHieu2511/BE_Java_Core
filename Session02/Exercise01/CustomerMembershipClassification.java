import java.util.Scanner;

public class CustomerMembershipClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HE THONG PHAN HANG THANH VIEN CRM");

        System.out.println("Nhap tong chi tieu tich luy (VND): ");
        double totalSpending = scanner.nextDouble();
        double discount = 0;
        String rank;
        if (totalSpending <= 2000000) {
            discount = 2;
            rank = "Dong(Bronze)";
        } else if (totalSpending <= 5000000) {
            discount = 5;
            rank = "Bac(Silver)";
        } else if (totalSpending <= 15000000) {
            discount = 10;
            rank = "Vang(Gold)";
        } else {
            discount = 15;
            rank = "Kim cuong(Diamond)";
        }

        boolean isVip = false;
        if (discount >=10) {
            isVip = true;
        }
        String title = "Khach hang tieu chuan";
        if (isVip) {
            title = "Khach hang VIP";
        }

        System.out.printf("""
                +-------------------------------------------------------+
                |              KẾT QUẢ PHÂN HẠNG THÀNH VIÊN             |
                +-------------------------------------------------------+
                | Tổng chi tiêu:               %,.2f VNĐ         |
                | Hạng thẻ thành viên:         %s              |
                | Tỷ lệ chiết khấu ưu đãi:     %,.1f%%                     |
                | Nhóm khách hàng:             %s           |
                +-------------------------------------------------------+
                """,
                totalSpending,
                rank,
                discount,
                title
                );
        scanner.close();
    }
}
