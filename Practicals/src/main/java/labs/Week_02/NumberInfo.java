package labs.Week_02;

public class NumberInfo {
	private int limit;
    private int value;
    
    public NumberInfo(int g) {
   	
   	this.limit = g;
   	 
    }
    
    public int getLimit(){
   	 return value;
    }
    
    public void setValue(int value) {
   	 this.value = value;
    }
    
    public void increment() {
   	 this.value++;
   	 if(this.value==limit) {
   		 this.value=0;
   	 }
    }
}
