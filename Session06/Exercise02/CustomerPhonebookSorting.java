package vn.edu.rikkei.Session06.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerPhonebookSorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- CÔNG CỤ SẮP XẾP DANH BẠ VIP ---");

        int n;

        do {
            System.out.print("Nhập số lượng SĐT (N): ");
            n = sc.nextInt();

            if (n < 3 || n > 20) {
                System.out.println("N phải nằm trong khoảng từ 3 đến 20!");
            }

        } while (n < 3 || n > 20);

        String[] phoneList = new String[n];

        // Nhập danh sách số điện thoại
        for (int i = 0; i < n; i++) {

            while (true) {
                System.out.print("Nhập SĐT #" + (i + 1) + ": ");
                String phone = sc.next();

                if (phone.matches("^0[35789]\\d{8}$")) {
                    phoneList[i] = phone;
                    break;
                } else {
                    System.out.println(
                            "SĐT không hợp lệ! Vui lòng nhập lại."
                    );
                }
            }
        }

        System.out.printf("""
            +-------------------------------------------------------+
            |             DANH BẠ KHÁCH HÀNG ĐÃ SẮP XẾP             |
            +-------------------------------------------------------+
            | Danh bạ ban đầu:                                      |
            | -> %-51s|
            |-------------------------------------------------------|
            """,Arrays.toString(phoneList));
        
        for (int i = 0; i < phoneList.length - 1; i++) {
            for (int j = 0; j < phoneList.length - 1 - i; j++) {
                if (phoneList[j].compareTo(phoneList[j + 1]) > 0) {

                    String temp = phoneList[j];
                    phoneList[j] = phoneList[j + 1];
                    phoneList[j + 1] = temp;
                }
            }
        }

        System.out.printf("""
            | Danh bạ theo thứ tự ABC (Tăng dần):                   |
            | -> %-51s|
            +-------------------------------------------------------+
            """, Arrays.toString(phoneList));

        sc.close();
    }
}