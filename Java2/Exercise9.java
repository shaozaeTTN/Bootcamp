package Java2;

/*
9.Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
 There are stress and fire tests for each products.
 */
class Furniture{
    String name;
    String stressResult;
    String fireResult;

    void stressTest(){
        System.out.println(name + " has " + stressResult + " the stresstest.");
    }
    void fireTest(){
        System.out.println(name + " has " + fireResult + " the firetest.");
    }
}
class WoodenChairs extends Furniture{
    WoodenChairs(String n, String stress, String fire){
        name = n;
        stressResult = stress;
        fireResult = fire;
    }

}
class WoodenTables extends Furniture{
    WoodenTables(String n, String stress, String fire){
        name = n;
        stressResult = stress;
        fireResult = fire;
    }
}
class MetalChairs extends Furniture{
    MetalChairs(String n, String stress, String fire){
        name = n;
        stressResult = stress;
        fireResult = fire;
    }
}
class MetalTables extends Furniture{
    MetalTables(String n, String stress, String fire){
        name = n;
        stressResult = stress;
        fireResult = fire;
    }
}
public class Exercise9 {
    public static void main(String[] args) {
        WoodenChairs obj1=new WoodenChairs("wooden chair", "passed", "failed");
        obj1.stressTest();
        obj1.fireTest();
        WoodenTables obj2=new WoodenTables("wooden tables", "passed", "failed");
        obj2.stressTest();
        obj2.fireTest();
        MetalChairs obj3=new MetalChairs("metal chair", "passed", "passes");
        obj3.stressTest();
        obj3.fireTest();
        MetalTables obj4=new MetalTables("metal table", "passed", "failed");
        obj4.stressTest();
        obj4.fireTest();
    }
}
