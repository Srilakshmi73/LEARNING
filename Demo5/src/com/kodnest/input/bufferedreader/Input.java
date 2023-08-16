package com.kodnest.input.bufferedreader;
import java.io.*;

import java.io.IOException;


public class Input {

	public static void main(String[] args) throws IOException{
		InputStreamReader IR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IR);
		int a = Integer.parseInt(BR.readLine());
		//System.out.println("Enter your name: ");
		String str = BR.readLine();
		System.out.println(str);
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
