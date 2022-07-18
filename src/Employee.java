public class Employee {

    private String employeeName;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;

    Employee(String employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        id = counter++;

    }

    public String getEmployeeName() {return this.employeeName;}

    public int getDepartment(){return this.department;}

    public int getSalary(){return this.salary;}

    public int getId(){return this.id;}

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Employee name: " + this.employeeName + " Department: " + this.department + " Salary: " + this.salary +
                " Id:" + this.id;
    }
}
