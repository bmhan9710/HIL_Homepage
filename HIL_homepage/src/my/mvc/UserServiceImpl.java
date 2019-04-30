package my.mvc;

public class UserServiceImpl implements UserService{
	public UserServiceImpl(){
		System.out.print("UserService 생성자 호출");
	}
	public void addUser(UserVO user){
		System.out.print("UserService: addUser()" + user.getUserName());
	}
	
}
