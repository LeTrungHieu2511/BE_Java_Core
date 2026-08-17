import java.util.Scanner;

public class md02_ss03_b02 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        double max =0, min = 0;
        int count = 0;
        double tongDiem = 0;
        int chon = 0;

        while (chon !=3){
            System.out.print("""
                ===MENU===
                1. Nhap diem hoc phan
                2. Hien thi thong ke
                3. Thoat
                Lua chon cua ban:  """);

            chon = scanner.nextInt();
            scanner.nextLine();

            double diem = 0;
            String hocLuc;

            if (chon == 1 ) {
                System.out.println("--------Nhap diem hoc vien(Nhap -1 de dung)----------");
                while (diem != -1) {
                    diem = scanner.nextDouble();

                    if (diem == -1){
                        break;
                    }

                    if (diem >= 0 && diem < 5) {
                        hocLuc = "Yeu";
                    } else if (diem >= 5 && diem < 7) {
                        hocLuc = "Trung Binh";
                    } else if (diem >= 7 && diem < 8) {
                        hocLuc = "Kha";
                    } else if (diem >= 8 && diem < 9) {
                        hocLuc = "Gioi";
                    } else if (diem >= 9 && diem <= 10) {
                        hocLuc = "Xuat sac";
                    } else {
                        System.out.println("Diem khong hop le. Vui long nhap lai");
                        continue;
                    }
                    System.out.println("Hoc luc: " + hocLuc);

                    if( count == 0) {
                        max = diem;
                        min = diem;
                    }

                    count++;
                    tongDiem += diem;

                    if (diem > max) {
                        max = diem;
                    }

                    if (diem < min) {
                        min = diem;
                    }

                }

            }
            if (chon == 2) {
                double trungBinh = 0;
                if (count > 0 ) {
                    trungBinh = tongDiem / count;
                    System.out.printf("""
                        ----KET QUA----
                        So hoc vien da nhap : %d
                        Diem trung binh: %.2f
                        Diem cao nhat: %.2f
                        Diem thap nhat: %.2f
                        """,
                            count,
                            trungBinh,
                            max,
                            min);
                } else {
                    System.out.println("Chua co du lieu");
                }


            }

            if (chon == 3) {
                System.out.print("Ket thuc chuong trinh");
                System.exit(0);
            }
        }
    }

}
