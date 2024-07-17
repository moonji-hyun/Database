package com.board.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.www.dto.MemberDTO;

public class MemberDAO {
	// 회원 DB에 대한 C()회원가입), R(로그인), U(회원정보수정), D(회원탈퇴)
	
	public MemberDAO() {
		 
	} // 기본 생성자
	
	
	public MemberDAO(Connection connection) {
		// 커스텀 생성자
	}

	public void register() { // 회원가입 처리
		
	}
	
	public MemberDTO login(Connection connection, MemberDTO loginMemberDTO) { // 로그인 처리
		// db에 있는 로그인 값을 찾아 옴
		// connection -> main에서 넘어온 jdbc1,2단계
		// loginMemberDTO -> 로그인시 키보드로 입력받은 id, pw 값이 들어있다. 
		
		MemberDTO loginDTO = new MemberDTO();  // 리턴용 빈객체
		try {
			String sql = "select mno, mid, mpw, mdate from member where mid=? and mpw=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginMemberDTO.getMid());
			//  service에서 받은 id가 첫번째 ? 에 적용
			preparedStatement.setString(2, loginMemberDTO.getMpw());
			//  service에서 받은 pw가 두번째 ? 에 적용
			ResultSet resultSet = preparedStatement.executeQuery();
			// 위에서 만든 쿼리문을 실행하고 결과를 resultSet표로 받는다.
			
			while(resultSet.next()) {
				loginDTO.setMno(resultSet.getInt("mno"));
				loginDTO.setMid(resultSet.getString("mid"));
				loginDTO.setMpw(resultSet.getString("mpw"));
				loginDTO.setMdate(resultSet.getDate("mdate"));
				// resultSEt 표에 있는 정보를 MemberDTO 객체에 넣음
				
			} //while문 종료
			
			resultSet.close();
			preparedStatement.close();
									
			
		} catch (SQLException e) {
			System.out.println("찾는 id와 pw가 없습니다.");
			System.out.println("관리자 : sql문을 확인하세요");
			System.out.println("회원 : id와 pw를 확인하세요");
			e.printStackTrace();
		}
		
		return loginDTO;  // 로그인 완성용 객체
	}
	
	public void update() { // 회원 정보 수정
		
	}
	
	public void delete() { // 회원 탈퇴
		
	}
	
}
