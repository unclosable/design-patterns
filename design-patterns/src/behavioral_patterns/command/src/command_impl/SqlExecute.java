package behavioral_patterns.command.src.command_impl;

import behavioral_patterns.command.src.Command;
import behavioral_patterns.command.src.Target;

public class SqlExecute extends Command {
	private Target target;
	private behavioral_patterns.command.src.SqlExecute old;

	public SqlExecute() {
		this.old = null;
		this.target = null;
	}

	@Override
	public void execute(Target target) {
		this.old = target.getSqlExecute();
		target.setSqlExecute(behavioral_patterns.command.src.SqlExecute.ROLLBACK);
		this.target = target;
	}

	@Override
	public void undo() {
		if (this.old != null && this.target != null)
			this.target.setSqlExecute(old);
	}

}
