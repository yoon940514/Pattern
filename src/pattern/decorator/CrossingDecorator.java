package pattern.decorator;

public class CrossingDecorator extends AddDisplayDecorator{

	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
		// TODO Auto-generated constructor stub
	}
	
	private void drawCrossing() {
		System.out.println("교차로 표시");
	}
	
	public void draw() {
		super.draw();
		drawCrossing();
	}

}
