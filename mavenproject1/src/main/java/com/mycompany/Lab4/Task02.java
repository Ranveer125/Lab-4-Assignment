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

      if (x == y) { //base case

             return y;

      } else if (x>y) { 
          return gcd(x-y,y);
      } else {
      } 
        return gcd(x,y-x);
 }
}

/**  1() The output of this code is the GCD of our x and y value
 * Calling x 20 and y 10 will give us an output of 10
 * 10 is the GCD of 10 and 20
 */

/**  2() Modify Code to find GCD using subtraction instead of %
 * Output will be the exact same after modifying this code
 */




