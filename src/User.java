
public class User {
	private int age;
	private String username;
	private String nickname;
	private String password;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int age, String username, String nickname, String password) {
		super();
		this.age = age;
		this.username = username;
		this.nickname = nickname;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", username=" + username + ", nickname="
				+ nickname + ", password=" + password + "]";
	}
	
}
