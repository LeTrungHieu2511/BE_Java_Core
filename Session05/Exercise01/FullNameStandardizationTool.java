package vn.edu.rikkei.session05.ex01;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class FullNameStandardizationTool {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                --- CÔNG CỤ CHUẨN HÓA HỌ TÊN HỌC VIÊN ---
                Nhập họ và tên cần chuẩn hóa: """);
        String rawFullName = sc.nextLine();
        //lam sach khoang trang va tach thanh cac tu
        String[] name = rawFullName.trim().split("\\s+");

        //chuan hoa tung tu
        for( int i = 0; i < name.length; i++) {
            name[i] = name[i].substring(0,1).toUpperCase() + name[i].substring(1).toLowerCase();
        }

        //noi thanh ho ten hoan chinh
        String normalizedFullName = String.join(" ", name);

        //tao email
        String email = "";
        String mainName = name[name.length-1].toLowerCase();
        String initials ="";
        for (int i = 0; i < name.length; i++) {
            initials += name[i].substring(0,1).toLowerCase();
        }

        email = mainName + initials + "@rikkei.edu.vn";
        System.out.printf("""
                +-------------------------------------------------------+
                |             KẾT QUẢ CHUẨN HÓA DỮ LIỆU                 |
                +-------------------------------------------------------+
                | Chuỗi gốc:           [%-25s]      |
                | Họ tên chuẩn hóa:    %-32s |
                | Email học viện:      %-32s |
                +-------------------------------------------------------+""",
                rawFullName,
                normalizedFullName,
                email);
        sc.close();
    }
}
