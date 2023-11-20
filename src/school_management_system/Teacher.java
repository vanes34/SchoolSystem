package school_management_system;
//this class is responsible for eepoing the track of teacher name
//id , salary,
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryErned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryErned=0;
    }
//RETURN the id
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    //adds to the salary
    //removes from the total money earned by the school
    public void receiveSalary(int salary){
        salaryErned+=salary;
        School.updateTotalMoneySpend( salary );


    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                " totally salary earned so far "+ salaryErned+
                '}';
    }
}
