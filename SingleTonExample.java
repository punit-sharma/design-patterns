package designPatterns;

public class SingleTon {

	private static SingleTon myInstance;
	//Singleton uses private/protected Construtor
	private SingleTon(){ 
		
	}
	//a global access to the instance
	public static SingleTon getInstance()
	{
		if(myInstance==null)
			myInstance=new SingleTon();
		return myInstance;
	}
	
}

public class SingleTonExample{
	
	public static void main(String args[]){
		
		SingleTon s1=SingleTon.getInstance();
		SingleTon s2=SingleTon.getInstance();
	
		if(s1==s2)
		System.out.println("Objects are of same instance");
	}
	
	
} 
