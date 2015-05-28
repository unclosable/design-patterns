package behavioral_patterns.observer.test;

import org.junit.Test;

import behavioral_patterns.observer.src.EastReport;
import behavioral_patterns.observer.src.Report;
import behavioral_patterns.observer.src.ReportObserver;
import behavioral_patterns.observer.src.WestReport;

public class Testmain {
	@Test
	public void test() {
		Report report = new Report();
		ReportObserver observer1 = new WestReport();
		ReportObserver observer2 = new EastReport();
		report.addObserver(observer1);
		report.addObserver(observer2);
		report.reportupgrade();
		report.reportupgrade();
		report.reportupgrade();
		report.reportupgrade();
		report.reportupgrade();
		report.reportupgrade();
		report.reportupgrade();
		report.reportupgrade();
	}

}
