package vn.edu.rikkei.Session07.Exercise02;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "ACC-999",
                "Nguyễn Văn An",
                5000000
        );

        System.out.print("""
                +-------------------------------------------------------+
                |             NHẬT KÝ GIAO DỊCH RIKKEI BANK             |
                +-------------------------------------------------------+
                """);

        account.deposit(2500000);

        System.out.println("|-------------------------------------------------------|");

        account.withdraw(10000000);

        System.out.println("|-------------------------------------------------------|");

        account.withdraw(3000000);

        System.out.println("+-------------------------------------------------------+");
    }
}