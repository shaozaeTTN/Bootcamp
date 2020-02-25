package Java8Features;

/*
Create an Employee Class with instance variables (String) name, (Integer)age,(String)city and get the instance
of the Class using constructor reference
 */

class Employee {
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

@FunctionalInterface
interface EmployeeInterface {
    Employee display(String name, Integer age, String city);
}

public class Exercise4 {
    public static void main(String[] args) {
        EmployeeInterface ref=Employee::new;
        System.out.println(ref.display("Vishodu",21,"Kolkata"));
    }
}
