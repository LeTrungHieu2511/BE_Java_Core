package vn.edu.rikkei.Session06.ex01;

import java.util.Scanner;

public class SearchQueryKeywordStandardization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                --- HỆ THỐNG LÀM SẠCH TỪ KHÓA TRUY VẤN ---
                Nhập chuỗi truy vấn thô: """);

        String rawQuery = sc.nextLine();

        // 1. Thay ký tự đặc biệt bằng khoảng trắng
        String cleanedQuery = rawQuery.replaceAll("[^a-zA-Z0-9\\s]", " ").toLowerCase().trim();

        // 2. Tách thành các từ khóa
        String[] words;

        // Trường hợp người dùng nhập toàn ký tự đặc biệt
        if (cleanedQuery.isEmpty()) {
            words = new String[0];
        } else {
            words = cleanedQuery.split("\\s+");
        }


        System.out.printf("""
                +-------------------------------------------------------+
                |             KẾT QUẢ LÀM SẠCH TỪ KHÓA SEO              |
                +-------------------------------------------------------+
                | Chuỗi truy vấn gốc:  %-34s|
                | Số từ khóa hợp lệ:   %-32d |
                |-------------------------------------------------------|
                """,
                rawQuery,
                words.length
        );
        for (int i = 0; i < words.length; i++) {
            System.out.printf(
                    "| [%d] %-15s  (%d ký tự)%24s|%n",
                    i + 1,
                    words[i],
                    words[i].length(),
                    ""
            );
        }

        System.out.println("+-------------------------------------------------------+");

        sc.close();
    }
}