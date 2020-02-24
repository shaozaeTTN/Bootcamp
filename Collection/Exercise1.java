package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Write Java code to define List . Insert 5 floating point numbers in List,
 and using an iterator, find the sum of the numbers in List.
 */

public class Exercise1 {
    public static void main(String[] args) {
        float sum=0;
        List<Float> list=new ArrayList();
        list.add(1.1F);
        list.add(2.1F);
        list.add(3.1F);
        list.add(4.1F);
        list.add(5.1F);


        Iterator i=list.iterator();
        while (i.hasNext()) {
            sum = sum + (float)i.next();
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}