package sorts;

import util.Time;
import util.Util;

public class BubbleSort{ 
	public static void main(String[] args){	
		int[] list = Util.random(10,10);
		Util.print(list);
		sort(list);
		Util.print(list);
		
		System.out.println();
		for(int i = 1000; i <= 100000; i*=10){
			System.out.print("Sorting " + i + " Integers: ");
			list = Util.random(i,i);
			Time timer = new Time();
			timer.start();
			sort(list);
			timer.stop();
			timer.print();
		}
		
	}
	
	public static void sort(int[] list){
		for(int i = 0; i < list.length-1; i++){
			boolean sorted = true;
			for(int j = 1; j < list.length-i; j++){
				if(list[j-1] > list[j]){
					swap(list, j-1,j);
					sorted =  false;
				}
			}
			
			if(sorted) break;
		}
	}

	private static void swap(int[] list, int index1, int index2){
		int temp = list[index1];
		list[index1] = list[index2];
		list[index2] = temp;
	}
}