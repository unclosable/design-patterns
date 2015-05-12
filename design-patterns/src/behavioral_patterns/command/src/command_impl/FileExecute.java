package behavioral_patterns.command.src.command_impl;

import behavioral_patterns.command.src.Command;
import behavioral_patterns.command.src.Target;

public class FileExecute extends Command {
	private behavioral_patterns.command.src.FileExecute old;
	private Target target;

	public FileExecute() {
		this.old = null;
		this.target = null;
	}

	@Override
	public void execute(Target target) {
		this.old = target.getFileExecute();
		target.setFileExecute(behavioral_patterns.command.src.FileExecute.DELETE);
		this.target = target;
	}

	@Override
	public void undo() {
		if (this.old != null && this.target != null)
			this.target.setFileExecute(old);
	}

}
