package vn.edu.rikkei.Session07.Exercise04;

public class Student {

    private String studentId;
    private String fullName;
    private double mathScore;
    private double literatureScore;
    private double englishScore;

    // Constructor 5 tham số
    public Student(String studentId, String fullName,
                   double mathScore, double literatureScore, double englishScore) {

        if (mathScore < 0 || mathScore > 10
                || literatureScore < 0 || literatureScore > 10
                || englishScore < 0 || englishScore > 10) {
            throw new IllegalArgumentException("Điểm phải nằm trong khoảng từ 0.0 đến 10.0");
        }

        this.studentId = studentId;
        this.fullName = fullName;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
    }

    // Tính điểm trung bình
    public double getAverageScore() {
        return (mathScore + literatureScore + englishScore) / 3;
    }

    // Xếp loại học lực
    public String getAcademicStanding() {
        double average = getAverageScore();

        if (average >= 8.0) {
            return "GIỎI (EXCELLENT)";
        } else if (average >= 6.5) {
            return "KHÁ (GOOD)";
        } else if (average >= 5.0) {
            return "TRUNG BÌNH (AVERAGE)";
        } else {
            return "YẾU (WEAK)";
        }
    }

    // Hiển thị hồ sơ học viên
    public void displayStudentProfile() {
        System.out.printf("""
                +-------------------------------------------------------+
                |             HỒ SƠ HỌC TẬP SINH VIÊN                   |
                +-------------------------------------------------------+
                | Mã SV: %-10s | Họ tên: %-25s |
                | Điểm thi: Toán (%-2.1f) | Văn (%-2.1f) | Anh (%-2.1f)          |
                |-------------------------------------------------------|
                | ĐIỂM TRUNG BÌNH: %,-3.2f điểm                            |
                | XẾP LOẠI HỌC LỰC: %-35s |
                +-------------------------------------------------------+
                """,
                studentId,
                fullName,
                mathScore,
                literatureScore,
                englishScore,
                getAverageScore(),
                getAcademicStanding()
        );
    }
}