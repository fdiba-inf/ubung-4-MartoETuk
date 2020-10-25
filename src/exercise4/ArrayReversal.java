package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    char [] preslava = new char[size];
    
    for (int index = 0; index < preslava.length; index++) {
      preslava[index] = input.next().charAt(0);
    }

    char [] galena = new char[size];
    int index = preslava.length - 1;
    int address = 0;
    for (;index >= 0; index--){
      galena[address] = preslava[index];
      address++;
    }

    String charToString = Arrays.toString(galena);
    System.out.println("Reversed symbols: " + charToString);
  }
}