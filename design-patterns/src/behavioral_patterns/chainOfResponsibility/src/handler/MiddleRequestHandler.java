package behavioral_patterns.chainOfResponsibility.src.handler;

import behavioral_patterns.chainOfResponsibility.src.Request;
import behavioral_patterns.chainOfResponsibility.src.RequestHandler;
import behavioral_patterns.chainOfResponsibility.src.RequestType;
import behavioral_patterns.chainOfResponsibility.src.Response;

public class MiddleRequestHandler extends RequestHandler {

	public MiddleRequestHandler(RequestHandler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response handl(Request request) {
		Response response = new Response();
		response.setRequest(request);
		if (request.hasType(RequestType.TYPE3)) {
			printR(request);
			response.setMessage(response.getMessage() + " type3");
		}
		return super.handl(response);
	}

	@Override
	public Response handl(Response response) {
		if (response.getRequest().hasType(RequestType.TYPE3)) {
			printR(response.getRequest());
			response.setMessage(response.getMessage() + " type3");
		}
		return super.handl(response);
	}

	@Override
	public String toString() {
		return "MiddleRequestHandler";
	}

}
