package behavioral_patterns.mediator.src;

public abstract class StaffBasic implements Staff {

	private Company company;

	@Override
	public void joinCompany(Company company) {
		System.out.println(this + " join the company");
		this.company = company;
	}

	@Override
	public void work(Work work) {
		String out = this + " ";
		switch (work) {
		case DESIGN:
			out += "check the design";
			break;
		case IMPLEMENT:
			out += "implement the project";
			break;
		case PROGRAMME:
			out += "check the code";
			break;
		case TEST:
			out += "take the test";
			break;
		default:
			break;
		}
		System.out.println(out);
	}

	@Override
	public void companyWork(Work work) {
		System.out.println(this + work.toString());
		if (this.company != null) {
			this.company.work(this, work);
		}
	}

	@Override
	public abstract String toString();

}
