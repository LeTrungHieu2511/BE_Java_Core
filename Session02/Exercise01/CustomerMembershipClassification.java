import java.util.Scanner;

public class CustomerMembershipClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HE THONG PHAN HANG THANH VIEN CRM");

        System.out.println("Nhap tong chi tieu tich luy (VND): ");
        double totalSpending = scanner.nextDouble();
        double chietKhau = 0;
        String hang;
        if (totalSpending <= 2000000) {
            chietKhau = 2;
            hang = "Dong(Bronze)";
        } else if (totalSpending <= 5000000) {
            chietKhau = 5;
            hang = "Bac(Silver)";
        } else if (totalSpending <= 15000000) {
            chietKhau = 10;
            hang = "Vang(Gold)";
        } else {
            chietKhau = 15;
            hang = "Kim cuong(Diamond)";
        };

        boolean isVip = false;
        if (chietKhau >=10) {
            isVip = true;
        };
        String danhHieu = "Khach hang tieu chuan";
        if (isVip) {
            danhHieu = "Khach hang VIP";
        };

        System.out.printf("""
                +-------------------------------------------------------+
                |              KẾT QUẢ PHÂN HẠNG THÀNH VIÊN             |
                +-------------------------------------------------------+
                | Tổng chi tiêu:               %.2f VNĐ         |
                | Hạng thẻ thành viên:         %s              |
                | Tỷ lệ chiết khấu ưu đãi:     %.1f%%                     |
                | Nhóm khách hàng:             %s           |
                +-------------------------------------------------------+
                """,
                totalSpending,
                hang,
                chietKhau,
                danhHieu
                );
    }
}