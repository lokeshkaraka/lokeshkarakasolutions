package shuffle;
import java.util.*;

public class shufflearray{
	public static void main(String[] args)
	{
		int[] myArray = {1,2,3,4,5,6,7};
		shufflearray(myArray);
		for( int num: myArray) {
			System.out.println(num + " ");
		}
		
	}
	
	public static void shufflearray(int[] array) {
		int[] myArray = {1,2,3,4,5,6,7};
		int arraylength = 0;
		for (int element : myArray) {
			arraylength++;
		}
		int n = arraylength;
		Random random = new Random();
		for (int i=n-1;i>0;i--){
			int j = random.nextInt(i+1);
		
		int temp = array[i];
		array[i]= array[j];
		array[j] = temp;
	}

}
}