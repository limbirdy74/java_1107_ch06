package kr.or.jbedu.member;

public class MainClass {

	public static void main(String[] args) {
		
		MemberDto memberDto = new MemberDto();
//		memberDto.memberAge; -> not visible 에러
		
		String id = "Tiger";
		String pw = "12345";
		String name = "홍길동";
		int age = 27;
		String phone = "010-1234-5678";
		String address = "서울시 용산구 용산구";
		
		memberDto.setMemberAge(age);
		// setter 사용 -> 메모니 내의 memberDto 객체 내 memberAge 필드 값으로 27 저장
		memberDto.setMemberAddress(id);
		memberDto.setMemberAddress(pw);
		memberDto.setMemberAddress(name);
		memberDto.setMemberAddress(phone);
		memberDto.setMemberAddress(address);
		
		System.out.println(memberDto.getMemberAddress());
	}

}
