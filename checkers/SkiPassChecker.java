package EPAM2015_lab8.checkers;

import EPAM2015_lab8.SkiPass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Encapsulates static values of day begin, day end, season begin, season end,
 * which are by inheritors can be used. Provides setters and getters for listed values
 * and also determines two public methods:
 * - public abstract boolean check(SkiPass toCheck);
 * - public abstract String getRejectCause();
 * , which have to implement all inheritors.
 */
public abstract class SkiPassChecker {
    /*
    Array, which stores two integer values:
    - hours of day, that represent day begin;
    - minutes of day, that represent day begin;
    On the basis of these values Date instance of current day begin will be generated by static method
    public static Date getDayBegin().
    */
    private static int[] dayBegin = {9, 0};
    /*
    Array, which stores two integer values:
    - hours of day, that represent midday;
    - minutes of day, that represent midday;
    On the basis of these values Date instance of current day midday will be generated by static method
    public static Date getMidday().
    */
    private static int[] midday = {13, 0};
    /*
    Array, which stores two integer values:
    - hours of day, that represent day end;
    - minutes of day, that represent day end;
    On the basis of these values Date instance of current day end will be generated by static method
    public static Date getDayEnd().
    */
    private static int[] dayEnd = {17, 0};
    private static Date seasonBegin = getDayBegin();
    private static Date seasonEnd = getDayEnd();

    public static Date getDayBegin() {
        GregorianCalendar curMoment = new GregorianCalendar();
        curMoment.set(Calendar.HOUR_OF_DAY, dayBegin[0]);
        curMoment.set(Calendar.MINUTE, dayBegin[1]);
        curMoment.set(Calendar.SECOND, 0);
        curMoment.set(Calendar.MILLISECOND, 0);
        return curMoment.getTime();
    }

    public static void setDayBegin(int[] dayBegin) {
        SkiPassChecker.dayBegin = dayBegin;
    }

    public static Date getMidday() {
        GregorianCalendar curMoment = new GregorianCalendar();
        curMoment.set(Calendar.HOUR_OF_DAY, midday[0]);
        curMoment.set(Calendar.MINUTE, midday[1]);
        curMoment.set(Calendar.SECOND, 0);
        curMoment.set(Calendar.MILLISECOND, 0);
        return curMoment.getTime();
    }

    public static void setMidday(int[] midday) {
        SkiPassChecker.midday = midday;
    }

    public static Date getDayEnd() {
        GregorianCalendar curMoment = new GregorianCalendar();
        curMoment.set(Calendar.HOUR_OF_DAY, dayEnd[0]);
        curMoment.set(Calendar.MINUTE, dayEnd[1]);
        curMoment.set(Calendar.SECOND, 0);
        curMoment.set(Calendar.MILLISECOND, 0);
        return curMoment.getTime();
    }

    public static void setDayEnd(int[] dayEnd) {
        SkiPassChecker.dayEnd = dayEnd;
    }

    public static Date getSeasonBegin() {
        return seasonBegin;
    }

    public static Date getSeasonEnd() {
        return seasonEnd;
    }

    public static void setSeasonBegin(Date seasonBegin) {
        SkiPassChecker.seasonBegin = seasonBegin;
    }

    public static void setSeasonEnd(Date seasonEnd) {
        SkiPassChecker.seasonEnd = seasonEnd;
    }

    public abstract boolean check(SkiPass toCheck);

    public abstract String getRejectCause();
}
