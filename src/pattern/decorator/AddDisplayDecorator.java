package pattern.decorator;

public abstract class AddDisplayDecorator extends Display {	// 다양한 추가 기능에 대한 공통 클래스
	private Display decoratedDisplay;

	public AddDisplayDecorator(Display decoratedDisplay) {
	this.decoratedDisplay = decoratedDisplay;
}
	public void draw() {
		decoratedDisplay.draw();
	}
}
