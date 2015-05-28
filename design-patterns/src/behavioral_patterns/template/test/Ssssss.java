package behavioral_patterns.template.test;

import org.junit.Test;

import behavioral_patterns.template.src.Sql;
import behavioral_patterns.template.src.SqlHock;
import behavioral_patterns.template.src.SqlTemplate;

public class Ssssss {
	@Test
	public void tets() {
		SqlTemplate sqlTemplate = new Sql();
		sqlTemplate.querySQL();
		SqlTemplate sqlTemplate2 = new SqlHock();
		sqlTemplate2.querySQL();
	}

}
