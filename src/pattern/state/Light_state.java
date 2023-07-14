package pattern.state;

public class Light_state {
	private State state;
	
	public Light_state() {
		System.out.println("가동 시작. 현재 OFF상태");
		state = new OFF();
	}

	public void off_button_pushed() {
		state.off_button_pushed(this);
	}
	
	public void on_button_pushed() {
		state.on_button_pushed(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
}
