import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public int [] array;
	public int search;
	public int max = 0;
	public int sum = 0;
	public double average = 0;
	

	public void setter(int size) {
		array = new int [size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
	}
	public void show() {
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array [" + (i+1) +"] = " + array[i]);
		}
		System.out.println("");
	}
	public void GetSum() {
		for (int i = 0; i <array.length; i++) {
			sum += array [i];
		}
		System.out.println("The Sum is " + sum);
	}
	
	public void GetAverage() {
		average = sum / array.length;
		System.out.println("The Average is" + average);
	}
	
	public void GetMax() {
		for (int i = 0; i < array.length; i++) {
			if (max < array [i]){
				max = array[i];
			}
		}
		System.out.println("The Max is " + max);
	}



public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	RandomArray storage = new RandomArray();
	
	System.out.print("Please input the Array size: ");
	int Size = input.nextInt();
		storage.setter(Size);
		storage.show();
		storage.GetSum();
		storage.GetAverage();
		storage.GetMax();
	}	
}
