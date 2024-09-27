package com.office.library.book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RentalBookVo {

	int rb_no;
	String rb_start_date;
	String rb_end_date;
	String rb_reg_date;
	String rb_mod_date;

	int b_no;
	String b_thumbnail;
	String b_name;
	String b_author;
	String b_publisher;
	String b_publish_year;
	String b_isbn;
	String b_call_number;
	int b_rantal_able;
	String b_reg_date;
	String b_mod_date;

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
