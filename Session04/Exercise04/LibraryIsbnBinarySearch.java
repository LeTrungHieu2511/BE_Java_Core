package vn.edu.rikkei.session04.ex01;

import java.util.Scanner;

public class LibraryIsbnBinarySearch {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int[] isbnList = {101, 105, 110, 125, 140, 155, 170, 188, 195, 200};;
        int left = 0, right = isbnList.length;
        System.out.print("""
                --- HỆ THỐNG TRA CỨU SÁCH ISBN THƯ VIỆN QUỐC GIA ---
                Danh mục ISBN: [101, 105, 110, 125, 140, 155, 170, 188, 195, 200]
                Nhập mã ISBN cần tra cứu: """);
        int targetIsbn = sc.nextInt(), index = -1, steps  =0;
        String find;
        sc.nextLine();

        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;
            if(isbnList[mid] == targetIsbn) {
                index = mid;
                break;
            } else if( isbnList[mid] < targetIsbn) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        if (index ==-1) {
            find = "Khong tim thay";
        } else{
            find = "Tim thay tren ke sach";
        }
        System.out.printf("""
                +-------------------------------------------------------+
                |             KẾT QUẢ TRA CỨU NHỊ PHẦN ISBN             |
                +-------------------------------------------------------+
                | Mã ISBN tra cứu:     %d                              |
                | Trạng thái:          %s            |
                | Vị trí lưu trữ:      Kệ số #%d (Index %d)               |
                | Hiệu năng tìm kiếm:  Hoàn thành sau %d bước chia đôi   |
                +-------------------------------------------------------+""",
                targetIsbn,
                find,
                index,
                index,
                steps

        );
    }
}
