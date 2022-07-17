import java.util.Arrays;

public class Main {
    public static void printAllEmployeeData(Employee[]employees){
        for (int i = 0; i < employees.length ; i++) {
            if (i < employees.length - 1) {
                System.out.println(employees[i]);
            } else if (employees[i].getEmployeeName() == null) {      // проверка на ноль
                System.out.println(employees[i].getEmployeeName());
            }
        }
    }

    public static void sumSalaryOfEmployee(Employee[]employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Salary volume: " + sum);
    }

    public static void employeeWithMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Min salary of Employee: " + minSalary);
    }

    public static void employeeWithMaxSalary(Employee[] employees) {
        int maxSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Max salary of Employee: " + maxSalary);
    }

    public static void averageSalaryOfEmpoyees(Employee[] employees) {
        int averageSum = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSum += (employees[i].getSalary()/ employees.length);
        }
        System.out.println("Average salary volume: " + averageSum);
    }

    public static void employeeNames(Employee[] employees) {
        for (int i = 0; i < employees.length ; i++) {
            if (i < employees.length - 1) {
                System.out.println(employees[i].getEmployeeName());
            }
        }
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 100_000);
        employees[1] = new Employee("Ivanov Ivan Petrovich", 2, 115_000);
        employees[2] = new Employee("Ivanov Petr Petrovich", 3, 135_000);
        employees[3] = new Employee("Petrov Petr Petrovich", 4, 115_000);
        employees[4] = new Employee("Petrov Petr Sergeevich", 5, 110_000);
        employees[5] = new Employee("Petrov Petr Sergeevich", 5, 110_000);
        employees[6] = new Employee("Petrov Sergey Sergeevich", 2, 120_000);
        employees[7] = new Employee("Sergeev Sergey Sergeevich", 3, 122_000);
        employees[8] = new Employee("Sergeev Sergey Alexandrovich", 1, 128_000);
        employees[9] = new Employee("Sergeev Alexandr Alexandrovich", 4, 123_000);

        printAllEmployeeData(employees);
        sumSalaryOfEmployee(employees);
        employeeWithMinSalary(employees);
        employeeWithMaxSalary(employees);
        averageSalaryOfEmpoyees(employees);
        employeeNames(employees);
    }
}