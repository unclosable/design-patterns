package structural_patterns.bridge.src.human;

import structural_patterns.bridge.src.humanimp.HumanImp;

public abstract class Human {

	protected HumanImp humanImp;

	public Human(HumanImp humanImp) {
		this.humanImp = humanImp;
	}

	public abstract void talk();

	public abstract void walk();

	public abstract void social();

	public HumanImp getImp() {
		return this.humanImp;
	}

}
