package kr.or.jbedu.board;

import java.util.Date;

public class Board {   // dto 객체. Data Transfer Object
	private String title;    // 제목
	private String content;  // 내용
	private String writer; // 글쓴이
	private Date date;  // 글쓴 날짜 (날짜 타입 -> Date)
	private int boardNum; // 글번호
	
	public void setTitle(String title) {  // setter 메소드
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
}
