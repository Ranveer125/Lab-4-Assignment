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

                  System.out.println("Blastoff!");

       else {

                  System.out.println("...");

                    countDown(num-1); // recursive call

             } 

 }
}


