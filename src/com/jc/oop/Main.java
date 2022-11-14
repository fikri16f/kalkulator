package com.jc.oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Masukkan Angka1");
		int data1 = data.nextInt();
		System.out.println("Masukkan Angka2");
		int data2 = data.nextInt();
		
		kalkulator field = new kalkulator();
		field.setNumber1(data1);
		field.setNumber2(data2);
		
		
		 System.out.println(field.bagi());
		
		 System.out.println(field.kurang());
		
		 System.out.println(field.kali());
		
		 System.out.println(field.tambah());
		
		
	}

}
