import pattern.command.Alarm;
import pattern.command.AlarmStartCommand;
import pattern.command.AlarmStopCommand;
import pattern.command.Button;
import pattern.command.Command;
import pattern.command.Lamp;
import pattern.command.LampOffCommand;
import pattern.command.LampOnCommand;

public class CommandClient {

	public static void main(String[] args) throws Exception {
		Lamp lamp = new Lamp();
		Command LampOnCommand = new LampOnCommand(lamp);
		Command LampOffCommand = new LampOffCommand(lamp);
		
		Alarm alarm = new Alarm();
		Command alarmStartCommand = new AlarmStartCommand(alarm);
		Command alarmStopCommand = new AlarmStopCommand(alarm);

		Button LampOnButton = new Button(LampOnCommand);	// 램프를 켜는 커맨드를 설정함
		LampOnButton.pressed();	// 버튼을 눌리면 램프를 켜는 기능이 실행됨
		
		Button LampOffButton = new Button(LampOffCommand);	// 램프를 끄는 커맨드를 설정함
		LampOffButton.pressed();	// 버튼을 눌리면 램프를 끄는 기능이 실행됨
		
		Button alarmStartButton = new Button(alarmStartCommand);
		alarmStartButton.pressed();
		
		Button alarmStopButton = new Button(alarmStopCommand);
		alarmStopButton.pressed();
	}
}
