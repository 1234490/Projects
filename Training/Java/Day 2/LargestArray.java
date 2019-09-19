package Day2;
import java.util.*;

public class LargestArray {
	public static void main(String[] args) {
		int[] myList = {4, 7, 1, 7, 8, 9, 0};
		int largest = myList[0];
		int largestIndex = 0;
		
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > largest) {
				largest = myList[i];
				largestIndex = i;
			}
		}
		
		//System.out.println(String.format("{0} {1}", largest, largestIndex));
		System.out.println("Largest: " + largest + "\nlargestIndex: " + largestIndex);
		System.out.println(Arrays.toString(myList));
		
		int[] reverseList = new int[myList.length];
		
		for (int i = 0, j = myList.length - 1; i < myList.length; i++, j--) {
			reverseList[i] = myList[j];
		}
		
		System.out.println(Arrays.toString(reverseList));
	}
}