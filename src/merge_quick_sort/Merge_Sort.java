package merge_quick_sort;
import java.util.Scanner;
import java.io.*;
public class Merge_Sort {
	  void merge(int arr[], int l, int m, int r)
	    {
	        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;

	        // Create temp arrays
	        int L[] = new int[n1];
	        int R[] = new int[n2];

	        // Copy data to temp arrays
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];

	        // Merge the temp arrays

	
	        int i = 0, j = 0;

	
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	   
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	  
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	  
	    void sort(int arr[], int l, int r)
	    {
	        if (l < r) {

	            // Find the middle point
	            int m = l + (r - l) / 2;

	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);

	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }

	  
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	  
	    public static void main(String args[])
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
	          printArray(arr);

	          Merge_Sort ob = new Merge_Sort();
	          ob.sort(arr, 0, arr.length - 1);

	          System.out.println("\nSorted array is");
	          printArray(arr);
	      }

	    

	    }
	

