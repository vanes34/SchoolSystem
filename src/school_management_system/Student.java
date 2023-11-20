package school_management_system;
// this class is too important because it keeps track of students
public class Student {
  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;

    /**
     *
     */
    public Student(int id, String name, int grade) {
        //initializing all the fields
        feesPaid=0;
        feesTotal=2500;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
// used to update the grade
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void payFees(int fees){
        feesPaid=feesPaid+fees;
        School.updateTotalMoneyEarned (feesPaid);

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    //return the remaining fees
   public int getRemainingFees(){
       return feesTotal-feesPaid;
   }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", total fees paid so far = "+ feesPaid+
                '}';
    }
}
