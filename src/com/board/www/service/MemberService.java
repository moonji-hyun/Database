package com.board.www.service;

import java.sql.Connection;
import java.util.Scanner;

import com.board.www.dao.MemberDAO;
import com.board.www.dto.MemberDTO;

public class MemberService {
	// 회원에 대한 처리 C(회원가입), R(로그인), U(회원정보수정), D(회원탈퇴)
	
	public MemberDTO memberMenu(Scanner scanner, MemberDTO loginMember, Connection connection) { // while문으로 부메뉴 반복 처리
		System.out.println("회원관리용 서비스로 진입");
		boolean memberRun = true;
		while (memberRun) {
			System.out.println("1.회원가입 | 2.로그인 | 3.회원수정 | 4.회원탈퇴 | 5.종료");
			System.out.print(">>>");
			int memberSelect = scanner.nextInt();
			switch (memberSelect) {
			case 1:
				join();
				break;
			case 2:
				loginMember = login(scanner, loginMember, connection);
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("회원관리 메뉴를 종료합니다.");
				memberRun = false;
			} // switch문 종료
		} // while문 종료
		
		return loginMember;
		
	} //memberMenu() 메서드 종료
	
	public void join() { // 회원가입용 메서드
		System.out.println("회원가입 메서드로 진입");
	} // join() 메서드 종료
	
	public MemberDTO login(Scanner scanner, MemberDTO loginmember, Connection connection) { // 로그인용 메서
		System.out.println("로그인 메서드로 진입");
		System.out.print("id : ");
		String loginId = scanner.next();
		System.out.print("pw : ");
		String loginPw = scanner.next();
		MemberDTO loginMemberDTO = new MemberDTO(loginId, loginPw);  
		// 키보드로 받은 id,pw 값을 객체로 생성, setter안쓰는 방법
		
		System.out.println();
		MemberDAO memberDAO = new MemberDAO();  // 객체가 생성/  connection을 여기에 쓰면 생성되면서 1단,2단계 정보가 들어감.
		return memberDAO.login(connection, loginMemberDTO);  // connection : 호출할때 정보를 밀어넣음
		// db에서 넘어온 객체를 리턴한다.
	} // login() 메서드 종료
	
	public void modify() {
		System.out.println("회원정보 수정 메서드로 진입");
	} // modify() 메서드 종료
	
	public void delete() {
		System.out.println("회원탈퇴 메서드로 진입");
	} // delete() 메서드 종료
	
	
}
