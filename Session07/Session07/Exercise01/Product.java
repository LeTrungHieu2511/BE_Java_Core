package vn.edu.rikkei.Session07.Exercise01;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor không tham số
    public Product() {
        this.productId = "PRD-000";
        this.productName = "Chưa đặt tên";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor có 4 tham số
    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Tính tổng giá trị tồn kho
    public double getTotalStockValue() {
        return price * quantity;
    }

    // Hiển thị thông tin sản phẩm
    public void displayProductInfo() {
        System.out.printf(
                "%s | %s | SL: %d%n",
                productId,
                productName,
                quantity
        );

        System.out.printf("""
                |-> Giá bán: %,.2f VNĐ | 
                | Tổng giá trị kho: %,.2f VNĐ|\n""",
                price,
                getTotalStockValue()
        );
    }
}