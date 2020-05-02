package com.qyh.tpsofbd.common.utils;

import com.qyh.tpsofbd.common.constant.CommonConstant;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期类工具 含日期常量
 *
 * @author yt.wei
 * @version 0.1
 * @date 2018/5/2 17:15
 */
public class DateUtil {

    /**
     * 带毫秒的通用日期格式
     */
    private static final String DEFAULT_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * 带毫秒的ISO_8601时间格式
     */
    private static final String ISO_8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /**
     * 不带毫秒的ISO_8601时间格式
     */
    public static final String ISO_8601_MIN_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    /**
     * 通用日期格式
     */
    private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 带毫秒的通用时间格式
     */
    private static final String DEFAULT_MINUTES_PATTERN = "HH:mm:ss.SSS";

    /**
     * 不带毫秒的通用日期格式
     */
    public static final String DEFAULT_TIME_MIN_PATTERN = "yyyy-MM-dd HH:mm:ss";


    /**
     * 不带任何分隔符的纯数字日期时间字符串 - 无毫秒
     */
    public static final String DATE_TIME_ALL_NUMBER = "yyyyMMddHHmmss";

    /**
     * 通用日期格式无分隔符
     */
    private static final String DATE_ALL_NUMBER = "yyyyMMdd";

    /**
     * 中文日期格式
     */
    private static final String CHINESE_DATE_FMT = "yyyy年MM月dd日";

    /**
     * 中文日期格式
     */
    private static final String CHINESE_DATE_TIME_FMT = "yyyy年MM月dd日  HH:mm:ss";


    /**
     * ISO_8601日期格式的正则匹配
     */
    private static final String ISO_8601_MATCH_REGEX = "^\\d{4}-\\d{1,2}-\\d{1,2}T\\d{1,2}:\\d{1,2}:\\d{1,2}\\.?\\d{0,3}Z?[+-]?\\d{0,2}:?\\d{0,2}$";


    /**
     * 通用日期格式的正则匹配
     */
    private static final String DEFAULT_DATETIME_REGEX = "^\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.?\\d{0,3}$";


    /**
     * 一天的毫秒数
     */
    public static final long ONE_DAY_MILLISECOND = 86400000L;

    /**
     * 一小时的毫秒数
     */
    public static final int AN_HONR_MILLISECOND = 3600000;


    /**
     * 八个小时的毫秒数
     */
    public static final int EIGHT_HONR_MILLISECOND = 28800000;

    /**
     * 一周的毫秒数
     */
    public static final Long ONE_WEEK_MILLIS = 604800000L;

    /**
     * 30天的毫秒数
     */
    public static final Long ONE_MONTH_MILLIS = 2592000000L;

    /**
     * 一年的毫秒数
     */
    public static final Long ONE_YEAR_MILLIS = 30758400000L;

    /**
     * 十秒钟的毫秒数
     */
    public static final Long TEN_SECOND_MILLIS = 10 * 1000L;

    /**
     * 十分钟的毫秒数
     */
    public static final Long TEN_MINUTE_MILLIS = 10 * 60 * 1000L;

    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

    /**
     * 转为通用日期格式字符串
     *
     * @param date 日期
     * @return 日期字符串
     */
    public static synchronized String formatDateTime(final Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_TIME_MIN_PATTERN);
        return simpleDateFormat.format(date);
    }

    /**
     * 将通用日期格式字符串转为Date
     *
     * @param date 日期格式字符串
     * @return Date格式日期
     * @throws ParseException 转换异常
     */
    public static synchronized Date parseDateTime(final String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_TIME_MIN_PATTERN);
        return simpleDateFormat.parse(date);
    }

    /**
     * 转换字符时间为Date类型
     */
    public static final Date getDateWithString(String strDate) {
        SimpleDateFormat df = null;
        Date date = null;
        df = new SimpleDateFormat(DEFAULT_TIME_MIN_PATTERN);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(
                    "converting '" + strDate + "' to date with mask '" + DEFAULT_TIME_MIN_PATTERN
                            + "'");
        }
        try {
            date = df.parse(strDate);
        } catch (ParseException pe) {
            LOGGER.error("ParseException: " + pe);
        }
        return (date);
    }


    /**
     * This method generates a string representation of a date/time in the format you specify on input
     *
     * @param aMask the date pattern the string is in
     * @param strDate a string representation of a date
     * @return a converted Date object
     * @see SimpleDateFormat
     */
    public static Date convertStringToDate(String aMask, String strDate) throws ParseException {
        SimpleDateFormat df = null;
        Date date = null;
        df = new SimpleDateFormat(aMask);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("converting '" + strDate + "' to date with mask '" + aMask + "'");
        }

        try {
            date = df.parse(strDate);
        } catch (ParseException pe) {
            throw new ParseException(pe.getMessage(), pe.getErrorOffset());
        }

        return (date);
    }

    /**
     * 获取今天的日期
     *
     * @return 今天的日期
     */
    public static Calendar getToday() {
        Date today = getCurrentTimestamp();
        SimpleDateFormat df = new SimpleDateFormat(DEFAULT_DATE_PATTERN);

        String todayAsString = df.format(today);
        Calendar cal = new GregorianCalendar();
        cal.setTime(convertStringToDate(todayAsString));

        return cal;
    }

    /**
     * This method generates a string representation of a date's date/time in the format you specify on input
     *
     * @param aMask the date pattern the string is in
     * @param aDate a date object
     * @return a formatted string representation of the date
     * @see SimpleDateFormat
     */
    public static final String getDateTime(String aMask, Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate == null) {
            LOGGER.error("aDate is null!");
        } else {
            df = new SimpleDateFormat(aMask);
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    /**
     * This method generates a string representation of a date based on the System Property 'dateFormat' in the format you specify on input
     *
     * @param aDate A date to convert
     * @return a string representation of the date
     */
    public static final String convertDateToString(Date aDate) {
        return getDateTime(DEFAULT_DATE_PATTERN, aDate);
    }

    public static final String convertDateToString(String datePattern, Date aDate) {
        return getDateTime(datePattern, aDate);
    }

    /**
     * This method converts a String to a date using the datePattern
     *
     * @param strDate the date to convert (in format yyyy-mm-dd)
     * @return a date object
     */
    public static Date convertStringToDate(String strDate) {
        Date aDate = null;

        try {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("converting date with pattern: " + DEFAULT_DATE_PATTERN);
            }

            aDate = convertStringToDate(DEFAULT_DATE_PATTERN, strDate);
        } catch (ParseException pe) {
            LOGGER.error("Could not convert '" + strDate + "' to a date, throwing exception");
        }

        return aDate;
    }

    public static String format(Date aDate, String aFormat) {
        if (aDate == null || aFormat == null) {
            return "";
        }
        return new SimpleDateFormat(aFormat).format(aDate);
    }

    /**
     * 获取无分隔符的日期格式 yyyyMMdd
     *
     * @param aDate 日期
     * @return yyyyMMdd格式的日期字符串
     */
    public static String getDateNumString(Date aDate) {
        return DateUtil.format(aDate, DATE_ALL_NUMBER);
    }

    /**
     * 将ISO8601时间字符串转换为加了时区的通用字符串格式
     *
     * @param iso8601String iso8601格式的字符串
     * @return 通用格式的时间字符串 (东8区时间)
     */
    public static String getDefaultDateTimeFromIso8601(String iso8601String) {
        DateTimeFormatter iso8601 = DateTimeFormat.forPattern(ISO_8601_MIN_PATTERN);
        if (iso8601String.contains(CommonConstant.DOT)) {
            iso8601 = DateTimeFormat.forPattern(ISO_8601_PATTERN);
        }
        try {
            DateTime date = DateTime.parse(iso8601String, iso8601);
            //加上时区
            date = date.plusMillis(EIGHT_HONR_MILLISECOND);
            return date.toString(DateUtil.DEFAULT_TIME_MIN_PATTERN);
        } catch (Exception e) {
            LOGGER.warn("时间转换错误", e);
            return CommonConstant.EMPTY;
        }
    }

    /**
     * 将ISO8601时间字符串加上8小时
     *
     * @param iso8601String iso8601格式的字符串
     * @return ISO8601时间字符串 (东8区时间)
     */
    public static String addEightHours(String iso8601String) {
        DateTimeFormatter iso8601 = DateTimeFormat.forPattern(ISO_8601_MIN_PATTERN);
        if (iso8601String.contains(CommonConstant.DOT)) {
            iso8601 = DateTimeFormat.forPattern(ISO_8601_PATTERN);
        }
        try {
            DateTime date = DateTime.parse(iso8601String, iso8601);
            //加上时区
            date = date.plusMillis(EIGHT_HONR_MILLISECOND);
            return date.toString(DateUtil.ISO_8601_PATTERN);
        } catch (Exception e) {
            LOGGER.warn("时间转换错误", e);
            return CommonConstant.EMPTY;
        }
    }

    /**
     * 将ISO8601时间字符串剪掉8小时
     *
     * @param iso8601String iso8601格式的字符串
     * @return ISO8601时间字符串 (0时区时间)
     */
    public static String minusEightHours(String iso8601String) {
        DateTimeFormatter iso8601 = DateTimeFormat.forPattern(ISO_8601_MIN_PATTERN);
        if (iso8601String.contains(CommonConstant.DOT)) {
            iso8601 = DateTimeFormat.forPattern(ISO_8601_PATTERN);
        }
        try {
            DateTime date = DateTime.parse(iso8601String, iso8601);
            date = date.plusMillis(-EIGHT_HONR_MILLISECOND);
            return date.toString(DateUtil.ISO_8601_PATTERN);
        } catch (Exception e) {
            LOGGER.warn("时间转换错误", e);
            return CommonConstant.EMPTY;
        }
    }

    /**
     * 将日期字符串从yyyy-MM-dd HH:mm:ss转换为yyyy-MM-dd'T'HH:mm:ssZ
     * 忽略时区
     *
     * @param defalutDateString yyyy-MM-dd HH:mm:ss格式字符串
     * @return yyyy-MM-dd'T'HH:mm:ssZ格式字符串
     */
    public static String getIso8601DateFormat(String defalutDateString) {
        return defalutDateString.replace(CommonConstant.BLANK, "T") + ".000Z";
    }

    /**
     * 将mFormatIso8601格式的String时间转为Timestamp型
     */
    public synchronized static Timestamp strTimeFormatToDates(String strDate) {
        Date dateTime = null;
        Timestamp timestamp = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(ISO_8601_PATTERN);
            dateTime = dateFormat.parse(strDate);
            dateFormat = new SimpleDateFormat(DEFAULT_TIME_MIN_PATTERN);
            String format = dateFormat.format(dateTime);
            timestamp = Timestamp.valueOf(format);
        } catch (ParseException e) {
            LOGGER.error("date transform error", e);
        }
        return timestamp;
    }

    /**
     * 将mFormatIso8601格式的String时间转为Timestamp型
     * @param iso8601String  iso8601格式的时间字符串
     * @return timestamp格式时间
     */
    public static long iso8601ToMills(String iso8601String) {
        DateTimeFormatter iso8601 = DateTimeFormat.forPattern(ISO_8601_MIN_PATTERN);
        if (iso8601String.contains(CommonConstant.DOT)) {
            iso8601 = DateTimeFormat.forPattern(ISO_8601_PATTERN);
        }
        DateTime date = DateTime.parse(iso8601String, iso8601);
        return date.getMillis();
    }

    /**
     * 通用时间转换为毫秒数
     * @param datetime  时间字符串
     * @return 毫秒数
     */
    public static long defualtTimeToMills(String datetime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(DEFAULT_TIME_MIN_PATTERN);
        if (datetime.contains(CommonConstant.DOT)) {
            dateTimeFormatter = DateTimeFormat.forPattern(DEFAULT_TIME_PATTERN);
        }
        DateTime date = DateTime.parse(datetime, dateTimeFormatter);
        return date.getMillis();
    }

    /**
     * 将mFormatIso8601格式的String时间转为Timestamp
     * @param iso8601String  iso8601格式的时间字符串
     * @return  timestamp格式时间
     */
    public static Timestamp iso8601ToTimestamp(String iso8601String) {
        return new Timestamp(iso8601ToMills(iso8601String));
    }

    /**
     * 将通用日期格式格式的String时间转为Timestamp
     * @param dateTime  时间字符串
     * @return  timestamp格式时间
     */
    public static Timestamp defualtTimeToTimestamp(String dateTime) {
        return new Timestamp(defualtTimeToMills(dateTime));
    }


    /**
     * 获取中文格式的日期格式
     *
     * @param data 日期
     * @return 中文日期格式字符串
     */
    public static String getCnDateFormat(Date data) {
        return DateUtil.format(data, CHINESE_DATE_FMT);
    }

    /**
     * 获取中文格式的日期时间格式
     *
     * @param data 日期
     * @return 中文日期时间格式字符串
     */
    public static String getCnDateTimeFormat(Date data) {
        return DateUtil.format(data, CHINESE_DATE_TIME_FMT);
    }

    /**
     * 日期转换为通用日期格式字符串 yyyy-MM-dd
     *
     * @param aDate 时间戳
     * @return 通用日期格式字符串
     */
    public static String getDefaultDateFormat(long aDate) {
        Date date = new Date(aDate);
        return DateUtil.format(date, DEFAULT_DATE_PATTERN);
    }

    /**
     * 获取总天数的毫秒数
     */
    public static long getDaysMillisecond(int days) {
        return days * ONE_DAY_MILLISECOND;
    }

    /**
     * 获取当前年份数字
     */
    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);

    }

    /**
     * 获取上个周一的日期
     *
     * @return 上个周一的日期字符串
     */
    public static String getLastMondy() {
        Calendar calendar = Calendar.getInstance();
        int n = 1;
        calendar.add(Calendar.DATE, n * (-7));
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return new SimpleDateFormat(DEFAULT_DATE_PATTERN).format(calendar.getTime());
    }

    /**
     * 获取上个周日的日期字符串
     *
     * @return 上个周日的日期字符串
     */
    public static String getLastSunday() {
        Calendar calendar = Calendar.getInstance();
        int n = 1;
        calendar.add(Calendar.DATE, n);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return new SimpleDateFormat(DEFAULT_DATE_PATTERN).format(calendar.getTime());
    }

    /**
     * 使用通用日期格式判断是否为日期
     *
     * @param dateTime 日期时间
     * @return 是否有效
     */
    public static boolean isValidDateTime(String dateTime) {
        Matcher matcher = Pattern.compile(DEFAULT_DATETIME_REGEX).matcher(dateTime);
        return matcher.find();
    }

    /**
     * 使用Iso8601格式判断是否为日期
     *
     * @param dateTime 日期时间
     * @return 是否有效
     */
    public static boolean isValidIso8601(String dateTime) {
        Matcher matcher = Pattern.compile(ISO_8601_MATCH_REGEX).matcher(dateTime);
        return matcher.find();
    }

    /**
     * 判断是否输入有效的日期
     *
     * @param date 日期字符串
     * @param pattern 日期格式字符串
     * @return 日期格式是否有效
     */
    private static boolean isValid(String date, String pattern) {
        if (StringUtil.isEmpty(date)) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date testDate = null;
        try {
            testDate = sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        /*
         dateformat.parse will accept any date as long as it's in the format
         you defined, it simply rolls dates over, for example, december 32
         becomes jan 1 and december 0 becomes november 30
         This statement will make suren that once the string
         has been checked for proper formatting that the date is still the
         date that was entered, if it's not, we assume that the date is invalid
         */
        return sdf.format(testDate).equals(date);
    }

    /**
     * 毫秒时间戳转换为秒
     *
     * @param timestamp 毫秒时间戳
     * @return 单位为秒的时间戳
     */
    private static long toSeconds(long timestamp) {
        return timestamp / 1000L;
    }

    /**
     * 毫秒时间戳转换为分钟
     *
     * @param timestamp 毫秒时间戳
     * @return 单位为分钟的时间戳
     */
    private static long toMinutes(long timestamp) {
        return toSeconds(timestamp) / 60L;
    }

    /**
     * 毫秒时间戳转换为小时
     *
     * @param timestamp 毫秒时间戳
     * @return 单位为小时的时间戳
     */
    private static long toHours(long timestamp) {
        return toMinutes(timestamp) / 60L;
    }

    /**
     * 毫秒时间戳转换为天
     *
     * @param timestamp 毫秒时间戳
     * @return 单位为天的时间戳
     */
    private static long toDays(long timestamp) {
        return toHours(timestamp) / 24L;
    }

    /**
     * 计算iso8601 时间当前是星期几
     *
     * @param dateStr iso8601的日期字符串
     * @return 当期的星期数字 1周一 ~ 7周日
     */
    public static int dayOfWeek(String dateStr) {
        Timestamp timestamp = iso8601ToTimestamp(dateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        return i == 1 ? 7 : --i;
    }

    /**
     * 时间戳转换为通用时间格式
     *
     * @param timeStamp 时间戳
     * @return 通用日期时间yyyy-MM-dd HH:mm:ss格式
     */
    public static String getDefaultDateTimeString(long timeStamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_TIME_MIN_PATTERN);
        return simpleDateFormat.format(timeStamp);
    }

    /**
     * 时间戳转换为通用日期格式
     *
     * @param timeStamp 时间戳
     * @return 通用日期格式yyyy-MM-dd
     */
    public static String getDefaultDateString(long timeStamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
        return simpleDateFormat.format(timeStamp);
    }

    /**
     * 将时间字符格式化为时间对象
     *
     * @param str 时间格式 为 2018-11-28T01:36:08Z
     * @return 日期格式对象
     * @author xg.zhao 2018/11/28 11:04
     */
    public static Date parseDateStr(String str) {
        if (StringUtil.isEmpty(str)) {
            return getCurrentTimestamp();
        }
        String replace = str.replace("T", " ").replace("Z", "");
        try {
            return parseDateTime(replace);
        } catch (ParseException e) {
            LOGGER.error("", e);
            return getCurrentTimestamp();
        }
    }

    /**
     * 获取当前时间 - 毫秒数
     *
     * @return 当前的毫秒数
     */
    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * 获取当前时间 - Timestamp格式
     *
     * @return Timestamp格式 当前时间
     */
    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(getCurrentTimeMillis());
    }


    /**
     * 将不带毫秒的时间戳精确到分钟  并转为毫秒格式时间戳
     *
     * @param timestamp 时间戳
     * @return 去掉秒的时间戳
     */
    public static Long trimSeconds(Long timestamp) {
        // 毫秒时间转成分钟,往下取整 1.9=> 1.0
        long floorValue = timestamp / 60;
        return floorValue * 60000;
    }

    /**
     * 功能描述: 将世界标准时间转换为本地时间
     *
     * @param gmtDate
     * @return java.util.Date
     */
    public static Date convertGMT2Local(Date gmtDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(gmtDate);
        int zoneOffset = c.get(Calendar.ZONE_OFFSET);
        int dstOffset = c.get(Calendar.DST_OFFSET);
        c.add(Calendar.MILLISECOND, zoneOffset + dstOffset);
        return c.getTime();
    }

    /**
     * 功能描述: 将世界标准时间转换为本地时间
     *
     * @param gmtDate
     * @return java.sql.Timestamp
     */
    public static Timestamp convertGMT2Local(Timestamp gmtDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(gmtDate);
        int zoneOffset = c.get(Calendar.ZONE_OFFSET);
        int dstOffset = c.get(Calendar.DST_OFFSET);
        c.add(Calendar.MILLISECOND, zoneOffset + dstOffset);
        return new Timestamp(c.getTime().getTime());
    }
}
