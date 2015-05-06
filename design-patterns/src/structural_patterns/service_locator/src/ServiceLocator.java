package structural_patterns.service_locator.src;


public class ServiceLocator {
	private ServiceCache serviceCache = new ServiceCache();

	public ServiceA getService(String serviceJndiName) {
		ServiceA serviceA = this.serviceCache.getService(serviceJndiName);
		if (serviceA != null)
			return serviceA;
		else {
			initContext icx = new initContext();
			serviceA = (ServiceA) icx.getService(serviceJndiName);
			this.serviceCache.putService(serviceA);
			return serviceA;
		}
	}

}
