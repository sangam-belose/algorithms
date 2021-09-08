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


  public static void main(String args[]) {

    System.out.println("Finding GCD of two numbers");
    System.out.println(GCD.getGreatedCommonDivisor(96, 12));
    System.out.println(GCD.getGreatedCommonDivisor(20, 8));
    System.out.println(GCD.getGreatedCommonDivisor(50, 15));
    System.out.println(GCD.getGreatedCommonDivisor(20, 2));
  }

}