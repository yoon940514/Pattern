package pattern.singleton;

public class User  extends Thread{
	private String name;

	public User(String name) {
		super(name);
	}
	
//	public void print() throws Exception {
//		Printer.getPrinter().print(this.name + " " + Printer.getPrinter().toString());
//	}
	
	public void run() {
		try {
			Printer.getPrinter().print(Thread.currentThread().getName() + Printer.getPrinter().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
