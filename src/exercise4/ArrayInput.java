package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {

  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    int size = input.nextInt();
    int[]name = new int [size];

    for(int address = 0; address < name.length; address++) {
      name[address] = input.nextInt();
    }

    String numbersAsString = Arrays.toString(name);
    System.out.println("Numbers: " + numbersAsString);
  }
}