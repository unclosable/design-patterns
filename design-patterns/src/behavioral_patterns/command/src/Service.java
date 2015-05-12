package behavioral_patterns.command.src;

public class Service {
	private Command lastExecute;

	public void doSomeThing(Command command, Target target) {
		this.lastExecute = command;
		this.lastExecute.execute(target);
	}

	public void unDoLastThing() {
		this.lastExecute.undo();
	}

}
