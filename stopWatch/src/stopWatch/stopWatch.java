package stopWatch;

import java.time.format.DateTimeFormatter;
//import java.sql.Date;
import java.time.LocalDateTime;

public class stopWatch {
	LocalDateTime startTime, endTime;

	public stopWatch() {
		
		startTime = LocalDateTime.now();
	}

	public static void main() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy / MM / dd HH: mm: ss");
		stopWatch sW = new stopWatch();
		
		LocalDateTime tmp = sW.startTime;
		
		System.out.println(dtf.tmp);
	}
}
