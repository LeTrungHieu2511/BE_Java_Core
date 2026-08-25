package vn.edu.rikkei.session05.ex03;

import java.util.Scanner;

public class ServerAccessLogAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                        --- MODULE PHÂN TÍCH SERVER ACCESS LOG ---
                        Nhập dòng log:""");
        String logLine = sc.nextLine();

        //tach timestamp
        int timestampStart = logLine.indexOf("[") +1;
        int timestampEnd = logLine.indexOf("]");
        String timestamp = logLine.substring(timestampStart,timestampEnd);

        //tach ip
        int ipStart = logLine.indexOf("IP: ") +4;
        int ipEnd = logLine.indexOf(" |", ipStart);
        String ipAddress = logLine.substring(ipStart,ipEnd);

        //tach status
        int statusStart = logLine.indexOf("STATUS: ")+8;
        int statusEnd = logLine.indexOf(" |",statusStart);
        String statusString = logLine.substring(statusStart,statusEnd);
        int statusCode =Integer.parseInt(statusString);

        //tach msg
        int messageStart = logLine.indexOf("MSG: ") +5;
        String message = logLine.substring(messageStart);

        //kiem tra canh bao
        boolean isError = message.contains("ERROR") || statusCode >=400;

        String warning;
        if( isError) {
            warning = "PHÁT HIỆN LỖI TRUY CẬP (" + statusCode + ")";
        } else {
            warning = "KHÔNG PHÁT HIỆN LỖI";
        }
        System.out.printf("""
                +-------------------------------------------------------+
                |             BÁO CÁO TRÍCH XUẤT NHẬT KÝ LOG            |
                +-------------------------------------------------------+
                | Thời gian (Timestamp):   %-29s|
                | Địa chỉ Client IP:       %-29s|
                | HTTP Status Code:        %-29d|
                | Nội dung thông điệp:     %-29s|
                |-------------------------------------------------------|
                | CẢNH BÁO HỆ THỐNG:       %-29s|
                +-------------------------------------------------------+""",
                timestamp,
                ipAddress,
                statusCode,
                message,
                warning);

        sc.close();
    }
}
