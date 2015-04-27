package structural_patterns.bridge.src.humanimp.person;

import structural_patterns.bridge.src.humanimp.UneducatedHumanImp;

public class SillyJimmy extends UneducatedHumanImp {

	@Override
	public void uneducated() {
		System.out.println("I know nothing");
	}

	@Override
	public void talk() {
		System.out.println("I know nothing");
	}

	@Override
	public void walk() {
		System.out.println("I know nothing");
	}

	@Override
	public void social() {
		System.out.println("I know nothing");
	}

}
