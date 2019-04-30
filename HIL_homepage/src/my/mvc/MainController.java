package my.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher; //http://acua.tistory.com/entry/import-javaxservlet-cannot-be-resolved
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller		// �� ������ Controller���� ��Ÿ���� ���ִ� �����̴�.
public class MainController{  // Ŭ�������� Controller.java �̸� �ȵȴ�.

	// comment Add
	
		@RequestMapping(value="/_", method=RequestMethod.GET)
		public String start(){
			return "start_page";	// forward�Ǵ� view�̸� -> /WEB-INF/Test2.jsp�� ��. ������ �Է��� http://localhost:8080/HIL_homepage/
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
