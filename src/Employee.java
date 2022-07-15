public class Employee {

    private String employeeName;
    private int department;
    private double salary;
    private int id;
    static int counter = 1;

    Employee(String employeeName, int department, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        id = counter++;

    }

    public String getEmployeeName() {return this.employeeName;}

    public int getDepartment(){return this.department;}

    public double getSalary(){return this.salary;}

    public int getId(){return this.id;}

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Employee name: " + this.employeeName + " Department: " + this.department + " Salary: " + this.salary +
                " Id:" + this.id;
    }
}
