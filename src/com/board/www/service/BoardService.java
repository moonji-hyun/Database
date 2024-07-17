package com.board.www.service;

import java.sql.Connection;

import com.board.www.dao.BoardDAO;
import com.board.www.dto.MemberDTO;

public class BoardService {
	// board의 부메뉴(c, r, u, d, l)
	
	
	// 메서드
	public void list(Connection connection, MemberDTO loginMember) { // 게시물 목록 보기
		BoardDAO boardDAO = new BoardDAO();
		System.out.println("=======================");
		System.out.println("======대나무숲 게시판======");
		System.out.println("[게시물목록]");
		System.out.println("------------------------------------------");
		System.out.println("no       title       writer      date     ");
		System.out.println("------------------------------------------");
		
		boardDAO.list(connection, loginMember);
		
	}
	
}
