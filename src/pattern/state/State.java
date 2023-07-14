package pattern.state;

public interface State {
	public void on_button_pushed(Light_state light);
	public void off_button_pushed(Light_state light);
}
