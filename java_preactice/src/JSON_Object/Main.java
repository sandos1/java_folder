package JSON_Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;    
public class Main {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a simple Json object using JSONobject constructor/Java JSON Encode
		JSONObject obj=new JSONObject();    
		  obj.put("name","sonoo");    
		  obj.put("age",27);    
		  obj.put("salary",600000);    
		   System.out.println(obj);    
		   
		   
		// Java JSON Encode using Map/ create a json object using Map
		   
		   Map<String,Object> obj1=new HashMap<>();    
		   obj1.put("name","sandona");    
		   obj1.put("age",new Integer(20));    
		   obj1.put("salary",new Double(650000));   
		   String jsonText = JSONValue.toJSONString(obj1);  
		   
		   System.out.println(jsonText);  
		   
		   
		//Java JSON Array Encode  
		  
		   JSONArray arr = new JSONArray();  
		   arr.add("Methan");    
		   arr.add(new Integer(40));    
		   arr.add(new Double(700000));   
		   arr.add(obj1);
		   System.out.println(arr);  
		   
		   //adding an array to jsonObject obj
		   obj.put("emp", arr);
		   System.out.println(obj); 
		   
		   
		  //Java JSON Array Encode using List/ creating a json Array using List 
		   List arr2 = new ArrayList();  
		   arr2.add("sonoo");    
		   arr2.add(new Integer(27));    
		   arr2.add(new Double(600000));   
		   String jsonText1 = JSONValue.toJSONString(arr);  
		   System.out.print(jsonText1);  
	}

}
