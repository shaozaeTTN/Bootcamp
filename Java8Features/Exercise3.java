package Java8Features;

/*
Using (instance) Method reference create and apply add and subtract method and
using (Static) Method reference create and apply multiplication method for the functional interface created.
 */

@FunctionalInterface
interface Calculate{
    int calculate(int m, int n);
}

class Exercise3 {
    int add(int m, int n){
        return n+m;
    }

    int subtract(int n, int m){
        return n-m;
    }

    static  int mul(int n, int m){
        return n*m;
    }

    public static void main(String[] args) {
        Calculate objadd = new Exercise3()::add;
        Calculate objsub = new Exercise3()::subtract;
        Calculate objmul = Exercise3::mul;
        System.out.println("(Using instance Method reference) Addition of two numbers ="+objadd.calculate(8,3));
        System.out.println("(Using instance Method reference) Subtraction of two numbers ="+objsub.calculate(4,5));
        System.out.println("(Using static reference) Multiplication of two number ="+objmul.calculate(5,5));
    }
}
