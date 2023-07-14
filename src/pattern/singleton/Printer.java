package pattern.singleton;

public class Printer {
	private static Printer printer = new Printer();
	private Printer() {
		
	}
	
	public synchronized static Printer getPrinter() throws Exception {
		if (printer == null) {
			Thread.sleep(3);
			printer = new Printer();
		}
			return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
