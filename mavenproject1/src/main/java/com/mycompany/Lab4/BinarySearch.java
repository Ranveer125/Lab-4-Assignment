/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab4;

/**
 *
 * @author Ranveer Singh 
 */
public class BinarySearch {
   int binarySearch(int array[], int target, int low, int high) {

    if (high >= low) {
      int mid = low + (high - low) / 2;

      
      if (array[mid] == target)
          
        return mid;
                   //Check to see if the mid target search
      
      if (array[mid] > target)
     return binarySearch(array, target, low, mid - 1);

      
      return binarySearch(array, target, mid + 1, high);
    }
// Search right half of array
    return -1;
  }
}


