package vn.edu.rikkei.Session07.Exercise03;

public class Main {

    public static void main(String[] args) {

        Employee[] team = new Employee[3];

        team[0] = new Employee(
                "EMP-001",
                "Trần Văn Bình",
                5000000,
                2.5,
                800000
        );

        team[1] = new Employee(
                "EMP-002",
                "Lê Thị Hoa",
                5000000,
                3.0,
                1000000
        );

        for (Employee employee : team) {
            if (employee != null) {
                employee.displayPayrollTicket();
            }
        }
    }
}