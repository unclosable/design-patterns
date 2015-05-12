package behavioral_patterns.command.src;

public class Target {
	private FileExecute fileExecute;
	private SqlExecute sqlExecute;

	public FileExecute getFileExecute() {
		return fileExecute;
	}

	public void setFileExecute(FileExecute fileExecute) {
		this.fileExecute = fileExecute;
	}

	public SqlExecute getSqlExecute() {
		return sqlExecute;
	}

	public void setSqlExecute(SqlExecute sqlExecute) {
		this.sqlExecute = sqlExecute;
	}

}
