package creational_patterns.abstarct_factory.src.bean.law;

import creational_patterns.abstarct_factory.src.basis.LawType;

public class Law_Lawful implements Law {
	private LawType lawType;

	public Law_Lawful() {
		this.lawType = LawType.Lawful;
	}

	@Override
	public String toString() {
		return "Law:" + lawType;
	}

}
