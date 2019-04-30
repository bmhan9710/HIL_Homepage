package my.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher; //http://acua.tistory.com/entry/import-javaxservlet-cannot-be-resolved
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller		// 본 파일이 Controller임을 나타나게 해주는 문구이다.
public class MainController{  // 클래스명이 Controller.java 이면 안된다.

	// comment Add
	
		@RequestMapping(value="/_", method=RequestMethod.GET)
		public String start(){
			return "start_page";	// forward되는 view이름 -> /WEB-INF/Test2.jsp가 됨. 브라우저 입력은 http://localhost:8080/HIL_homepage/
		}
		
		@RequestMapping(value="/main", method=RequestMethod.GET)
		public String main(){
			return "main_page";
		}
		
		@RequestMapping(value="/main/frame_i", method=RequestMethod.GET)
		public String frame1(){
			return "frame_intro";
		}
		
		@RequestMapping(value="/frame_m", method=RequestMethod.GET)
		public String frame2(){
			return "frame_members";
		}
}
