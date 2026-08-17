import java.util.Scanner;

public class md02_ss03_b01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Nhap thong tin hoa don=======");

        System.out.print("Nhap ten khach hang: ");
        String name =scanner.nextLine();

        System.out.print("Nhap ten san pham: ");
        String sanPham =scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        double gia = scanner.nextDouble();

        System.out.print("Nhap so luong mua: ");
        int sL = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Khach co the thanh vien ? (True/False): ");
        String the = scanner.nextLine();

        double thanhTien = gia * sL;
        double giamGia = 0;
        if(the.equalsIgnoreCase("True")) {
            giamGia = thanhTien*10/100;
        };
        double vAT = thanhTien* 8/100;
        double tongTien = thanhTien - giamGia + vAT;
        System.out.printf("""
                ============Hoa don============
                Khach hang: %s
                San pham: %s
                Gia: %.2f
                So luong: %d
                Thanh tien: %.2f
                Giam gia: %.2f
                Tien VAT: %.2f
                Tong tien thanh toan: %.2f
                """,
                name,
                sanPham,
                gia,
                sL,
                thanhTien,
                giamGia,
                vAT,
                tongTien
        );
    }
}
