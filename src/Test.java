public class Test {
	public static void main(String[] args) {
		UserManager um = new UserManager(15);
		User user = new User(15,"xiaowang","wang","12345");
		User user3 = new User(25,"xiaozhao","zhao","555555");
		um.add(user3);
		um.add(user);
		um.add(user);
		um.list();
		System.out.println("--------------------");
		System.out.println(um.load("xiaowang").toString());
		User user1 = new User(19,"xiaowang","liu","1321548");
		um.update(user1);
		um.list();
		System.out.println("--------------------");
		User user2 = new User(26,"xiaozhou","zhou","321325654");
		um.add(user2);
		um.list();
		
		um.delete("xiaowang");
		um.list();
	}
}

 