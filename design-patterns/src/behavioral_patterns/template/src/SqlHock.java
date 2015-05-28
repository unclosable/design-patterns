package behavioral_patterns.template.src;

public class SqlHock extends SqlTemplate {

	@Override
	public void select() {
		System.out.println("查询456");
	}

	@Override
	public void selectHock() {
		System.out.println("查询hock7899");
	}

	@Override
	public void insert() {
		System.out.println("写入fffffff");

	}

}
