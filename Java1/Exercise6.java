package Java1;

// There is an array with every element repeated twice except one. Find that element

public class Exercise6 {
    public static int solo(int[] a, int n){
        int ele = a[0];
        for (int i = 1; i < n; i++){
            ele = ele ^ a[i];
        }
        return ele;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 4, 5, 3, 4};
        int n = a.length;
        System.out.println("Element occurring once is " + solo(a, n) + " ");

    }
}
