package behavioral_patterns.template.src;

public abstract class SqlTemplate {

	public final void querySQL() {
		getConnection();
		select();
		selectHock();
		insert();
		closeConnection();
	}

	public final void getConnection() {
		System.out.println("提供建立链接的方法，不可以重写");
	}

	// 必须实现的select
	public abstract void select();

	// select的“钩子”
	public void selectHock() {
	}

	public abstract void insert();

	public final void closeConnection() {
		System.out.println("提供销毁链接的方法，不可以重写");
	}

}
