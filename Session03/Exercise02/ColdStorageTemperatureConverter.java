package vn.edu.rikkei.session03.ex02;

import java.util.Scanner;

public class ColdStorageTemperatureConverter {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                --- CÔNG CỤ QUY ĐỔI NHIỆT ĐỘ KHO LẠNH VACCINE ---
                1. Nhập độ C (Celsius) | 2. Nhập độ F (Fahrenheit) | 3. Nhập độ K (Kelvin)
                Chọn đơn vị gốc (1-3):  """
        );

        int chon = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập giá trị nhiệt độ: ");
        double temp = sc.nextDouble();
        double tempF, tempC, tempK;
        final double KELVIN_OFFSET = 273.15, FAHRENHEIT_OFFSET = 32;

        switch(chon) {
            case 1: {
                tempC = temp;
                tempK = tempC + KELVIN_OFFSET;
                tempF = tempC * 9 / 5 + FAHRENHEIT_OFFSET;
                break;
            }
            case 2: {
                tempF = temp;
                tempC = (tempF - FAHRENHEIT_OFFSET) * 5.0 / 9.0;
                tempK = tempC + KELVIN_OFFSET;
                break;
            }
            case 3: {
                tempK = temp;
                tempC = tempK - KELVIN_OFFSET;
                tempF = tempC * 9 / 5 + FAHRENHEIT_OFFSET;
                break;
            }
            default: {
                System.out.print("Vui long nhap trong khoang 1-3");
                return;
            }
        }
        String trangThai;
        final double SAVE_MAX= 8, SAVE_MIN = -2;
        if ( tempC >= SAVE_MIN && tempC <= SAVE_MAX) {
            trangThai = "AN TOÀN - ĐẠT CHUẨN BẢO QUẢN";
        } else {
            trangThai = "CẢNH BÁO NGUY HIỂM - VI PHẠM DẢI NHIỆT ĐỘ VACCINE";
        }
        System.out.printf("""
                    +-------------------------------------------------------+
                    |           BẢNG QUY ĐỔI NHIỆT ĐỘ KHO BẢO QUẢN          |
                    +-------------------------------------------------------+
                    | Nhiệt độ Celsius (C):        %.2f °C                  |
                    | Nhiệt độ Fahrenheit (F):     %.2f °F                 |
                    | Nhiệt độ Kelvin (K):         %.2f K                 |
                    |-------------------------------------------------------|
                    | ĐÁNH GIÁ AN TOÀN:     %s    |
                    +-------------------------------------------------------+
                    """,
                tempC,
                tempF,
                tempK,
                trangThai
        );
        sc.close();

    }
}
