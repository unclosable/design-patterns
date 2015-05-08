package behavioral_patterns.chainOfResponsibility.src;

public class Response {
	private String message = "";
	private Request request;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

}
