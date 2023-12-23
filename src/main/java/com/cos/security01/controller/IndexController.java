package com.cos.security01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // view를 리턴하겠다 !
public class IndexController {

	@GetMapping({"","/"})
	public String index() {
		// 머스테치 기본폴더 src/main/resources/
		// 뷰리졸버 설정 : templates (prefix), .mustache (suffix) - > 생략 가능
		return "index"; //src/main/resources/templates/index.mustache
	}
	
	@GetMapping("/user")
	public String user(){
	return "user";
	}

	@GetMapping("/admin")
	public String admin(){
	return "admin";
	}
	
	@GetMapping("/manager")
	public String manager(){
	return "manager";
	}
	
	@GetMapping("/login")
	public String login(){
	return "login";
	}
	
	@GetMapping("/join")
	public String join(){
	return "join";
	}
	
	@GetMapping("/joinProc")
	public @ResponseBody String joinProc(){
	return "회원 가입 완료됨 !";
	}
	
}