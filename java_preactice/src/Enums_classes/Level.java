package Enums_classes;

public enum Level {
	
	SMALL,
	MEDIUM,
	HIGH;
	
	public int sum(int x,int y) {
		
		if(this==SMALL) {
			return (x+y);
		}
		else if(this==MEDIUM) {
			return (x-y);
		}
		else if(this==HIGH) {
			return (x*y);
		}
		return (x/y);
	}
	
	public void level() {
			
			switch (this) {
			case SMALL: System.out.println("Level is "+this.SMALL);
			case MEDIUM: System.out.println("Level is "+this.MEDIUM);
			case HIGH: System.out.println("Level is "+this.HIGH);
			
			}
		}

}
