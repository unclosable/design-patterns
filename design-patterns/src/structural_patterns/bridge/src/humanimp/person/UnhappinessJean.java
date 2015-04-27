package structural_patterns.bridge.src.humanimp.person;

import structural_patterns.bridge.src.humanimp.UnhappinessHumanImp;

public class UnhappinessJean extends UnhappinessHumanImp {

	@Override
	public void unhappiness() {
		System.out.println("I'm unhappinesssssssssssssssssss...");
	}

	@Override
	public void talk() {
		System.out.println("I'm unhappinesssssssssssssssssss...");
	}

	@Override
	public void walk() {
		System.out.println("I'm unhappinesssssssssssssssssss...");
	}

	@Override
	public void social() {
		System.out.println("I'm unhappinesssssssssssssssssss...");
	}

}
