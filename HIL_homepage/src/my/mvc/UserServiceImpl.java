package my.mvc;

public class UserServiceImpl implements UserService{
	public UserServiceImpl(){
		System.out.print("UserService ������ ȣ��");
	}
	public void addUser(UserVO user){
		System.out.print("UserService: addUser()" + user.getUserName());
	}
	
}
