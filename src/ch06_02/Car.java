package ch06_02;

public class Car {
	
	String company; // 자동차제조회사
	String model;   // 자동차 모델
	String color = "black";   // 자동차 색상
	int max_speed = 200;  // 최고 속도
	
	int speed;      // 현재 스피트
	int rpm;        // 현재 rpm
	int[] price = {10,20,30};  // 배열 -> 필드 1개로 취급
	
	Driver driver = new Driver();  // 이것도 필드
//	Driver driver;  // 초기화를 하지 않아도 됨. 호출 할때 해도 된다.
	
	// 생성자. 일반메서드 보단 위. 필드(멤버변수) 보단 아래. 변수가 선언되고 변경되어야 하므로
	public Car(String company, String model) {  // 매개변수로 초기화
		// TODO Auto-generated constructor stub
		this.company = company;  // 일반적으로 같은 이름을 쓰는데. 공부로
		this.model = model;      // 같은 이름으로 쓰면 가까운 변수(매개변수)를 쓰게 되서 동작이 이상하게 됨. 그래서 this를 써주면 밖 멤버변수를 가르킨다
	}
	
	// 생성자 오버로딩
	public Car(String company, String model, String color) {  
		// TODO Auto-generated constructor stub
		this.company = company; 
		this.model = model;  
		this.color = color;  
	}
	
	// 기본생성자 별도로 생성
	public Car() {  
	}
	
	void drive(int rpm) {
		speed = 50;
		this.rpm = rpm;
		System.out.println(speed);
		System.out.println(this.rpm);
	}
	
	// 같은 메소드 두개 오류남. int speed 매개변수를 추가하면 오류사라짐. 다른 놈으로 취급. 이게 바로 오버로딩
	// 메소드의 이름은 같으나 매개변수가 틀린 
	void drive(int rpm, int speed) {
		speed = 50;
		this.rpm = rpm;
		System.out.println(speed);
		System.out.println(this.rpm);
	}
	
	void drive(String model) {  // 같은 매개변수의 수지만 다른 매개변수로도 가능
		this.model = model;
		System.out.println(this.model);
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	double divide(int a, int b) {
		return a / b;
	}
	
	String modelReturn(String model) {
		this.model = model;
		return this.model;
	}
	
	int[] scores(int math, int eng, int kor) {
		int[] scores = {math, eng, kor};
		return scores;
	}
	
	Driver driverInfo(Driver driver) {  // 어렵네. 위에 String modelReturn 이랑 같다고 보면되다고 쌤이..
		this.driver =driver;
		return this.driver;
	}
}
