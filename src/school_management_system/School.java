package school_management_system;

import java.util.List;

//array list for implementing teacher and students
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpend=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    //adds a teacher to the school
    public void addTeachers(Teacher teacher) {
        teachers.add( teacher );

    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
       students.add (student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
// adds the total money earned by the school
    public static void updateTotalMoneyEarned(int MoneyEarned) {
       totalMoneyEarned = totalMoneyEarned+MoneyEarned;
    }
// returns the total money spend
    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }
//it is going  to update the money that is spent by the school
    //salary given by the school to its teachers
    public static void updateTotalMoneySpend(int MoneySpend) {
        totalMoneyEarned=totalMoneyEarned-MoneySpend;
    }
}
