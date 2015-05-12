package behavioral_patterns.command.src;

public enum SqlExecute {
	EXECUTE, ROLLBACK;
	private String sql;

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	@Override
	public String toString() {
		String str = null;
		switch (this) {
		case EXECUTE:
			str = "EXECUTE";
			break;
		case ROLLBACK:
			str = "ROLLBACK";
			break;
		default:
			break;
		}
		return this.sql + " is " + str;
	}

}
