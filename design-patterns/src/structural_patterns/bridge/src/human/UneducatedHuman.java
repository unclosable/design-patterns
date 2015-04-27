package structural_patterns.bridge.src.human;

import structural_patterns.bridge.src.humanimp.UneducatedHumanImp;

public class UneducatedHuman extends Human {

	public UneducatedHuman(UneducatedHumanImp humanImp) {
		super(humanImp);
	}

	@Override
	public UneducatedHumanImp getImp() {
		return (UneducatedHumanImp) humanImp;
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
