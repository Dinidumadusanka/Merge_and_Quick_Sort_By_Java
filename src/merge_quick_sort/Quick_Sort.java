package merge_quick_sort;
import java.util.Scanner;
import java.io.*;
public class Quick_Sort {
	  static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	  
	    static int partition(int[] arr, int low, int high)
	    {
	        // Choosing the pivot
	        int pivot = arr[high];

	        
	        int i = (low - 1);

	        for (int j = low; j <= high - 1; j++) {

	            // If current element is smaller than the pivot
	            if (arr[j] < pivot) {

	                // Increment index of smaller element
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return (i + 1);
	    }

	 
	    static void quickSort(int[] arr, int low, int high)
	    {
	        if (low < high) {

	         
	            int pi = partition(arr, low, high);

	         
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }
	   
	    public static void printArr(int[] arr)
	    {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	 
	    public static void main(String[] args)
	    {
	    	 Scanner scanner = new Scanner(System.in);

	       
	         System.out.print("Enter the number of elements in the array: ");
	         int n = scanner.nextInt();

	         
	         int[] arr = new int[n];

	      
	         System.out.println("Enter the elements of the array:");
	         for (int i = 0; i < n; i++) {
	             arr[i] = scanner.nextInt();
	         }

	         System.out.println("Given array is");
	         printArr(arr);

	         quickSort(arr, 0, n - 1);

	         System.out.println("\nSorted array is");
	         printArr(arr);
	     }
	    }
	

