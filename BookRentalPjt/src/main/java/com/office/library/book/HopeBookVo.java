package com.office.library.book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HopeBookVo {

	int hb_no;
	String hb_name;
	String hb_author;
	String hb_publisher;
	String hb_publish_year;
	String hb_reg_date;
	String hb_mod_date;
	int hb_result;
	String hb_result_last_date;
	
	int u_m_no; // 사용자 번호
	String u_m_id; // 사용자 아이디
	String u_m_pw; // 사용자 비밀번호
	String u_m_name; // 사용자 이름
	String u_m_gender; // 사용자 성별
	String u_m_mail; // 사용자 메일
	String u_m_phone; // 사용자 연락처
	String u_m_reg_date; // 사용자 등록일
	String u_m_mod_date; // 사용자 수정일
	
}
