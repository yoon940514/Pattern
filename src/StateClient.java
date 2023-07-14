
import pattern.state.Light_state;
public class StateClient {
	public static void main(String[] args) throws Exception {
		Light_state light_state = new Light_state();
		light_state.off_button_pushed();
		light_state.on_button_pushed();
		light_state.off_button_pushed();
		light_state.on_button_pushed();
		light_state.on_button_pushed();
		light_state.on_button_pushed();
		light_state.off_button_pushed();
	}
}
