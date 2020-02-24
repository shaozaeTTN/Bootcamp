package Collection;

import java.util.*;
/*
Write a program to sort Employee objects based on highest salary
 using Comparator. Employee class{ Double Age; Double Salary; String Name
 */

public class Exercise5 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(4174, "Vishodu", 21d, 15000d));
        list.add(new Employee(4153, "Shayan", 20d, 15000d));
        list.add(new Employee(3993, "Ammar", 20d, 5000d));
        list.add(new Employee(4159, "Mayank", 21d, 4000d));
        list.add(new Employee(3986, "Alok", 22d, 3000d));
        list.add(new Employee(3982, "Akshay", 22d, 1000d));
        list.add(new Employee(3996, "Ankit", 23d, 1000d));
        System.out.println("======================================");
        System.out.println("Before sorting: ");
        System.out.println("======================================");
        list.forEach(e -> System.out.println(e));
        System.out.println("======================================");
        System.out.println("After sorting by salary: ");
        System.out.println("======================================");
        list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        list.forEach(e-> System.out.println(e));

    }
}

class Employee {
    int id;
    String name;
    Double age;
    Double salary;


    public Employee(int id, String name, Double age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }
}
