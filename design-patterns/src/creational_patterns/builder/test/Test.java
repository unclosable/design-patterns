package creational_patterns.builder.test;

import creational_patterns.builder.builder.PersonBuilder;
import creational_patterns.builder.builder.PersonBuilder.Person;
import creational_patterns.builder.enumeration.CharacterType;
import creational_patterns.builder.enumeration.LawType;
import creational_patterns.builder.enumeration.Sex;

public class Test {
	@org.junit.Test
	public void test() {
		Person person = new PersonBuilder(CharacterType.Goodness)
				.withSex(Sex.MAN).withLawType(LawType.Chaos).build();
		System.out.println(person);

		Person person2 = new PersonBuilder(LawType.Neutrality)
				.withSex(Sex.UNKNOWN).withCharacterType(CharacterType.Evil)
				.build();
		System.out.println(person2);
	}

}
