package creational_patterns.abstarct_factory.src.bean.character;

import creational_patterns.abstarct_factory.src.basis.CharacterType;

public class Character_Goodness implements Character {
	private CharacterType characterType;

	public Character_Goodness() {
		this.characterType = CharacterType.Goodness;
	}

	@Override
	public String toString() {
		return "Character:" + characterType;
	}

}
