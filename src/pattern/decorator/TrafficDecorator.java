package pattern.decorator;

public class TrafficDecorator extends AddDisplayDecorator {

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
		// TODO Auto-generated constructor stub
	}

	private void drawTraffic() {
		System.out.println("교통량 표시");
	}
	
	public void draw() {
		super.draw();
		drawTraffic();
	}
}
