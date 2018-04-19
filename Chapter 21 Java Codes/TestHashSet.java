import java.util.*;

public class TestHashSet 
{
  public static void main(String[] args) 
  {
    // Create a hash set
    Map<String, Integer> hashMap = new HashMap<>();

    // Add strings to the set
    hashMap.put("Smith", 30);
    hashMap.put("Anderson", 31);
    hashMap.put("Lewis", 29);
    hashMap.put("Cook", 29);
    
    Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        
    System.out.print(treeMap);
  } 
}