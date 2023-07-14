package pattern.state;

public class ON implements State{

	@Override
	public void on_button_pushed(Light_state light) {
		System.out.println("취침등 ON");
		
	}

	@Override
	public void off_button_pushed(Light_state light) {
		System.out.println("Light OFF");
		light.setState(new OFF());
		
		
	}

}
