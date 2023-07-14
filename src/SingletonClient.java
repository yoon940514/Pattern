import pattern.singleton.User;

public class SingletonClient {
	private static final int User_NUM = 5;
	public static void main(String[] args) throws Exception {
		User[] user = new User[User_NUM];
		for (int i = 0; i < User_NUM; i++) {
			user[i] = new User((i+1)+"-thread");
//			user[i].print();
			user[i].start();
		}
	}
}
