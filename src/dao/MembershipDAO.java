package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.Member;

public class MembershipDAO {
	private static MembershipDAO instance = null;
	private SqlMapClient sqlMapper = null;

	public static MembershipDAO getInstance(){
		if(instance == null)
			instance = new MembershipDAO();
		return instance;
	}

	private MembershipDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Member> fillMemberTable() {
		ArrayList<Member> memberList = null;
		
		try{
			memberList = (ArrayList<Member>)sqlMapper.queryForList("fillMemberTable");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return memberList;
	}
}
