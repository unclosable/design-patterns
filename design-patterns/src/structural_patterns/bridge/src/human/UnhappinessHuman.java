package structural_patterns.bridge.src.human;

import structural_patterns.bridge.src.humanimp.UnhappinessHumanImp;

public class UnhappinessHuman extends Human {

	public UnhappinessHuman(UnhappinessHumanImp humanImp) {
		super(humanImp);
	}

	@Override
	public UnhappinessHumanImp getImp() {
		return (UnhappinessHumanImp) humanImp;
	}

	@Override
	public void talk() {
		getImp().talk();
	}

	@Override
	public void walk() {
		getImp().walk();
	}

	@Override
	public void social() {
		getImp().social();
	}

}
