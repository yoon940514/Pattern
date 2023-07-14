package pattern.state;

public class OFF implements State{

	@Override
	public void on_button_pushed(Light_state light) {
		System.out.println("Light ON");
		light.setState(new ON());
		
	}

	@Override
	public void off_button_pushed(Light_state light) {
		System.out.println("반응 없음");
	}

}
