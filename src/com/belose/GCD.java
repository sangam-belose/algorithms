package com.belose;
// Find GCD of two numbers
class GCD {
  public static int getGreatedCommonDivisor(int num1, int num2) {
    while (num2 != 0) {
      int temp = num1;
      num1 = num2;
      num2 = temp % num2;
    }
    return num1;
  }

  public static int GCDusingRecursion(int num1, int num2){
    if (num2 == 0) return num1;
    int reminder = num1 % num2;
    return GCDusingRecursion(num2, reminder);
  }

  public static void main(String args[]) {

    System.out.println("Finding GCD of two numbers");
    System.out.println("GCD of 12 and 96 = "+GCD.getGreatedCommonDivisor(12, 96));
    System.out.println("GCD of 20 and 8 = "+GCD.getGreatedCommonDivisor(20, 8));
    System.out.println("GCD of 50 and 15 = "+GCD.getGreatedCommonDivisor(50, 15));
    System.out.println("GCD of 20 and 2 = "+GCD.getGreatedCommonDivisor(20, 2));

    System.out.println("Finding GCD of two numbers using recursion");
    System.out.println("GCD of 12 and 96 = "+GCD.GCDusingRecursion(12, 96));
    System.out.println("GCD of 20 and 8 = "+GCD.GCDusingRecursion(20, 8));
    System.out.println("GCD of 50 and 15 = "+GCD.GCDusingRecursion(50, 15));
    System.out.println("GCD of 20 and 2 = "+GCD.GCDusingRecursion(20, 2));
  }

}