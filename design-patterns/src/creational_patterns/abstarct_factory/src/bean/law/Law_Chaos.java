package creational_patterns.abstarct_factory.src.bean.law;

import creational_patterns.abstarct_factory.src.basis.LawType;

public class Law_Chaos implements Law {
	private LawType lawType;

	public Law_Chaos() {
		this.lawType = LawType.Chaos;
	}

	@Override
	public String toString() {
		return "Law:" + lawType;
	}

}
