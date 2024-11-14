package kr.or.jbedu.board;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest privateTest = new PrivateTest();
		privateTest.a = 100;  // 자동완성으로 b 는 보이지 않음 private 
		
		Board board = new Board();
		board.setTitle("안녕하세요. 가입인사드려요");
		String title = board.getTitle();
	}

}
