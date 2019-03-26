
public class UserManager {
	User[] users;
	static int nums;
	
	public UserManager(int size){
		nums = 0;
		users = new User[size];
	}
	
	public void add(User user){
		if(nums>=users.length){
			System.out.println("Array is full");
		}
		User u = null;
		u = load(user.getUsername());
		if(u!=null){
			System.out.println("This user was exist!");
		}
		users[nums] = user;
		nums++;
	}
	
	public void update(User user){
		User u = null;
		u = load(user.getUsername());
		if(u!=null){
			u.setAge(user.getAge());
			u.setNickname(user.getNickname());
			u.setPassword(user.getPassword());
		}
	}
	
	public void delete(String username){
		
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
	
	public void list(){
		for (int i = 0; i < nums; i++) {
			System.out.println(users[i].toString());
		}
	}
}
