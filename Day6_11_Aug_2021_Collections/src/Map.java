import java.util.*;

public class Map {
	public static void main(String a[]){

	Map<Integer, String> mapHttpErrors= new HashMap<>();		 
	mapHttpErrors.put(200, "OK");
	mapHttpErrors.put(303, "See Other");
	mapHttpErrors.put(404, "Not Found");
	mapHttpErrors.put(500, "Internal Server Error");
	mapHttpErrors.put(null, "NA");		
	//System.out.println(mapHttpErrors);


//In Order and Null not allowed
Map<String, String> mapLang = new TreeMap<>();		 
mapLang.put(".c", "C");
mapLang.put(".java", "Java");
mapLang.put(".pl", "Perl");
mapLang.put(".cs", "C#");
mapLang.put(".php", "PHP");
mapLang.put(".cpp", "C++");
mapLang.put(".xml", "XML");	
mapLang.put(".cs", "C#");
//mapLang.put(null, "NA");	
System.out.println(mapLang);

/*************** Working with Functions   *****************/

//Getting a value associated with a specified key:
String status;
status = mapHttpErrors.get(303);
System.out.println("303: " + status);


status = mapHttpErrors.get(301);
System.out.println("301: " + status);

//Checking if the map contains a specified key:
		if (mapHttpErrors.containsKey("200")) {
		    System.out.println("Http status 200");
		}
		
		//Checking if the map contains a specified value:
		if (mapHttpErrors.containsValue("OK")) {
		    System.out.println("Found status OK");
		}
		
		//Removing a mapping from the map:
			String removedValue = mapHttpErrors.remove(500);		 
			if (removedValue != null) {
			    System.out.println("Removed value: " + removedValue);
	}
			//Replacing a value associated with a specified key:
			System.out.println("Map before: " + mapHttpErrors);		 
			mapHttpErrors.replace(304, "No Changes");		 
			System.out.println("Map after: " + mapHttpErrors);
			
			//Getting the size of the map:
			int size = mapHttpErrors.size();
			System.out.println("Size:"+size);
			
			//Checking if the map is empty:
			if (mapHttpErrors.isEmpty()) {
			    System.out.println("No Error");
			} else {
			    System.out.println("Have HTTP Errors");
			}

			//Iterating Over a Map (using Collection views) Two Techniques
			Set<Integer> setCodes = mapHttpErrors.keySet();
			Iterator<Integer> iterator = setCodes.iterator();
			 
			while (iterator.hasNext()) {
			    Integer code = iterator.next();
			    String errorMsg = mapHttpErrors.get(code);
			 
			    System.out.println(code + " => " + errorMsg);
			}

			// Or For Each Loop
			
			Collection<String> errorMsgs = mapHttpErrors.values();
			 
			for (String errorMsg : errorMsgs) {
			    System.out.println(errorMsg);
			}
			
			Collection<Integer> errorCodes = mapHttpErrors.keySet();
			 
			for (Integer errorCode : errorCodes) {
			    System.out.println(errorCode);
			}
				
			
			Set<Map.Entry<Integer, String>> entries = mapHttpErrors.entrySet();
				 
				for (Map.Entry<Integer, String> entry : entries) {
				    Integer code = entry.getKey();
				    String msg = entry.getValue();
				 
				    System.out.println(code + " => " + msg);
				}
			
}
}