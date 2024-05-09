/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision1;

/**
 *to display the Fibonacci series (10)
to print the series 3 2 1 1 2 3
to display from 9 to 0
to display the sum of first 10 numbers
to add all of the numbers between 5 to 10
Check the given String Palindrome or not

 * @author ahmed
 */
public class Recursion {
    
    public static int factorial(int n){
        int fact ;
        if(n>1)
            fact=n*factorial(n-1);
        else
            fact=1;
        return fact;
    }
    public static void displayFibonacciSequence(int n){
     if (n <= 0) {
            throw new IllegalArgumentException("Invalid input. Please enter a positive integer.");
        }

        System.out.println("Fibonacci sequence of " + n + " terms:");

        long current = 0;
        long next = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(current + " ");

            long temp = current;
            current = next;
            next = temp + next;
        }
    }
   
    public static int fibonacci(int n){
           if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    
    }
     public static int fibonacciSum2(int n){
  if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciSum2(n - 1) + fibonacciSum2(n - 2);
        }
    }
     
    public static int fibonacciSum(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start must be less than or equal to end");
        }
        if (start == 0 && end == 0) {
            return 0;
        }
        if (start == 0) {
            return 1;
        }
        return fibonacciSum2(end) - fibonacciSum2(start - 1);
    }
    public static void printFibonacci(int n){
        if(n<=0){
            throw new IllegalArgumentException("Invalid input. Please enter a non-negative integer.");
}
            fibo(0,1,n);
        
    }
            public static void fibo(int current,int next,int termLeft){
                System.out.print(current+" ");
if(termLeft==1){
    return;
}
fibo(next,current+next,termLeft-1);
    }
        public static void main(String[] args) {
    
            
        
    System.out.print(factorial(4));
        System.out.println();

        System.out.print(fibonacci(5));
                System.out.println();

displayFibonacciSequence(10);
        System.out.println();

System.out.println(fibonacciSum(5,10));

        }
         public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar != lastChar) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
