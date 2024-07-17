create tablespace board datafile 'c:\board.dbf' size 20m;
-- 10-3에 db생성

create user boardtest identified by boardtest ;
-- id boardtest /pw boardtest

grant connect, resource to boardtest;
-- boardtest 계정에게 접속권한, 일반조원 권한 부여

alter user boardtest default tablespace board ;
-- boardtest 계정에 기본 데이터베이스를 board로 지정

alter user boardtest temporary tablespace temp;
--boardtest 계정에 임시 데이터베이스 배정( 생략 가능 )

-- > boardtest 계정으로 접속
