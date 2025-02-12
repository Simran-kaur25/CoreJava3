package work;

import java.util.*;
import java.util.Objects;

class Emp {
    private String name;
    private int age;
    private String designation;

    public Emp(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp employee = (Emp) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}

class SalaryComparatorReverse implements Comparator<Map.Entry<Emp, Double>> {
    @Override
    public int compare(Map.Entry<Emp, Double> e1, Map.Entry<Emp, Double> e2) {
        return Double.compare(e2.getValue(), e1.getValue()); // Descending order
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Map<Emp, Double> employeeSalaryMap = new HashMap<>();


        employeeSalaryMap.put(new Emp("Simran Kaur", 21, "Software Engineer"), 50000.0);
        employeeSalaryMap.put(new Emp("Annie Chugh", 25, "Project Manager"), 70000.0);
        employeeSalaryMap.put(new Emp("Dilpreet Singh", 17, "Intern"), 60000.0);
        employeeSalaryMap.put(new Emp("Hargun Kaur", 28, "Data Analyst"), 40000.0);


        List<Map.Entry<Emp, Double>> salaryList = new ArrayList<>(employeeSalaryMap.entrySet());


        salaryList.sort(new SalaryComparatorReverse());


        System.out.println("Employees sorted by salary (Descending):");
        for (Map.Entry<Emp, Double> entry : salaryList) {
            System.out.println(entry.getKey() + " => Salary: " + entry.getValue());
        }
    }
}

