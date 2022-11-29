package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// 정적 타입이니까 클래스 이름으로 호출

		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다");
		} else System.out.println("다른 Singleton 객체입니다");
	}

}
