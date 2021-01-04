package Enums_classes;

/**
 * 
 * @author sandonasoro
 * 
 *Java enum with constructor for example.
 * Constructor accept one String argument action
 */
public enum TrafficSignal {
	
	//this will call enum constructor with one String argument
	//RED GREEN AND ORANGE are the name and wait,go,slow down are values

	RED("wait"), GREEN("go"), ORANGE("slow down");
	
	private  String trafic_Color;
	
	//enum constructor - can not be public or protected
   //Read more: https://www.java67.com/2018/07/java-enum-with-constructor-example.html#ixzz6hK4NIMrq
	 TrafficSignal(String traficColor ) {
		
		 this.trafic_Color=traficColor;
	}
	 
	 public String getAction(){
	        return this.trafic_Color;
	    }
}
