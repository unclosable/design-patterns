package creational_patterns.abstarct_factory.src.bean.personmaker;

import creational_patterns.abstarct_factory.src.bean.character.Character;
import creational_patterns.abstarct_factory.src.bean.character.Character_Goodness;
import creational_patterns.abstarct_factory.src.bean.law.Law;
import creational_patterns.abstarct_factory.src.bean.law.Law_Lawful;

public class PersonCampMaker_LawfulGoodness implements PersonCampMaker {

	@Override
	public Law createLaw() {
		return new Law_Lawful();
	}

	@Override
	public Character createCharacter() {
		return new Character_Goodness();
	}

}
