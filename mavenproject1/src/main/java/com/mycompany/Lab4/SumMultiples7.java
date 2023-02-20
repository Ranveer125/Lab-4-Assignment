/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lab4;

/**
 *
 * @author Ranveer Singh 
 */
public class SumMultiples7 {
     public static void main(String args[]){
         int n1=14, n2=21,sum;
         sum=n1+n2;
         System.out.print("Sum of n1+n2"+ 7);
     }
      static int findSum(int n1, int n2){
          
          int sum = n1+n2;
          if (n1 !=0)
              return n1 + findSum(n1 - 1);
          else
         return 7;
          
      }

    private static int findSum(int i) {
        throw new UnsupportedOperationException();
    }
        
}


