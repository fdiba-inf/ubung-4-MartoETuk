package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    double[] preslava = new double[size];

    for (int index = 0; index < preslava.length; index++) {
      preslava[index] = input.nextDouble();
    }

    int index = 0;
    double data = preslava[index];
    double max = data;
    for (;index < preslava.length; index++) {
      data = preslava[index];

      if (data > max){
        max = data;
      }
    }
    System.out.println("Max number: " + max);
  }
}