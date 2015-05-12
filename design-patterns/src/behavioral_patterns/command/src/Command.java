package behavioral_patterns.command.src;

public abstract class Command {

	public abstract void execute(Target target);

	public abstract void undo();

}
