package behavioral_patterns.observer.src;

public enum ReportType {
	DAY_REPORT, MONTH_REPORT, SEASION_REPORT, YEAR_REPORT;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
