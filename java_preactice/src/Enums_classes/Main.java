package Enums_classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiply
		int res = Level.HIGH.sum(3, 4);
		//subtraction
		int res1 = Level.MEDIUM.sum(3, 4);
		//addition
		int res2 = Level.SMALL.sum(3, 4);
		Level.HIGH.level();
		Level.MEDIUM.level();
		
		LevelwithContructor[] levelsContructor= LevelwithContructor.values();
		for (LevelwithContructor level:levelsContructor) {
			
			System.out.println(level.name() +" : "+level.getLevelCode());
		}
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		
		System.out.println(LevelwithContructor.HIGH.getLevelCode());
		
		
		//TraficSignal Enum class with constructor
		//let's print name of each enum and there action
	      // - Enum values() examples
	      TrafficSignal[] signals = TrafficSignal.values();
	   
	      for(TrafficSignal signal : signals){
	          //Java name example - Java getter method example
	          System.out.println("name : "
	                             + signal.name()
	                             + " action: "
	                             + signal.getAction());	
	      }

}
	
}
