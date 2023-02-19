/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab4;

/**
 *
 * @author Ranveer Singh PC
 */
public class Task03 {
    int fib(int n)

    {

       if (n <= 0) // base case

            return 0;

      else if (n == 1) // base case

             return 1;
                           // Runs n times
       else
      return fib(n-1) + fib(n-2);
                                     // Runs n-1 times
    }
}

/**  1()  
 * 
 */



