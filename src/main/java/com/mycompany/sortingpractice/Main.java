/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingpractice;
import java.util.Scanner;
import java.io.Console;

/**
 *
 * @author haramerik
 */
public class Main {
    

    public static void main(String[] args) {
        System.out.println("Sorting algorithms!");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of items in array: ");

        // Create a new array. The user enters the size
        int[] array = new int[input.nextInt()];

        System.out.println("Now enter items: ");

        // Get the value of each element in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        /* Note that the user can type the following:
         * 6
         * 34 12 7 4 22 15
         * This will set the array to size 6
         * array[0] = 34;
         * array[1] = 12;
         * etc.
         */
   
     
        // Printing elements one by one 
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.print("\n");
        
        int calculated_biggest = find_biggest(array);
        
        System.out.println("The biggest value is " + calculated_biggest);
        
        int calculated_smallest = find_smallest(array);

        System.out.println("The smallest value is " + calculated_smallest);
        
        System.out.println("Provide an integer to search:");
        
        int search_value = input.nextInt();
        int found_index_ex1 = sequentialSearch(search_value, array);
        
        System.out.println("Seq search Found " + search_value + " at index " + found_index_ex1);
        
        found_index_ex1 = binarySearch(search_value, array);
        
        System.out.println("binarysearch Found " + search_value + " at index " + found_index_ex1);
        
   }
    
    public static int find_biggest(int[] yourArray)
    {
        int biggest = yourArray[0];
        for(int i = 0; i < yourArray.length; i++) {
            int current_value = yourArray[i];
            if (current_value > biggest) {
                biggest = current_value;
                //System.out.println("assining new biggest: " + biggest);
            }
        }
        return biggest;
    }
    
    public static int find_smallest(int[] yourArray) {
        int smallest = yourArray[0];

        for (int i = 0; i < yourArray.length; i++) {
            int current_value = yourArray[i];
            if (current_value < smallest) {
                smallest = current_value;
                //System.out.println("assigning new smallest: " + smallest);
            }

        }

        return smallest;
    }

    public static int sequentialSearch(int item, int[] list) {

        int index = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                index = i;
                break;
            }
        }

        return index;
    }

    //binary search requires list to be sorted
    public static int binarySearch(int item, int[] list) {
// if we did not find the search term the index will be -1
        int index = -1;
        // once you set the starting and ending indexes in the array
        // the following code will change as we narrow our search
        int low = 0;
        int high = list.length - 1;
        int mid;
// Stop searching for the search term when our high and low markers cross
        while (high >= low) {

            mid = (high + low) / 2;// then you want to calculate the midpoint
            // of your array
            if (item < list[mid]) {
                //the value will be in the lower half, if at all

                high = mid - 1;
            } else if (item > list[mid]) {
                low = mid + 1;
            } else {
                //Now that you found it break out of the loop
                index = mid;
                break;
            }

        }

        return index;
    }
}
