package behavioral_patterns.observer.src.generic;

import behavioral_patterns.observer.src.ReportType;

public class AAReport implements Race {

	@Override
	public void upDate(Report subject, ReportType thetype) {
		switch (thetype) {
		case DAY_REPORT:
			System.out.println("EastReport 进化1" + thetype);
			break;
		case MONTH_REPORT:
			System.out.println("EastReport 进化2" + thetype);
			break;
		case SEASION_REPORT:
			System.out.println("EastReport 进化3" + thetype);
			break;
		case YEAR_REPORT:
			System.out.println("EastReport 进化4" + thetype);
			break;

		default:
			break;
		}
	}

}
