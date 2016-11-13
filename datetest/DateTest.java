package datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	/**
	 * @deprecated
	 */
	public void doValami() {

	}

	public static void main(String[] args) {

		// Date date1 = new Date();
		// Date date2 = new Date();
		// long diff = date2.getTime() - date1.getTime();
		// Date d = new Date(diff);
		// System.out.println(d);

		// Calendar cal = Calendar.getInstance();
		// int actualYear = cal.get(Calendar.YEAR);
		// int actualMonth = cal.get(Calendar.MONTH) + 1;
		// int actualDay = cal.get(Calendar.DAY_OF_MONTH);
		//
		// cal.set(Calendar.DAY_OF_MONTH, 32);

		// Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// System.out.println(sdf.format(date));
		Date newDate;
		try {
			newDate = sdf.parse("2015.09.01 10:24:31");
			Calendar cal = Calendar.getInstance();
			System.out.println(newDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
