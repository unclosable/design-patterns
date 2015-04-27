package creational_patterns.abstarct_factory.src.bean.personmaker;

import creational_patterns.abstarct_factory.src.bean.character.Character;
import creational_patterns.abstarct_factory.src.bean.character.Character_Evil;
import creational_patterns.abstarct_factory.src.bean.law.Law;
import creational_patterns.abstarct_factory.src.bean.law.Law_Chaos;

public class PersonCampMaker_ChaosEvil implements PersonCampMaker {

	@Override
	public Law createLaw() {
		return new Law_Chaos();
	}

	@Override
	public Character createCharacter() {
		return new Character_Evil();
	}

}
