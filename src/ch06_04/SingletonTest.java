package ch06_04;

// singleton 디자인 패턴
public class SingletonTest {
	
	private int a;  // private. 해당 클래스 안에서만 사용가능. 접근지정자 
	
	private static SingletonTest singleton = new SingletonTest();
	
	private SingletonTest() {  
		
	}
	
	static SingletonTest getInstance() {  // 객체를 만들지 않고(인스턴스화)도 접근이 가능하게
		if (singleton == null) {  // 메모리에 없으면 생성해라
			singleton = new SingletonTest();
		}
		return singleton;
	}

}
