package behavioral_patterns.template.src;

public class Sql extends SqlTemplate {

	@Override
	public void select() {
		System.out.println("查询123");
	}

	@Override
	public void insert() {
		System.out.println("写入123");

	}

}
