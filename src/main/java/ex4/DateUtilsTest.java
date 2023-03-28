package ex4;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsTest {
    public static void main(String[] args) {
        Date date = new Date();
        String formatDate = "dd/MM/yyyy HH:mm";

        System.out.println(DateUtils.formatDefaut(date));
        System.out.println(DateUtils.format(formatDate, date));
    }
}
