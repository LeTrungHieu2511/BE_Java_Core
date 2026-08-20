package vn.edu.rikkei.session04.ex03;

import java.util.Scanner;
import java.util.Arrays;

public class WeatherStationTemperatureMatrix {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- NHẬP DỮ LIỆU QUAN TRẮC NHIỆT ĐỘ 7 NGÀY (7x3) ---");
        double[][] tempMatrix = new double[8][4];
        double aWeek=0, aMorning=0, aAfternoon=0, aEvening=0;
        double tongNgay=0;
        String dayAWeek;

        for (int i = 0; i <  8 ; i++) {

            if (i ==6) {
                dayAWeek = "Chủ nhật";
            } else {
                dayAWeek = "Thứ " + (i+2);
            }
            if (i == 7) {
                tempMatrix[i][0]= aMorning/7;
                tempMatrix[i][1]= aAfternoon/7;
                tempMatrix[i][2]= aEvening/7;
                tempMatrix[i][3]= aWeek/7;
                continue;
            }

            System.out.printf("[Ngày %d - %s] ",i+1,dayAWeek);

            for (int j = 0; j < 4 ; j++) {
                if (j ==0) {
                    System.out.printf("%-7s","Sáng: ");
                }
                if (j ==1) {
                    System.out.printf("| %-7s","Trưa: ");
                }
                if (j ==2) {
                    System.out.printf("| %-7s","Tối: ");
                }
                if (j ==3) {
                    tempMatrix[i][j] = tongNgay/3;
                    aWeek +=tempMatrix[i][j];
                    tongNgay=0;
                    continue;
                }
                tempMatrix[i][j] = sc.nextDouble();
                tongNgay+=tempMatrix[i][j];
            }
            aMorning +=tempMatrix[i][0];
            aAfternoon +=tempMatrix[i][1];
            aEvening +=tempMatrix[i][2];
        }

        System.out.print("""
                +-----------------------------------------------------------------+
                |              BẢN ĐỒ NHIỆT ĐỘ KHÍ TƯỢNG TUẦN (7x3)               |
                +-----------------------------------------------------------------+
                | Ngày        | Sáng 06h   | Trưa 12h   |  Tối 18h   | TB Ngày    |
                |-------------+------------+------------+------------+------------|
                """);

        for (int i = 0; i < 8 ;i++ ) {
            if ( i== 6) {
                dayAWeek ="Chủ nhật";
            } else if (i == 7) {
                System.out.println("+-----------------------------------------------------------------+");
                dayAWeek = "TB CẢ TUẦN ";
            } else {
                dayAWeek = "Thứ " + (i+2);
            }

            System.out.printf("| %-11s | %7.2f °C | %7.2f °C | %7.2f °C | %7.2f °C |\n",
                    dayAWeek,
                    tempMatrix[i][0],
                    tempMatrix[i][1],
                    tempMatrix[i][2],
                    tempMatrix[i][3]
            );

        }
        System.out.println("+-----------------------------------------------------------------+");
    }
}
