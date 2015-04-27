package creational_patterns.builder.builder;

import creational_patterns.builder.enumeration.CharacterType;
import creational_patterns.builder.enumeration.LawType;
import creational_patterns.builder.enumeration.Sex;

public class PersonBuilder {
	private CharacterType characterType;
	private LawType lawType;
	private Sex sex;

	public PersonBuilder(CharacterType characterType) {
		this.characterType = characterType;
	}

	public PersonBuilder(LawType lawType) {
		this.lawType = lawType;
	}

	public PersonBuilder(Sex sex) {
		this.sex = sex;
	}

	public PersonBuilder withCharacterType(CharacterType characterType) {
		this.characterType = characterType;
		return this;
	}

	public PersonBuilder withLawType(LawType lawType) {
		this.lawType = lawType;
		return this;
	}

	public PersonBuilder withSex(Sex sex) {
		this.sex = sex;
		return this;
	}

	public CharacterType getCharacterType() {
		return characterType;
	}

	public void setCharacterType(CharacterType characterType) {
		this.characterType = characterType;
	}

	public LawType getLawType() {
		return lawType;
	}

	public void setLawType(LawType lawType) {
		this.lawType = lawType;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Person build() {
		return new Person(this);
	}

	public class Person {
		private CharacterType characterType;
		private LawType lawType;
		private Sex sex;

		private Person(PersonBuilder personBuilder) {
			this.characterType = personBuilder.getCharacterType();
			this.lawType = personBuilder.getLawType();
			this.sex = personBuilder.getSex();
		}

		public CharacterType getCharacterType() {
			return characterType;
		}

		public void setCharacterType(CharacterType characterType) {
			this.characterType = characterType;
		}

		public LawType getLawType() {
			return lawType;
		}

		public void setLawType(LawType lawType) {
			this.lawType = lawType;
		}

		public Sex getSex() {
			return sex;
		}

		public void setSex(Sex sex) {
			this.sex = sex;
		}
		@Override
		public String toString(){
			return sex+" "+ lawType+" "+characterType;
		}

	}
}
