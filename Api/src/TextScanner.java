
public class TextScanner {
	
	Hello obj;
	
	public TextScanner(Hello obj) {
		
		this.obj=obj;
		
	}
	
	void scan() {
		
		obj.onText("Scanned text");
		
	}

}
