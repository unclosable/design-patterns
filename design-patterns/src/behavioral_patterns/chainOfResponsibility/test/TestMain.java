package behavioral_patterns.chainOfResponsibility.test;

import org.junit.Test;

import behavioral_patterns.chainOfResponsibility.src.HandlerMaster;
import behavioral_patterns.chainOfResponsibility.src.Request;
import behavioral_patterns.chainOfResponsibility.src.RequestType;
import behavioral_patterns.chainOfResponsibility.src.Response;

public class TestMain {
	@Test
	public void test1() {
		HandlerMaster master = new HandlerMaster();
		Request request1 = new Request("testRequest", RequestType.TYPE1,
				RequestType.TYPE3, RequestType.TYPE2);
		Request request2 = new Request("testRequest", RequestType.TYPE1,
				RequestType.TYPE3);

		Response response1 = master.handle(request1);
		System.out.println(response1.getMessage());
		Response response2 = master.handle(request2);
		System.out.println(response2.getMessage());
	}

}
