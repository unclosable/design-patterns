package behavioral_patterns.observer.src;

public class WestReport implements ReportObserver {

	@Override
	public void update(ReportType reportType) {
		switch (reportType) {
		case DAY_REPORT:
			System.out.println("WestReport 进化1" + reportType);
			break;
		case MONTH_REPORT:
			System.out.println("WestReport 进化2" + reportType);
			break;
		case SEASION_REPORT:
			System.out.println("WestReport 进化3" + reportType);
			break;
		case YEAR_REPORT:
			System.out.println("WestReport 进化4" + reportType);
			break;

		default:
			break;
		}
	}

}
