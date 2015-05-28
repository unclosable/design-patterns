package behavioral_patterns.observer.src;

import java.util.ArrayList;
import java.util.List;

public class Report {
	private ReportType reportType;
	private List<ReportObserver> reportObservers;

	public Report() {
		this.reportObservers = new ArrayList<ReportObserver>();
		this.reportType = ReportType.DAY_REPORT;
	}

	public void addObserver(ReportObserver observer) {
		this.reportObservers.add(observer);
	}

	public void removeObserver(ReportObserver observer) {
		this.reportObservers.remove(observer);
	}

	public void reportupgrade() {
		ReportType[] reportTypes = ReportType.values();
		this.reportType = reportTypes[(this.reportType.ordinal() + 1) % reportTypes.length];
		System.out.println("report upgrade to " + this.reportType);
		notifyObservers();
	}

	private void notifyObservers() {
		for (ReportObserver observer : this.reportObservers) {
			observer.update(this.reportType);
		}
	}

}
