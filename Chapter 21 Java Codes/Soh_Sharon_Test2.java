import java.io.IOException;
import java.net.*;
import java.util.*;

public class Soh_Sharon_Test2 {

	public static void main(String[] args) throws RuntimeException, IOException{
	
	//try catch in case url doesn't exist, url is invalid..how to do that

	/*Create tree map to hold words as key
	 * count as value */
    
   try{
	   Map<String, Integer> map = new TreeMap<>();
	   
      java.net.URL url = new java.net.URL(args[0]);
	   Scanner scanner = new Scanner(url.openStream());
   
      while(scanner.hasNext()){
      String txt = scanner.useDelimiter("\\A").next();
	   String[] words = txt.split("[\\s+\\p{P}]");
	   	for (int i=0; i < words.length; i++){
	   		String key = words[i].toLowerCase();
	   		
	   		if (key.length() > 0){
	   			if (!map.containsKey(key)){
	    				map.put(key, 1);
				   }
				   else{
				   	int value = map.get(key);
				   	value++;
				   	map.put(key, value);
				   }
			   }
		   }
       }
	   //Display key and value
	   //Display url
	   System.out.println("Test2 Exercise using " + url + " as the input" );
	   System.out.println();
	   System.out.println("Alphabetical list of words and their usage counts: ");
	   System.out.println();
	   map.forEach((v,k) -> System.out.println(k + "\t" + v));
    }
    catch(RuntimeException ex ){
       System.out.println(" URL not entered  ");
       System.exit(1);
    }
    catch (IOException ex){
       System.out.println(" Invalid URL");
       System.exit(1); 
    } 
  }
}
