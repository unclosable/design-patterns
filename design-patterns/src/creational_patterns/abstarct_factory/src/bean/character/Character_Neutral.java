package creational_patterns.abstarct_factory.src.bean.character;

import creational_patterns.abstarct_factory.src.basis.CharacterType;

public class Character_Neutral implements Character {
	private CharacterType characterType;

	public Character_Neutral() {
		this.characterType = CharacterType.Neutral;
	}

	@Override
	public String toString() {
		return "Character:" + characterType;
	}

}
