package structural_patterns.composite.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBaseServer {
	public List<DataBase> getAService() {
		List<DataBase> dataBases = new ArrayList<DataBase>();
		dataBases.add(new DataBase(Arrays.asList(
				new Table(Arrays.asList(new Feild("feild1"),
						new Feild("feild2"), new Feild("feild3"), new Feild(
								"feild4"), new Feild("feild5"))),
				new Table(Arrays.asList(new Feild("feild1"),
						new Feild("feild2"), new Feild("feild3"), new Feild(
								"feild4"), new Feild("feild5"))),
				new Table(Arrays.asList(new Feild("feild1"),
						new Feild("feild2"), new Feild("feild3"), new Feild(
								"feild4"), new Feild("feild5"))),
				new Table(Arrays.asList(new Feild("feild1"),
						new Feild("feild2"), new Feild("feild3"), new Feild(
								"feild4"), new Feild("feild5"))))));
		return dataBases;
	}

}
