package studentinfo;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import junit.framework.TestCase;

public class DateUtilTest extends TestCase {

    public void testCreateDate() {
        Date date = DateUtil.createDate(2000, 1, 1);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
//        assertThat(calendar.get(Calendar.YEAR))
//        assertThat(calendar.get(Calendar.YEAR))
//        assertThat(calendar.get(Calendar.YEAR))
    }

}
