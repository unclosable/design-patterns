package structural_patterns.decorator.src;

public class ChocolateMilk implements Food {
	private Food food;

	public ChocolateMilk(Food food) {
		this.food = food;
	}

	@Override
	public void name() {
		System.out.println("chocolate");
		food.name();
	}

	@Override
	public void eatIt() {
		System.out.println("eat chocolate");
		food.eatIt();
	}

}
