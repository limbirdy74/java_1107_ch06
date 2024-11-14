package ch06_04;

public class Calculator {
	
	public static final double PI = 3.14; // 정적필드. final 를 붙여주면 더 이상변경 불가
	// 모든 객체에서 변하지 않는 상수값으로 공유
	
	int first;
	int second;
	
	public Calculator() {

	}	
	
	public Calculator(int first, int second) {
		// TODO Auto-generated constructor stub
		this.first = first;    
		this.second = second; 
	}
	
	int add2() {
		return this.first + this.second;
	}
	
	int add(int first, int second) {
		
		this.first = first;    // 이 부분을 주석으로 막아도 동작은 된다. 이 부분이 없으면 this.first  등이 초기화되지 않고 
		this.second = second;  // 메모리에 남지않음
		
		return this.first + this.second;
	}
	
	int sub(int first, int second) {
		
		this.first = first;    
		this.second = second;  
		
		return this.first - this.second;
	}
	
	int mul(int first, int second) {
		
		this.first = first;    
		this.second = second;  
		
		return this.first * this.second;
	}
	
	double divide(int first, int second) {
		
		this.first = first;    
		this.second = second;  
		
		return this.first / this.second;
	}	
	
	double average() {
		double avg = add2() / 2;  // 클래스 내부 메소드 호출 가능
		return avg;
	}

}
