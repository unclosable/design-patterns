package creational_patterns.abstarct_factory.src.bean.personmaker;

import creational_patterns.abstarct_factory.src.bean.character.Character;
import creational_patterns.abstarct_factory.src.bean.law.Law;

public interface PersonCampMaker {
	Law createLaw();

	Character createCharacter();
}
