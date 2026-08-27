package vn.edu.rikkei.Session07.Exercise04;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student("SV-001", "Nguyễn Văn An", 8.5, 7.5, 9.0),
                new Student("SV-002", "Trần Văn Bình", 7.0, 6.5, 7.5),
                new Student("SV-003", "Lê Thị Hoa", 5.0, 5.5, 6.0),
                new Student("SV-004", "Phạm Văn Nam", 4.0, 4.5, 4.0)
        };

        for (Student student : students) {
            student.displayStudentProfile();
        }
    }
}