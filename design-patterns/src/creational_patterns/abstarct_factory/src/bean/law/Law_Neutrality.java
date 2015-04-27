package creational_patterns.abstarct_factory.src.bean.law;

import creational_patterns.abstarct_factory.src.basis.LawType;

public class Law_Neutrality implements Law {
	private LawType lawType;

	public Law_Neutrality() {
		this.lawType = LawType.Neutrality;
	}

	@Override
	public String toString() {
		return "Law:" + lawType;
	}

}
