package ch06_04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator(10, 20);
		
		int sum1;
		sum1 = cal1.add2();
		
		int sum2 = cal1.add(100,  200);
		
//		double area = cal1.PI * 10 * 10 ;  // 경고남
		double area = Calculator.PI * 10 * 10 ;  // 이렇게 사용하면 경고 안남. 객체를 만들지 않아도 접근가능
		
		System.out.println(area);
		
//		SingletonTest single1 = new SingletonTest(): // private 로 선언되어 오류남
		SingletonTest single1 = SingletonTest.getInstance();
		System.out.println(single1);
		SingletonTest single2 = SingletonTest.getInstance();
		System.out.println(single2);
		SingletonTest single3 = SingletonTest.getInstance();
		System.out.println(single3);  
		// 결과가 다 같음 주소임. 메모리에 있으면 또 만들지 않고 같은 주소를 반환
	}

}
