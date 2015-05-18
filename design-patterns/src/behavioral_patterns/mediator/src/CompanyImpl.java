package behavioral_patterns.mediator.src;

import java.util.ArrayList;
import java.util.List;

public class CompanyImpl implements Company {

	private List<Staff> staffs;

	public CompanyImpl() {
		this.staffs = new ArrayList<Staff>();
	}

	@Override
	public void addStaff(Staff staff) {
		this.staffs.add(staff);
		staff.joinCompany(this);
	}

	@Override
	public void work(Staff staff, Work work) {
		for (Staff staff2 : this.staffs) {
			if (staff != staff2)
				staff2.work(work);
		}
	}

}
