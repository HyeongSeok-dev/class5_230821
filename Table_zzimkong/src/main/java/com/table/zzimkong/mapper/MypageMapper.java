package com.table.zzimkong.mapper;

import org.apache.ibatis.annotations.*;

import com.table.zzimkong.vo.*;

@Mapper
public interface MypageMapper {
	
	// 회원정보 조회
	MemberVO selectMember(MemberVO member);
	
	// 회원정보 수정
	// => 주의! 파라미터가 복수개일 경우 @Param 어노테이션 사용하여 파라미터 이름 지정 필수!
	int updateMember(@Param("member") MemberVO member, @Param("newPasswd") String newPasswd);
	
	// 닉네임 중복확인
	MemberVO selectUserNick(MemberVO member);
}
