package vn.edu.rikkei.session05.ex02;

import java.util.Scanner;

public class EmailPhoneRegexValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //regex email
        final String REGEX_EMAIL = "^[\\w.-]+@(rikkei\\.edu\\.vn|gmail\\.com)$";
        //regex sdt
        final String REGEX_PHONE = "^(03|05|07|08|09)[0-9]{8}$";

        //nhap email
        System.out.print("""
                --- HỆ THỐNG THẨM ĐỊNH FORM ĐĂNG KÝ ONLINE ---
                Nhập địa chỉ Email: """);
        String email = sc.nextLine();

        //nhap sdt
        System.out.print("Nhập Số điện thoại: ");
        String phone = sc.nextLine();

        boolean emailValid = email.matches(REGEX_EMAIL);
        boolean phoneValid = phone.matches(REGEX_PHONE);
        String emailCheck ="HỢP LỆ (Valid)";
        String phoneCheck ="HỢP LỆ (Valid)";
        String check ="HỒ SƠ ĐẠT CHUẨN ĐỊNH DẠNG";
        if (!emailValid ) {
            emailCheck = "Email sai định dạng";
            check = "HỒ SƠ CHƯA ĐẠT CHUẨN ĐỊNH DẠNG";
        }
        if (!phoneValid ) {
            phoneCheck = "Phone sai định dạng";
            check = "HỒ SƠ CHƯA ĐẠT CHUẨN ĐỊNH DẠNG";
        }
        System.out.printf("""
                +-------------------------------------------------------+
                |             KẾT QUẢ XÁC THỰC DỮ LIỆU REGEX            |
                +-------------------------------------------------------+
                | Email đăng ký:       %-33s|
                | Trạng thái Email:    %-33s|
                |-------------------------------------------------------|
                | SĐT đăng ký:         %-33s|
                | Trạng thái SĐT:      %-33s|
                |-------------------------------------------------------|
                | KẾT QUẢ CHUNG:       %-33s|
                +-------------------------------------------------------+""",
                email,
                emailCheck,
                phone,
                phoneCheck,
                check);
        sc.close();
    }
}
