package Java1;

import java.util.*;

//  Find common elements between two arrays.

public class Exercise5 {
    public static void findCommon(int[] a, int[] b){
        List<Integer> array = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int ele:a){
            set.add(ele);
        }

        for(int ele:b){
            if(set.contains(ele)){
                array.add(ele);
            }
        }

        int[] arr = new int[array.size()];
        for(int i = 0; i < array.size();i++){
            arr[i] = array.get(i);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Use predefined Arrays");
        System.out.println("2. Enter desired Arrays");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                int Arr1[] = { 2, 2, 7, 7, 2, 1, 5, 4, 5, 1, 1 };
                int Arr2[] = { 2, 3, 4, 7, 10 };
                findCommon(Arr1, Arr2);
                break;
            case "2":
                System.out.println("Enter the size of first array");
                int n = scanner.nextInt();
                System.out.println("Enter your first array:");
                int Arr[] = new int[n];
                for (int i = 0; i<n ; i++){
                    Arr[i]=scanner.nextInt();
                }
                System.out.println("Enter the size of second array");
                int m = scanner.nextInt();
                System.out.println("Enter second array:");
                int Ar[] = new int[m];
                for (int i = 0; i<m ; i++){
                    Ar[i]=scanner.nextInt();
                }
                findCommon(Arr,Ar);
                break;
        }

    }
}
