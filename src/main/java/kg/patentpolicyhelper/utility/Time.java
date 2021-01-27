package kg.patentpolicyhelper.utility;

import java.time.format.DateTimeFormatter;

public class Time {
    public static final String DATE_TIME_FORMAT = "dd.MM.yyyy HH:mm";
    public static final String DATE_TIME_WITH_SS_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    public static final String DATE_V2_FORMAT = "yyyy-MM-dd";

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
    public static final DateTimeFormatter DATE_TIME_WITH_SS_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_WITH_SS_FORMAT);
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    public static final DateTimeFormatter DATE_V2_FORMATTER = DateTimeFormatter.ofPattern(DATE_V2_FORMAT);
}
