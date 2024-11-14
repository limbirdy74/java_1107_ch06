package ch06_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Hyundai","Sonata");  // 인스턴스(객체) 생성. 생성자를 추가해서 매개변수를 채움
		                                         // 초기값이 넣으진 상태로 인스턴스 생성
		System.out.println(car1.max_speed);
//		car1.company = "Hyundai";
		car1.drive("K3");
		
		Car car2 = new Car("Kia", "K5");  
//		car2.company = "Kia";
		
		Car car3 = new Car("Ford", "ABC", "Black");  // 매개변수가 3개인 생성자 호출. 
//		Car car4 = new Car();  // 이러면 오류남. 기본 생성자가 다른 생성자를 만들면서 없어짐. 
		Car car4 = new Car();  // 기본 생성자를 만들어 넣으면서 오류해결
		
		car4.setModel("BMW");  // 메소드를 초기화하는 방법, 생성자로 초기화 하고나 함. car4.model = "BMW" 이런 식으로 안씀
		
		String carmodel = car4.modelReturn("Kia");
		
		int[] a = car4.scores(70, 60, 80);
		
		Driver driver = new Driver();
		Driver driver1 = car4.driverInfo(driver);
	}

}
