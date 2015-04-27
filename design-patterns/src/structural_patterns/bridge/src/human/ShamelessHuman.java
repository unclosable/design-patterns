package structural_patterns.bridge.src.human;

import structural_patterns.bridge.src.humanimp.ShamelessHumanImp;

public class ShamelessHuman extends Human {

	public ShamelessHuman(ShamelessHumanImp humanImp) {
		super(humanImp);
	}

	@Override
	public ShamelessHumanImp getImp() {
		return (ShamelessHumanImp) humanImp;
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
