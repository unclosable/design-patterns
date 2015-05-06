package structural_patterns.service_locator.src.impl;

import structural_patterns.service_locator.src.ServiceA;

public class ServiceAimpl implements ServiceA {
	private String name;
	private int id;

	public ServiceAimpl(String serviceName) {
		this.name = serviceName;
		this.id = (int) Math.floor(Math.random() * 1000) + 1;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String say() {
		return "hello" + this.name + this.id;
	}

}
