package vn.edu.rikkei.session05.ex04;

import java.util.Scanner;

public class PalindromeStringVerification {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                --- CÔNG CỤ KIỂM TRA CHUỖI ĐỐI XỨNG PALINDROME ---
                Nhập chuỗi văn bản: """);
        String inputText = sc.nextLine();

        //lam sach chuoi
        String cleanedText = inputText.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        //tao stringbuilder tu chuoi da lam sach
        StringBuilder sb = new StringBuilder(cleanedText);
        //dao nguoi chuoi
        String reversedText = sb.reverse().toString();

        // so sanh chuoi ban dau voi chuoi daao nguoc
        boolean isPalindrome = cleanedText.equals(reversedText);
        String check ="";
        if (isPalindrome) {
            check = "LÀ CHUỖI ĐỐI XỨNG PALINDROME HOÀN HẢO";
        } else {
            check = "KHÔNG PHẢI CHUỖI ĐỐI XỨNG PALINDROME";
        }
        System.out.printf("""
                +-------------------------------------------------------+
                |           KẾT QUẢ PHÂN TÍCH CHUỖI ĐỐI XỨNG            |
                +-------------------------------------------------------+
                | Chuỗi gốc:           %-32s|
                | Chuỗi làm sạch:      %-32s|
                | Chuỗi đảo ngược:     %-32s|
                |-------------------------------------------------------|
                | KẾT LUẬN:     %-32s|
                +-------------------------------------------------------+""",
                inputText,
                cleanedText,
                reversedText,
                check);
        sc.close();
    }
}
