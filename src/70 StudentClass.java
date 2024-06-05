class StudentClass {

    String Student_Name;
    int Student_iD;
    String Department;
    double marks;

    public StudentClass(String student_Name, int student_iD, String department, double marks) {
        Student_Name = student_Name;
        Student_iD = student_iD;
        Department = department;
        this.marks = marks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentClass{");
        sb.append("Student_Name='").append(Student_Name).append('\'');
        sb.append(", Student_iD=").append(Student_iD);
        sb.append(", Department='").append(Department).append('\'');
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }



    public static void main(String[] args) {

        StudentClass amit = new StudentClass("amit",001,"CSE",567);
        System.out.println(amit);

    }
}
