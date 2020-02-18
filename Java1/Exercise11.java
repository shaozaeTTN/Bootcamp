package Java1;

/*Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide
 there specific details like rateofinterest etc,print details of every banks
 */

class Bank {
    public void getDetails() {
        System.out.println("Details of the bank :");
    }
}
class BOI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("\nName: BOI");
        System.out.println("\nInterest Rate: 6%");
    }
}
class SBI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("\nName: State Bank of India");
        System.out.println("\nInterest Rate: 7%");
    }
}
class ICICI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("\nName: ICICI");
        System.out.println("\nInterest Rate: 9%");
    }
}
class Caller {
    public static void main(String[] args) {
        Bank d=new Bank();
        Bank b = new BOI();
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        d.getDetails();
        b.getDetails();
        sbi.getDetails();
        icici.getDetails();
    }
}