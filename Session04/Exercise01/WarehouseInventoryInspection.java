package vn.edu.rikkei.session04.ex01;

import java.util.Scanner;
import java.util.Arrays;
public class WarehouseInventoryInspection {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                --- HỆ THỐNG KIỂM KÊ TỒN KHO TRUNG CHUYỂN ---
                Nhập số mặt hàng cần kiểm kê (N):""");
        int N = sc.nextInt();
        sc.nextLine();

        while (N<3 || N> 50) {
            System.out.print("N phải từ 3 đến 50. Nhập lại: ");
            N= sc.nextInt();
        }

        int[] stock = new int[N];
        for (int i = 0; i<N ; i++) {
            System.out.printf("Nhập số lượng tồn Mã hàng #%d:",i);
            stock[i] = sc.nextInt();
            while (stock[i] < 0) {
                System.out.print("Số lượng phải >= 0. Nhập lại: ");
                stock[i] = sc.nextInt();
            }

        }
        int minStock = stock[0], minIndex = 0;
        int total = stock[0];
        for (int i = 1; i<N; i++) {
            total +=stock[i];
            if ( stock[i] < minStock) {
                minStock = stock[i];
                minIndex = i;
            }
        }
        double averageInventory = total*1.0/N;

        System.out.printf("""
                +-------------------------------------------------------+
                |              BÁO CÁO KIỂM KÊ TỒN KHO HÀNG             |
                +-------------------------------------------------------+
                | Danh sách tồn kho:           %-22s   |
                | Tổng sản phẩm tồn kho:       %-3d sản phẩm             |
                | Tồn kho bình quân:           %-6.2f sản phẩm/mã       |
                |-------------------------------------------------------|
                | CẢNH BÁO NHẬP HÀNG KHẨN CẤP:                          |
                |  -> Mã hàng #%-3d có tồn kho thấp nhất: %-3d sản phẩm   |
                +-------------------------------------------------------+""",
                Arrays.toString(stock),
                total,
                averageInventory,
                minIndex,
                minStock
                );

    }
}
