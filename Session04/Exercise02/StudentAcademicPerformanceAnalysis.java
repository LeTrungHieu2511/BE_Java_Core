package vn.edu.rikkei.session04.ex01;

import java.util.Scanner;
import java.util.Arrays;

public class StudentAcademicPerformanceAnalysis {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                --- HỆ THỐNG PHÂN TÍCH HỌC LỰC JAVA CORE ---
                Nhập số lượng học viên (N): """);
        int N = sc.nextInt();
        sc.nextLine();

        double[] scores = new double[N];
        for (int i =0; i<N ; i++) {
            System.out.printf("Nhập điểm HV #%d: ",i);
            scores[i] = sc.nextDouble();
            while (scores[i] <0 || scores[i] >10) {
                System.out.print("Diem thi khong hop le, vui long nhap lai: ");
                scores[i] = sc.nextDouble();
            }
        }

        double maxScore = scores[0];
        int count =0;
        String danhSach ="";
        for (int i =0 ; i<N ; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            if(scores[i] >= 8) {
                count++;
                danhSach += String.format("HV #%d (%.1f) | ",i,scores[i]);
            }
        }
        double tiLe=count*100.0/N;

        System.out.printf("""
                +-------------------------------------------------------+
                |            PHÂN TÍCH KẾT QUẢ THI JAVA CORE            |
                +-------------------------------------------------------+
                | Điểm thi lớp:      %-34s |
                | Điểm cao nhất:     %-3.1f điểm (Thủ khoa)                |
                | Số học viên Giỏi:  %-3d học viên (Tỷ lệ: %-5.1f%%)       |
                | Danh sách HV Giỏi: %-34s |
                +-------------------------------------------------------+
                """,
                Arrays.toString(scores),
                maxScore,
                count,
                tiLe,
                danhSach
        );
    }
}
