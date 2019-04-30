package my.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my.mvc/applicationContext.xml");
		
		UserService userService1 = (UserService)ctx.getBean("userService");
		UserVO aaa = (UserVO)ctx.getBean("aaa");
		userService1.addUser(aaa);
	}
}
