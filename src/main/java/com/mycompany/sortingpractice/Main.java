/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingpractice;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author haramerik
 */
public class Main {
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] myIntArray = new int[]{1, 2,100, 5, 3};
  
     
        // Printing elements one by one 
        for (int i = 0; i < myIntArray.length; i++) 
        {
            System.out.print(myIntArray[i] + " ");
        }
        
        int calculated_biggest = find_biggest(myIntArray);
        
        System.out.println("\nThe biggest value is " + calculated_biggest);
        
        
        int calculated_smallest = find_smallest(myIntArray);

        System.out.println("The smallest value is " + calculated_smallest);
    }
    
    public static int find_biggest(int[] yourArray)
    {
        int biggest = yourArray[0];
        for(int i = 0; i < yourArray.length; i++) {
            int current_value = yourArray[i];
            if (current_value > biggest) {
                biggest = current_value;
            }
        }
        return biggest;
    }
    
    public static int find_smallest(int[] yourArray) {
        int smallest = yourArray[0];
        

        for (int i = 0; i < yourArray.length; i++ ) {
            int current_value = yourArray[i];
            if (current_value < smallest)
                smallest = current_value;
           
        }


        return smallest;
    }

        
       
}
