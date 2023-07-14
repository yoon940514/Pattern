package pattern.decorator;

public class LaneDecorator extends AddDisplayDecorator{

	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
		// TODO Auto-generated constructor stub
	}
	
	private void drawLane() {
		System.out.println("차선 표시");
	}
	
	public void draw() {
		super.draw();
		drawLane();
	}

}
