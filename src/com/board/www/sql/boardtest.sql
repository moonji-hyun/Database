drop table board ; -- 기존의 board 테이블 삭제

drop sequence board_seq ; -- 자동번호 생성 제거

create table board(
	bno number(5) primary key,
	btitle nvarchar2(30) not null,
	bcontent nvarchar2(1000) not null,
	bwriter nvarchar2(10) not null,
	bdate date not null
); -- board 테이블 생성

create sequence board_seq increment by 1 start with 1 nocycle nocache;

insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
	values(board_seq.nextval, '비오네요', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
	values(board_seq.nextval, '안녕하세요~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
	values(board_seq.nextval, '감사합니다~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
	values(board_seq.nextval, '수고하셨네요', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
	values(board_seq.nextval, '화이팅하세요~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
	values(board_seq.nextval, '반갑습니다.', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
	
select * from board;	

update  board set btitle = '비가오네요~' where btitle='비오네요';

-- memeber 테이블 용

create table member (
	mno number(5) primary key,
	mid nvarchar2(10) not null,
	mpw nvarchar2(10) not null,
	mdate Date not null
); -- 시퀀스는 board꺼 돌려씀


select * from member;

insert into member (mno, mid, mpw, mdate)
	values(board_seq.nextval, '김기원', '1234', sysdate);
insert into member (mno, mid, mpw, mdate)
	values(board_seq.nextval, '문지현', '1234', sysdate);
insert into member (mno, mid, mpw, mdate)
	values(board_seq.nextval, '김지선', '1234', sysdate);
insert into member (mno, mid, mpw, mdate)
	values(board_seq.nextval, '조용재', '1234', sysdate);
insert into member (mno, mid, mpw, mdate)
	values(board_seq.nextval, '함시은', '1234', sysdate);	
insert into member (mno, mid, mpw, mdate)
	values(board_seq.nextval, '이영훈', '1234', sysdate);	













