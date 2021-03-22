package com.cts.training.string;

import java.util.StringTokenizer;

import org.omg.CORBA.TCKind;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer tocken = new StringTokenizer("This is my first Demo");
		while(tocken.hasMoreTokens()) {
			System.out.println(tocken.nextToken());
		}

	}

}
