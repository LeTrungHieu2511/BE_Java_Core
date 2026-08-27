package vn.edu.rikkei.session07.ex01;

public class Main {
    public static void main(String[] args) {

        // Khởi tạo SP1 bằng constructor mặc định
        Product sp1 = new Product();

        // Khởi tạo SP2 bằng constructor có tham số
        Product sp2 = new Product(
                "PRD-001",
                "Bàn phím cơ Dell",
                1250000,
                15
        );

        System.out.print("""
            +-------------------------------------------------------+
            |             THÔNG TIN CHI TIẾT SẢN PHẨM               |
            +-------------------------------------------------------+
            """);
        System.out.print("| [SP1] ");
        sp1.displayProductInfo();

        System.out.println("|-------------------------------------------------------|");

        System.out.print("| [SP2] ");
        sp2.displayProductInfo();

        System.out.println("+-------------------------------------------------------+");
    }
}
