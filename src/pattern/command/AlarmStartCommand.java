package pattern.command;

public class AlarmStartCommand implements Command {

	private Alarm alarm;

	public AlarmStartCommand(Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public void execute() {
		alarm.turnOn();
	}
}
