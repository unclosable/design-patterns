package behavioral_patterns.command.test;

import org.junit.Test;

import behavioral_patterns.command.src.Service;
import behavioral_patterns.command.src.Target;
import behavioral_patterns.command.src.command_impl.SqlExecute;

public class TestMain {

	@Test
	public void test1() {
		Service service = new Service();
		Target target = new Target();
		service.doSomeThing(new SqlExecute(), target);
		service.unDoLastThing();
	}

}
