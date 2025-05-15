package test.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {

		//String arr = "|521,5010|";
//		String a = "12|23,23|,";
		//String routeIds = "|1953,2679|";
//		String[] arr1 = arr.split("\\|\\,");
//		String[] a1 = arr.split("\\|");
//		String[] a2 = arr.split("\\,");
//		
//		
//		System.out.println(".....................Original...................................");
//		for (String string : arr1) {
//			System.out.println(string);
//		}
//		System.out.println(".......................|,..................................");
//		for (String string : arr1) {
//			System.out.println(string);
//			String[] ss = string.split("\\,");
//			for (String s: ss) {
//				System.out.println(s);
//				
//			}
//		}
//		
//		
//		System.out.println("after ");
//		System.out.println(".......................|.................................");
//
//		for (String string : a1) {
//			System.out.println(string);
//		}
//		System.out.println("............................,............................");
//		for (String string : a2) {
//			System.out.println(string);
//		}
		
		String routeIds = "|1953,2679|";

			System.out.println(" Case 1 ----- Route Id after split with regex |,  ");
			String[] listOfRoutes = routeIds.split("\\|\\,");
			for (String string : listOfRoutes) {
					System.out.println(string);
			}
			String[] routeIdArray = null;
			for (String routeId : listOfRoutes) {
			
			System.out.println(" With already splitted array || further splitting || Route Id after split with regex  , ");
			routeIdArray = routeId.split("\\,");
			for (String string : routeIdArray) {
				System.out.println(string);
			}
			
			}
			
			
			
			
			System.out.println("Case 2 ------- Route Id after split  |  ");
			
//			String pipeRoutes[] = routeIds.split("\\|");
			for (String pipeRoutes : routeIds.split("\\|")) {
				System.out.println(pipeRoutes);
			
				System.out.println(" With already splitted array || further splitting || Route Id after split  ,  ");

				for (String routeId : pipeRoutes.split("\\,")) {
					System.out.println(routeId);
			
				}
			}
		
//		Map.Entry<String, String> mapEntry = new AbstractMap.SimpleEntry<>("a","CARD");
//		String[] arr = {"BANK","CARD"};
//		String str2 = "CARD";
//		if(Arrays.asList(arr).contains(mapEntry.getValue())) {
//			System.out.println("It will work");
//			
//		}
//		
//		
//		System.out.println("end");
		
//		List<String> accountType = Arrays.asList("SAVINGS","CHECKING");
//		System.out.println(accountType);
		//		String baseUrl = "C:\\Users\\JahnabiSharma\\OneDrive - TerraPay\\Desktop\\";
//		String filePath = baseUrl.concat("PULL_WU_").concat(getDynamicConcatenatedString()).concat(".csv");
//		File yourFile = new File(filePath);
//		boolean result = yourFile.createNewFile();
//		System.out.println(result);


//	private static String getDynamicConcatenatedString() {
//		LocalDate currentdate = LocalDate.now();
//		String today = currentdate.toString();
//		String yestesday = currentdate.minusDays(1).toString();
//		return yestesday.concat("_").concat(today);
//	*/
		
	
		//String routeIds = "|1953,2679|";
//		/**String routeIds = "|,521";
//
//		System.out.println("Old flow where we are splitting the routeId with regex - | and the splitted array we are splitting furthermore with regex -,");
//		for (String pipeRoute : routeIds.split("\\|")) {
//			for(String routeId :pipeRoute.split("\\,")) {
//				System.out.println(routeId);
//			}
//		}
//
//		System.out.println("New flow where we are splitting the routeId with regex - |, and the splitted array we are splitting furthermore with regex -,");
//		for (String listOfRoutes : routeIds.split("\\|\\,")) {
//			for(String routeId :listOfRoutes.split("\\,")) {
//				System.out.println(routeId);
//			}
//		}**/
		
//		String value = "Carta d''identita";
//		System.out.println(value);
//		System.out.println(value.indexOf('\''));
//
//		if(value.indexOf('\'')> -1) {
//			value = value.replace("\'", "\'\'");
//		}
//		System.out.println(value);
		
//		String value = "Received|3050|Remit ack";
//		System.out.println(value);
//		String[] arr = value.split("\\|");
//		for (String string : arr) {
//			System.out.println(string);
//		}

		
	
	}

	
}
