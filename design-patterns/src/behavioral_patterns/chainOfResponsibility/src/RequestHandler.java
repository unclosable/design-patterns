package behavioral_patterns.chainOfResponsibility.src;

public abstract class RequestHandler {
	private RequestHandler handler;

	public RequestHandler(RequestHandler handler) {
		this.handler = handler;
	}

	public Response handl(Request request) {
		if (this.handler != null)
			return this.handler.handl(request);
		else
			return null;
	}

	public Response handl(Response Response) {
		if (this.handler != null)
			return this.handler.handl(Response);
		else
			return Response;
	}

	protected void printR(Response response) {
		System.out.println(response.getRequest().getRequest());
	}

	protected void printR(Request request) {
		System.out.println(this.toString() + ":" + request.getRequest());
	}

	@Override
	public abstract String toString();
}
