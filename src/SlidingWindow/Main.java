package SlidingWindow;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) { 
		SlidingWindowMaximum swm = new SlidingWindowMaximum(); 
		System.out.println(Arrays.toString( swm.maxSlidingWindow(new int[] {1,2,1,0,4,2,6}, 3)));
		
	}

}
