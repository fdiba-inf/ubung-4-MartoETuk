package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    int[]name = new int [size];

    for(int address = 0; address < name.length; address++) {
      name[address] = input.nextInt();
    }

    char space = ' ';
    int index = 0;
    while (index < name.length) {

      for (int counter = 0; counter < index; counter++) {
        System.out.print(space);
      }
      System.out.println(name[index]);
      index++;
    }
  }
}