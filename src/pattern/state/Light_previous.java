package pattern.state;

public class Light_previous {
	private static int ON = 0;
	private static int OFF = 1;
	private static int SLEEPING = 2;
	private int state;

	public Light_previous() {
		state = OFF; // 초기 상태는 형광등이 꺼져 있는 상태
	}

	public void off_button_pushed() {
		if (state == OFF) { // 꺼진 상태에서 다시 Off 버튼을 눌러도 아무 일이 일어나지 않음
			System.out.println("반응 없음");
		} else {
			System.out.println("Light OFF");
			state = OFF;
		}
	}
	
	public void on_button_pushed() {
		if (state == ON) {	// 켜진 상태에서 On 버튼을 한 번 더 누르면 취침등 상태가 됨
			System.out.println("취침등 상태");
			state = SLEEPING;
		} else {
			System.out.println("Light ON");
			state = ON;
		}
	}
}
