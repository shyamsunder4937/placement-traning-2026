package day2;
import java.util.*;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size");
		int size = sc.nextInt();
		int[] arr =  new int[size];
		System.out.println("enter the Number");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int num: arr) {
			System.out.print
			(num);
		}
	}

}
