package com.office.library.admin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminMemberService {

	final static public int ADMIN_ACCOUNT_ALREADY_EXIST = 0; // 중복ID
	final static public int ADMIN_ACCOUNT_CREATE_SUCCESS = 1; // 가입성공
	final static public int ADMIN_ACCOUNT_CREATE_FAIL = -1; // 가입실패(Insert 실패)

	@Autowired
	AdminMemberDao adminMemberDao;

	public int createAccountConfirm(AdminMemberVo adminMemberVo) {
		System.out.println("[AdminMemberService] createAccountConfirm()");

		boolean isMember = adminMemberDao.isAdminMember(adminMemberVo.getA_m_id());

		if (!isMember) {
			int result = adminMemberDao.insertAdminAccount(adminMemberVo);

			if (result > 0)
				return ADMIN_ACCOUNT_CREATE_SUCCESS;
			else
				return ADMIN_ACCOUNT_CREATE_FAIL;
		} else {
			return ADMIN_ACCOUNT_ALREADY_EXIST;
		}

	}
}
