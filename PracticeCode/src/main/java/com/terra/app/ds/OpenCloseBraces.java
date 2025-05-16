package com.terra.app.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OpenCloseBraces {

	public static void main(String[] args) {
		//{{{{}}}}
		int kthNumber = 4;
		
		String[] openCloseBraces = {"{,}"};
		
		String[] resultantArray = getTheDesiredCombinations(kthNumber,openCloseBraces);
		System.out.println(resultantArray);
	}

	private static String[] getTheDesiredCombinations(int kthNumber, String[] openCloseBraces) {
		
		List<List<String>> listOfListOfString = new ArrayList();
		
		if(openCloseBraces.length == 0) {
			return null;
		}
		int count = 0;
		while (kthNumber<count) {
			for(int i =0;i<openCloseBraces.length-1;i++) {
				listOfListOfString.add(new ArrayList<>(Arrays.asList(openCloseBraces)));
			}	
			count ++;
		}
		
		return (String[]) listOfListOfString.toArray();			
		
	}


//word search in a char matrix, 
//input [['A','B','C','E'],['S','F','C','S'],['A','D','E','E']] word=SEE
	//Time complexcities by collectionn crud operations | and space complexicied 
}

