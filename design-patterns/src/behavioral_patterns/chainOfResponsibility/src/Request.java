package behavioral_patterns.chainOfResponsibility.src;


public class Request {
	private String request;
	private RequestType[] requestTypes;

	public Request(String request, RequestType... requestTypes) {
		this.request = request;
		this.requestTypes = requestTypes;
	}

	public boolean hasType(RequestType requestType) {
		for (RequestType type : this.requestTypes) {
			if (type.equals(requestType))
				return true;
		}
		return false;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public RequestType[] getRequestTypes() {
		return requestTypes;
	}

	public void setRequestTypes(RequestType[] requestTypes) {
		this.requestTypes = requestTypes;
	}

}
