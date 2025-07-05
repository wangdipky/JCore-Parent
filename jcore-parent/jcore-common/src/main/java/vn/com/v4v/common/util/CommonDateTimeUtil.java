package vn.com.v4v.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Name: CommonDateTimeUtil
 * Author: QuangDK
 * Version: 1.0.0
 * CreatedDate: 05/07/2025
 */
public class CommonDateTimeUtil {

    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String YYYYMMDD = "yyyyMMdd";
    public static final String YYYYMM = "yyyyMM";
    public static final String YYYY = "yyyy";
    public static final String YYYY_MM_DD_SEPERATE = "yyyy/MM/dd";

    /**
     * Get current datetime.
     *
     * @return {@link Date}
     */
    public static Date getSystemCurrentDateTime() {
        return new Date();
    }

    /**
     * Convert date followed .
     * param {@link Date}
     * param {@link String}
     * @return {@link String}
     */
    public static String formatDate(Date date, String pattern) {

        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }

}
