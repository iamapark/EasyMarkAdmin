package service;

import java.util.ArrayList;

import dao.LoginDAO;
import dao.MembershipDAO;
import dto.Login;
import dto.Member;

public class AdminServiceImpl implements AdminServiceIF {

	@Override
	public boolean login(Login login) {
		return LoginDAO.getInstance().login(login);
	}

	public ArrayList<Member> fillMemberTable() {
		return MembershipDAO.getInstance().fillMemberTable();
	}
}
