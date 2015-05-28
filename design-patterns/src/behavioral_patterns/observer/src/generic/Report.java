package behavioral_patterns.observer.src.generic;

import behavioral_patterns.observer.src.ReportType;

public class Report extends Observerable<Race, Report, ReportType> {
	private ReportType reportType;

	public Report() {
		this.reportType = ReportType.DAY_REPORT;
	}

	public void up() {
		ReportType[] reportTypes = ReportType.values();
		this.reportType = reportTypes[(this.reportType.ordinal() + 1) % reportTypes.length];
		System.out.println("report upgrade to " + this.reportType);
		notifyObservers(reportType);
	}

}
