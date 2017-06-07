package com.trylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите целое число для проверки на четность:");
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	int temp = number/2;


	if (temp*2!=number){
	    System.out.println("введено нечетное число");
    }
    else {
	    System.out.println("введено четное число");
    }


	       }
}
