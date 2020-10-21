package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    double[] preslava = new double[size];

    for (int index = 0; index < preslava.length; index++) {
      preslava[index] = input.nextDouble();
    }

    int index = 0;
    int ind = 0;
    double data = preslava[index];
    double min = data;
    for (;index < preslava.length; index++) {
      data = preslava[index];

      if (data < min){
        min = data;
        ind = index;
      }
    }
    System.out.println("Min index: " + ind);
  }
}