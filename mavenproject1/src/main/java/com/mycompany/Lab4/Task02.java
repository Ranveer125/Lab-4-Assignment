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


