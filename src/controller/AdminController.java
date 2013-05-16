package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.AdminServiceImpl;
import dto.Login;
import dto.Member;


@Controller
public class AdminController {
	
	@RequestMapping("/adminLogin")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value="adminId") String adminId,
			@RequestParam(value="password") String password){
		System.out.println("adminLogin");
		ModelAndView mav = new ModelAndView();
		
		boolean flag = new AdminServiceImpl().login(new Login(adminId, password));
		
		if(flag){ // 로그인 성공
			mav.setViewName("main"); 
		}else{
			mav.setViewName("error");
		}
		return mav;
	}
	
	
	@RequestMapping("/fillMemberTable")
	public ModelAndView fillMemberTable(HttpServletRequest request,
										HttpServletResponse response){
		System.out.println("fillMemberTable");
		ModelAndView mav = new ModelAndView();
		
		ArrayList<Member> memberList = new AdminServiceImpl().fillMemberTable();
		System.out.println("회원 수: " + memberList.size());
		
		
		JSONArray dataJ = JSONArray.fromObject(memberList);
		System.out.println(dataJ);
		
		request.setAttribute("result", dataJ);
		mav.setViewName("result");
		return mav;
	}
}
