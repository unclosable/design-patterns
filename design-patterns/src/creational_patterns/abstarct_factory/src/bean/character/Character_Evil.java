package creational_patterns.abstarct_factory.src.bean.character;

import creational_patterns.abstarct_factory.src.basis.CharacterType;

public class Character_Evil implements Character {
	private CharacterType characterType;

	public Character_Evil() {
		this.characterType = CharacterType.Evil;
	}

	@Override
	public String toString() {
		return "Character:" + characterType;
	}

}
