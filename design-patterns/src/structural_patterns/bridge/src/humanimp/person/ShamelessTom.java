package structural_patterns.bridge.src.humanimp.person;

import structural_patterns.bridge.src.humanimp.ShamelessHumanImp;

public class ShamelessTom extends ShamelessHumanImp {

	@Override
	public void shameless() {
		System.out.println("I'm shamelesssssssssssssssssssss....");
	}

	@Override
	public void talk() {
		System.out.println("I'm shamelesssssssssssssssssssss....");
	}

	@Override
	public void walk() {
		System.out.println("I'm shamelesssssssssssssssssssss....");
	}

	@Override
	public void social() {
		System.out.println("I'm shamelesssssssssssssssssssss....");
	}

}
