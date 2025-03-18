import java.util.ArrayList;
public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
    
        students.add(new Student("isul", 89));
        students.add(new Student("sanchtha", 78));
        students.add(new Student("penda", 91));
        students.add(new Student("mora", 72));
        students.add(new Student("batta", 88));
    

        int totalMarks = 0;
            for (Student s : students) {
                totalMarks += s.getMarks();
            }

        double average = (double) totalMarks / students.size();

        System.out.println("Average Marks of Students: " + average);
    }
}