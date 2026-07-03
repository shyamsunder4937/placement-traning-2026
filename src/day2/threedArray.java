package day2;

import java.util.Scanner;

public class threedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[][][] arr = new int[size][size][size];

        System.out.println("Enter the numbers:");
  
        // Input
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Matrix:");

        // Output
        for (int i = 0; i < size; i++) {
            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}