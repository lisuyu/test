
public class UserManager {
	User[] users;
	static int nums;
	
	public UserManager(int size){
		nums = 0;
		users = new User[size];
	}
	
	public void add(User user){
		if(nums>=users.length){
			System.out.println("Array is full!");
		}
		User u = load(user.getUsername());
		if(u!=null){
			System.out.println("This user was exist!");
			return;
		}
		users[nums] = user;
		nums++;
	}
	
	
	public void update(User user){
		User u = load(user.getUsername());
		if(u==null){
			System.out.println("The user does not exist!");
		}
		u.setAge(user.getAge());
		u.setNickname(user.getNickname());
		u.setPassword(user.getPassword());
	}
	
	public void delete(String username){
		User u = load(username);
		if (u==null) {
			System.out.println("The user does not exist!");
		}
		int index = -1;
		for (int i = 0; i < nums; i++) {
			if(users[i]==u)
				index = i;
		}
		for (int i = index; i < nums; i++) {
			users[i] = users[i+1];
		}
		users[nums] = null;
		nums--;
	}
	
	public User load(String username){
		for(int i = 0;i<nums;i++){
			User user = users[i];
			if(users[i].getUsername()==username){
				return user;
			}
		}
		return null;
	}
	
	public void login(String username,String password){
		User u = load(username);
		if(u==null){
			System.out.println("The user does not exist!");
		}
		if(u.getPassword()!=password){
			System.out.println("Password error");
		}
		System.out.println("Welcome,"+username);
	}
	
	public void list(){
		for (int i = 0; i < nums; i++) {
			System.out.println(users[i].toString());
		}
	}
}
