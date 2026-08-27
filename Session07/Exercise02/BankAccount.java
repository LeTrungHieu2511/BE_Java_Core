package vn.edu.rikkei.Session07.Exercise02;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;

            System.out.printf(
                    "| %-53s |%n",
                    String.format(
                            "[Nạp tiền] +%s VNĐ => Thành công",
                            String.format("%,.2f", amount)
                    )
            );

            System.out.printf(
                    "| %-53s |%n",
                    String.format(
                            "-> Số dư mới: %s VNĐ",
                            String.format("%,.2f", balance)
                    )
            );
        } else {
            System.out.printf(
                    "| %-53s |%n",
                    "[Nạp tiền] => LỖI: SỐ TIỀN KHÔNG HỢP LỆ"
            );
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;

            System.out.printf(
                    "| %-53s |%n",
                    String.format(
                            "[Rút tiền] -%s VNĐ => Thành công",
                            String.format("%,.2f", amount)
                    )
            );

            System.out.printf(
                    "| %-53s |%n",
                    String.format(
                            "-> Số dư hiện tại: %s VNĐ",
                            String.format("%,.2f", balance)
                    )
            );
        } else {
            System.out.printf(
                    "| %-53s |%n",
                    String.format(
                            "[Rút tiền] -%s VNĐ => LỖI: SỐ DƯ KHÔNG ĐỦ",
                            String.format("%,.2f", amount)
                    )
            );
        }
    }

    public void displayBalance() {
        System.out.printf(
                "| %-53s |%n",
                String.format(
                        "-> Số dư hiện tại: %s VNĐ",
                        String.format("%,.2f", balance)
                )
        );
    }
}
