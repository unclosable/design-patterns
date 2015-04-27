package structural_patterns.composite.test;

import org.junit.Test;

import structural_patterns.composite.src.DataBase;
import structural_patterns.composite.src.DataBaseServer;

public class CompositeTest {
	@Test
	public void test(){
		DataBase base=new DataBaseServer().getAService().get(0);
		base.print();
	}

}
