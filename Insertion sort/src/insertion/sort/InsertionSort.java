/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort;

/**
 *
 * @author Cristhian Javier ruiz León
 */
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] numbers ={12,11,10,8,7,5,3};
		int swap,i,j, counter=0;
		/*
		 * 
		 */
		for( i = 0; i< numbers.length ; i++)
		{
			swap = numbers[i];
			
		for( j = i - 1 ; j >= 0 ; j--)
			if (numbers[i]>numbers[j])
				break;
		
			for(int k = i ; k > j +1 ; k--)
				numbers[k]= numbers[k - 1]; //Swaps
				counter +=1;
				
				numbers[j + 1] = swap;
			
		}	
		
		for( i = 0; i< numbers.length;i++)
		{
			System.out.print(numbers[i]+ " ");
		}
		System.out.print("\n la cantidad de intercambios es: " +counter);
	}
	
}

