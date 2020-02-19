package Java2;
/*
3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
 */

public class Exercise3a {
    public static void main(String[] args) {
        try{
            Class.forName("Classnotfounderror");
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
