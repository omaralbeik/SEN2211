package com.omaralbeik.recursiveFunctions;

/**
 * Created by omar on 28/12/2016.
 */
public class RecursiveFunctions {

    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static int greatestInRange(int a[], int lowerIndex, int upperIndex) {
        int max;
        if (lowerIndex == upperIndex)
            return a[lowerIndex];
        else {
            max = greatestInRange(a, lowerIndex + 1, upperIndex);
            return (a[lowerIndex] >= max) ? a[lowerIndex] : max;
        }
    }

    public static int smallestInRange(int a[], int lowerIndex, int upperIndex) {
        int min;
        if (lowerIndex == upperIndex)
            return a[lowerIndex];
        else {
            min = smallestInRange(a, lowerIndex + 1, upperIndex);
            return (a[lowerIndex] <= min) ? a[lowerIndex] : min;
        }
    }

    public static int countOddsInRange(int[] a, int lowerIndex, int upperIndex)  {
        int count = 0;
        if (lowerIndex <= upperIndex) {
            count += countOddsInRange(a, lowerIndex + 1, upperIndex);
            if(a[lowerIndex] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEvensInRange(int[] a, int lowerIndex, int upperIndex)  {
        int count = 0;
        if (lowerIndex <= upperIndex) {
            count += countEvensInRange(a, lowerIndex + 1, upperIndex);
            if(a[lowerIndex] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int occurrenceTimesForNumberInRange(int number, int[] a, int lowerIndex, int upperIndex) {
        int count = 0;
        count += occurrenceTimesForNumberInRange(number, a, lowerIndex + 1, upperIndex);
        if (a[lowerIndex] == number) {
            count++;
        }
        return count;
    }

    public static int sum(int number) {
        return (number == 1) ? 1 : number + sum(number - 1);
    }

    public int primes(int x, int i)
    {
        if(i==1)
            return 1;
        if(x%i==0)
            return 0;
        else
            return primes(x, i-1);
    }

    public static int fibonacci(int number) {
        return (number <= 1) ? number : fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void decToBin(int number) {
        if(number > 0) {
            decToBin(number / 2);
            System.out.print(number % 2);
        }
    }

     public static void decToAnyBase(int number, int base) {
         if (number > 0) {
             decToAnyBase(number / base, base);
             System.out.print(number % base);
         }
     }

    static int gcd(int a, int b)
    {
        if(a == 0 || b == 0) return a+b; // base case
        return gcd(b,a%b);
    }
}
