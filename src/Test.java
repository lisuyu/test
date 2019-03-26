public class Test {
	public static void main(String[] args) {
		UserManager um = new UserManager(15);
		User user = new User(15,"xiaowang","wang","12345");
		um.add(user);
		um.add(user);
		um.list();
		System.out.println(um.load("xiaowang").toString());
		User user1 = new User(19,"xiaowang","liu","1321548");
		um.update(user1);
		um.list();
	}
}

 