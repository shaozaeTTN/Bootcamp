package Java1;

// Write a single program for following operation using overloading

public class Exercise10 {
        public static int addition(int a, int b){
            return a + b;
        }
        public static double addition(double a, double b){
            return a + b;
        }
        public static float multiplication(float a, float b){
            return a * b;
        }
        public static int multiplication(int a, int b){
            return a * b;
        }
        public static String concat(String a, String b){
            return a + b;
        }
        public static String concat(String a, String b, String c){
            return a + b + c;
        }

    public static void main(String[] args) {
        System.out.println("Adding 2 integers:" + addition(1, 2));
        System.out.println("Adding 2 Double Type:" + addition(5.0, 5.0));
        System.out.println("Multiplying 2 float type:" + multiplication(3.3f, 10.0f));
        System.out.println("Multiplying 2 int type:" + multiplication(4, 5));
        System.out.println("Concatenating 2 Strings:" + concat("hello", "world"));
        System.out.println("Concatenating 3 Strings:" + concat("To", "The", "New"));

    }
}
