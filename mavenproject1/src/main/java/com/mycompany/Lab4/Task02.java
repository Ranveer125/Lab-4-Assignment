/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab4;

/**
 *
 * @author Ranveer Singh PC
 */
public class Task02 {
   int gcd(int x, int y) {

      if (x % y == 0) //base case

             return y;

       else

             return gcd(y, x % y);

 }
}

/**  1() The output of this code is the GCD of our x and y value
 * Calling x 20 and y 10 will give us an output of 10
 * 10 is the GCD of 10 and 20
 */

/**  2() 
 * 
 */


