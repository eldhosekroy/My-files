package statice;

public class HelloStatice {
	
	int a=10;
	
	public static void main(String hii[]) {
		
		HelloStatice h=new HelloStatice();
		
		System.out.println(h.a);
		
		h.hello();
		kope();
		
	}
	
	void hello() {
		System.out.println("hello world");
	}
	
	static void kope() {
		System.out.println("Kope enta ethu ");
	}

}
