package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
    private Double age;
    private Double salary;
    private String name;

    public Employee(Double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

public class Ques2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(21.0, 50000.0, "Simran Kaur"));
        employees.add(new Employee(25.0, 70000.0, "Annie Chugh"));
        employees.add(new Employee(17.0, 60000.0, "Dilpreet Singh"));
        employees.add(new Employee(28.0, 40000.0, "Hargun Kaur"));

        Collections.sort(employees);
        System.out.println("Employees sorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

