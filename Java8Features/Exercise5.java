package Java8Features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


/*

Implement following functional interfaces from java.util.function using lambdas:

    (1) Consumer

    (2) Supplier

    (3) Predicate

    (4) Function


 */



public class Exercise5 {

    public void injectMiddleName(Object obj, Consumer consumer){
        System.out.print("Vishodu ");
        consumer.accept(obj);
        System.out.print(" Shaozae");
    }

    public static void main(String[] args) {
        Exercise5 foobar = new Exercise5();

// Consumer
        System.out.println("\nDisplaying full name by injecting middle name using Consumer: ");
        foobar.injectMiddleName("K.", obj ->
                System.out.print(obj.toString().toUpperCase()));

// Supplier
        System.out.println("\n\nGetting a random value using Supplier: ");
        Supplier<Double> random = () -> Math.random() * 100;
        System.out.println("Random value: " + random.get().intValue());

// Predicate
        System.out.println("\nFiltering names starting with 's' in the following list using Predicate: \nOriginal list: ");
        List<String> names = Arrays.asList("Vishodu", "Shaozae", "Alok", "Shayan", "Ammar");
        names.stream().forEach(System.out::println);
        System.out.println("\nFiltered list: ");
        names
                .stream().
                filter((s)->{
                    return s.startsWith("S");
                })
                .forEach(System.out::println);

// Function interface
        System.out.println("\nConverting String to Numeric type using Function: ");
        Function<String, Integer> aToI = str -> Integer.parseInt(String.valueOf(str));
        System.out.println("Numeric value of (String)'123' + (Integer)5 is: " + (aToI.apply("123")+5));

    }
}