/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Lab4;

/**
 *
 * @author Ranveer Singh 
 */
public class Lab4 {
     public static void countDown(int num)

 {
      if (num == 0) // test       
                                // Evaluates n times
                  System.out.println("Blastoff!");

       else {
    if(num%2==0) {
                  System.out.println("...");
    }
                    countDown(num-1); // recursive call
                        
                               // T(n)+n-1
             } 

 }
}

// 
/** 1) The output of this code is 
      /** ...
       *  ...
       *  ...
       *  ...
       * Blastoff
       */  
//
/** 2() To revise the code so that it only prints even numbers,
 * We add an if-statement to check the current number
 */
// 
/** 3() O(n) is the Time Complexity. The function is called n times,
 * it is decreasing by 1 each time it's called
 * the time complexity is linear and is O(n)
 */           

