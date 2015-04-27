package structural_patterns.decorator.src;

public class Milk implements Food {

	@Override
	public void name() {
		System.out.println("milk");
	}

	@Override
	public void eatIt() {
		System.out.println("drink milk");
	}

}
