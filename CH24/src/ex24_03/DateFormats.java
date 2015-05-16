package ex24_03;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormats {

    public static void main(String[] args) throws ParseException {
        printStyles("2014/05/11");
    }

    public static void printStyles(String dateStr) throws ParseException {
        Locale japan = new Locale("ja", "JP");
        Date date = DateFormat.getDateInstance(DateFormat.SHORT, japan).parse(dateStr);
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(date));
        System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM).format(date));
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(date));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(date));
    }
}