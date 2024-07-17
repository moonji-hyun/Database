package com.board.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.www.dto.BoardDTO;
import com.board.www.dto.MemberDTO;

public class BoardDAO {
	// 데이터베이스 처리 용(CRUD)
	
	public void list(Connection connection, MemberDTO loginMember) { 
		
		//BoardDTO boardDTO =null;
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from board order by bno desc";
			// board 테이블에 있는 데이터를 내림차순으로 가져온다.
			PreparedStatement preparedStatement = connection.prepareStatement(sql); // 3단계
			ResultSet resultSet = preparedStatement.executeQuery(); // 4단계
		//	BoardDTO boardDTO = new BoardDTO();  // BoardDTO 호출
			System.out.println(resultSet.next());
			while(resultSet.next()) { // 표형식으로 리턴된 값 유무 판단.
//				
				System.out.printf("%02d\t",resultSet.getInt("bno"));
				System.out.print(resultSet.getString("btitle")+"\t");
//				System.out.print(resultSet.getString("bcontent")+"\t");
				System.out.print(resultSet.getString("bwriter")+"\t");
				System.out.println(resultSet.getDate("bdate")+"\t");
				
				/* 
				 System.out.printf("%2d\t",resultSet.getInt("bno"));
            	System.out.printf("%-10s\t",resultSet.getString("btitle"));
            	//System.out.print(resultSet.getString("bcontent")+"\t");
            	System.out.printf("%-6s\t",resultSet.getString("bwriter"));
            	System.out.printf("%10s\n",resultSet.getDate("bdate"));
				
				 */
				
//				boardDTO.setBno(resultSet.getInt("bno"));
//				boardDTO.setBtitle(resultSet.getString("btitle"));
//				boardDTO.setBcontent(resultSet.getString("bcontent"));
//				boardDTO.setBwriter(resultSet.getString("bwriter"));
//				boardDTO.setBdate(resultSet.getDate("bdate"));
			}
			// 5단계
			resultSet.close();
			preparedStatement.close();
			// connection은 계속 써야하기때문에 close하지 않는다.
			
		} catch (SQLException e) {
			System.out.println("BoardDAO.list() sql문 오류");
			e.printStackTrace();
		} 
		
		
		
	}
	
	
	
}
