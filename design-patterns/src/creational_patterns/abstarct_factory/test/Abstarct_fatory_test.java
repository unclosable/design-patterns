package creational_patterns.abstarct_factory.test;

import org.junit.Test;

import creational_patterns.abstarct_factory.src.bean.character.Character;
import creational_patterns.abstarct_factory.src.bean.law.Law;
import creational_patterns.abstarct_factory.src.bean.personmaker.PersonCampMaker;
import creational_patterns.abstarct_factory.src.bean.personmaker.PersonCampMaker_ChaosEvil;
import creational_patterns.abstarct_factory.src.bean.personmaker.PersonCampMaker_LawfulGoodness;

public class Abstarct_fatory_test {
	/*
	 * 当需要构建一个人的二维阵营，一个“守序善良”的人创造的law对象和character对象
	 * 必须是一定的，他们是天然耦合的，使用PersonCampMaker_LawfulGoodness实例构建
	 * 的law对象和character对象是成对出现的 ，PersonCampMaker_ChaosEvil混乱邪恶同理
	 */
	@Test
	public void test() {
		PersonCampMaker personCampMaker = new PersonCampMaker_LawfulGoodness();
		Law law = personCampMaker.createLaw();
		Character character = personCampMaker.createCharacter();
		System.out.println(law);
		System.out.println(character);

		personCampMaker = new PersonCampMaker_ChaosEvil();
		law = personCampMaker.createLaw();
		character = personCampMaker.createCharacter();
		System.out.println(law);
		System.out.println(character);
	}

}
