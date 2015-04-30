package structural_patterns.proxy.src;

public class TrollPieMachineProxy extends TrollPieMachine {

	private final int THE_MAX_PIE_NO = 4;
	private int pie_no;

	@Override
	public void makeTrollPie(Troll troll) {
		if (pie_no < THE_MAX_PIE_NO) {
			super.makeTrollPie(troll);
			pie_no++;
		} else {
			System.out.println(troll + "can't be maked to a pie");
		}
	}

}
