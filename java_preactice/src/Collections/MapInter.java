package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapInter {

	public static void main(String[] args) {
		//Maps collection in Java is a collection that maps a key to a value. It is a collection consisting 
		//of keys and values. Each entry in the map consists of a key with its corresponding value. The keys are
		//unique in maps. 
		//The map interface is not a part of the collection interface and that is the reason for which maps are 
		//different from the other collections.
		//there are two interfaces to implement map i.e. map interface and sortedMap interface.
		//There are three classes namely i.e. HashMap, TreeMap, and LinkedHashMap.
		//LinkedHashMap Extends from HashMap class. This map maintains the insertion order
		//HashMap Implement a map interface. No order is maintained by HashMap.
		//TreeMap Implements both map and sortedMap interface. TreeMap maintains an ascending order.
		
		//In maps, each key can map to the at most one value. Also, there cannot be duplicate keys in maps.
		//Map implementations like HashMap and LinkedHashMap allow null key and null values. However, TreeMap does not allow it.
		//A map cannot be traversed as it is. Hence for traversing, it needs to be converted to set using keyset () or entrySet () method.
		
		//Map return Map.Entry data type
		
		
		System.out.println("HashMap Implement a map interface. No order is maintained by HashMap.\n");
		Map<String,Student> mapobject = new HashMap<>();
		mapobject.put("stud1", new Student(3, "Soro", "Sandona", "2018-09-09"));
		mapobject.put("stud2", new Student(1, "Silue", "Amara", "1995-09-09"));
		mapobject.put("stud3", new Student(10, "Kone", "Ismael", "2002-09-09"));
		mapobject.put("stud4", new Student(9, "Dao", "Fatim", "1997-09-09"));
		
		 //transform map to set
        Set<Map.Entry<String, Student>> entries = mapobject.entrySet();
        //declare an iterator
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        System.out.println("The map entries are:");
        System.out.println("        KEY     VALUE");
        //iterate and print key and value pairs.
        while(iterator.hasNext()) {
            Map.Entry<String, Student> entry = iterator.next();
            System.out.println("\t" + entry.getKey() + "\t" +entry.getValue());
        }
        
        System.out.println("\n\nLinkedHashMap Implement a map interface. maintained the insertion order.\n");
		Map<String,Student> mapobject1 = new LinkedHashMap<>();
		mapobject1.put("stud2", new Student(3, "Soro", "Sandona", "2018-09-09"));
		mapobject1.put("stud1", new Student(1, "Silue", "Amara", "1995-09-09"));
		mapobject1.put("stud4", new Student(10, "Kone", "Ismael", "2002-09-09"));
		mapobject1.put("stud3", new Student(9, "Dao", "Fatim", "1997-09-09"));
		
		 //transform map to set
        Set<Map.Entry<String, Student>> entries1 = mapobject1.entrySet();
        //declare an iterator
        Iterator<Map.Entry<String, Student>> iterator1 = entries1.iterator();
        System.out.println("The map entries are:");
        System.out.println("        KEY     VALUE");
        //iterate and print key and value pairs.
        while(iterator1.hasNext()) {
            Map.Entry<String, Student> entry = iterator1.next();
            System.out.println("\t" + entry.getKey() + "\t" +entry.getValue());
        }
        
        System.out.println("\n\nTreeMap Implement a map interface. order element in natural oder/ascending order.\n");
		Map<String,Student> mapobject2 = new TreeMap<>();
		mapobject2.put("stud2", new Student(3, "Soro", "Sandona", "2018-09-09"));
		mapobject2.put("stud1", new Student(1, "Silue", "Amara", "1995-09-09"));
		mapobject2.put("stud3", new Student(10, "Kone", "Ismael", "2002-09-09"));
		mapobject2.put("stud4", new Student(9, "Dao", "Fatim", "1997-09-09"));
		
		
		 //transform map to set
        Set<Map.Entry<String, Student>> entries2 = mapobject2.entrySet();
        //declare an iterator
        Iterator<Map.Entry<String, Student>> iterator2 = entries1.iterator();
        System.out.println("The map entries are:");
        System.out.println("        KEY     VALUE");
        //iterate and print key and value pairs.
        while(iterator2.hasNext()) {
            Map.Entry<String, Student> entry = iterator2.next();
            System.out.println("\t" + entry.getKey() + "\t" +entry.getValue());
        }
        
        
	}

}
