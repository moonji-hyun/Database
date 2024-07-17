package com.board.www.dto;

import java.sql.Date;

public class BoardDTO {
	// board 객체 처리, 세터, 게터
	
	// 필드  getter,setter 만들기 위해서는 private이 앞에 붙어야함.
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	
	// 생성자(기본생성자)
	public BoardDTO() {
		
	}

	public BoardDTO(int bno, String btitle, String bcontent, String bwriter, Date bdate) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;
	}  // insert, select 활용

	// 메서드 (게터, 세터)
	public int getBno() {
		return bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public String getBwriter() {
		return bwriter;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	
}
