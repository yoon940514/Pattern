package pattern.command;

public class AlarmStopCommand implements Command {

	private Alarm alarm;

	public AlarmStopCommand(Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public void execute() {
		alarm.turnOff();
	}

}
