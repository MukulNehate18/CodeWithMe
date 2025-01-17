package corejava;

import java.util.Scanner;

public class switchCaseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu Driven:");
        System.out.println("1.Max Element");
        System.out.println("2.Even Element");
        System.out.println("3.Sum of All Element");

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] a= new int[size];

        for (int i=0; i<size; i++){
            System.out.println("Enter Array Element"+(i+1)+" :");
            a[i]= sc.nextInt();
        }

        System.out.println("The Array is:");
        for (int i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("Enter your choice: ");
        int ch= sc.nextInt();
        switch (ch){
            case 1:
                int max = a[0];
                for(int i=1; i< size;i++){
                    if (max < a[i]){
                        max = a[i];
                    }
                }
                System.out.println("Max Element in Array is: "+max);
                break;

            case 2:
                for (int i=0; i<size;i++){
                    if(a[i]%2 ==0){
                        System.out.println("Even number is: "+a[i]);
                    }else {
                        System.out.println("Odd number is: "+a[i]);
                    }
                }
                break;

            case 3:
                int sum =0;
                for(int i =0; i<size;i++){
                    sum += a[i];
                }
                System.out.println("Sum of all elements in array is: "+sum);
                break;

            default:
                System.out.println("Invalid choice!!!");
        }

    }
}
