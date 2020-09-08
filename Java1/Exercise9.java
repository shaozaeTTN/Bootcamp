package Java1;

//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

enum House{
    bungalow(50), Hut(2);
    private int price;

    House(int p) {
        price = p;
    }
    int getPrice(){
        return price;
    }
}
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("All prices:");
        for (House H: House.values()){
            System.out.println(H + " costs " + H.getPrice() + " lac rupees");
        }
    }

}
