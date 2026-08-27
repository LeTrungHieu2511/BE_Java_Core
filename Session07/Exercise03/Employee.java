package vn.edu.rikkei.Session07.Exercise03;

public class Employee {

    private String empId;
    private String empName;
    private double baseSalary;
    private double rate;
    private double allowance;


    public Employee(String empId, String empName, double baseSalary, double rate, double allowance) {
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
        this.rate = rate;
        this.allowance = allowance;
    }

    // Tính lương thực lĩnh
    public double calculateTotalSalary() {
        return baseSalary * rate + allowance;
    }


    public void displayPayrollTicket() {
        System.out.printf("""
                +-------------------------------------------------------+
                |             PHIẾU LƯƠNG NHÂN VIÊN RIKKEI              |
                +-------------------------------------------------------+
                | Mã NV: %-8s | Họ tên: %-27s |
                | Lương cơ bản: %,-10.0f VNĐ | Hệ số: %-5.2f           |
                | Phụ cấp: %,-40.0f VNĐ |
                |-------------------------------------------------------|
                | -> THU NHẬP THỰC LĨNH: %,-26.2f VNĐ |
                +-------------------------------------------------------+
                """,
                empId,
                empName,
                baseSalary,
                rate,
                allowance,
                calculateTotalSalary()
        );
    }
}