
package Collection;


/*Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
Class Student{ String Name; Double Score; Double Age
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Exercise6 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Vishodu",85d, 18d));
        list.add(new Student("Shayan",80d, 17d));
        list.add(new Student("Ammar",75d, 18d));
        list.add(new Student("Mayank",75d, 16d));
        list.add(new Student("Alok",65d, 17d));
        System.out.println("======================================");
        System.out.println("Before sorting:");
        System.out.println("======================================");
        Student.display(list);
        System.out.println("======================================");
        System.out.println("After sorting: ");
        System.out.println("======================================");
        Collections.sort(list,new Scorecompare());
        Student.display(list);
    }
}
class Student{
    String name;
    Double score;
    Double age;

    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age
                ;
    }

    public static void display(List<Student> list){
        for(Student stu:list){
            System.out.println(stu);
        }
    }
}

class Scorecompare implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        int nameComp = s1.getName().compareTo(s2.getName());
        int scoreComp = s1.getScore().compareTo(s2.getScore());

        if(scoreComp == 0) {
            return nameComp;
        }
        return scoreComp;
    }
}