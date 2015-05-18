package behavioral_patterns.mediator.test;

import org.junit.Test;

import behavioral_patterns.mediator.src.Company;
import behavioral_patterns.mediator.src.CompanyImpl;
import behavioral_patterns.mediator.src.Staff;
import behavioral_patterns.mediator.src.Work;
import behavioral_patterns.mediator.src.staffimpl.Designer;
import behavioral_patterns.mediator.src.staffimpl.Implementer;
import behavioral_patterns.mediator.src.staffimpl.Programmer;
import behavioral_patterns.mediator.src.staffimpl.Tester;

public class TestMain {
	@Test
	public void test() {
		Company company = new CompanyImpl();
		Staff designer = new Designer();
		Staff programmer = new Programmer();
		Staff tester = new Tester();
		Staff implementer = new Implementer();

		company.addStaff(designer);
		company.addStaff(programmer);
		company.addStaff(tester);
		company.addStaff(implementer);

		designer.companyWork(Work.DESIGN);
		programmer.companyWork(Work.PROGRAMME);
		tester.companyWork(Work.TEST);
		implementer.companyWork(Work.IMPLEMENT);

	}

}
