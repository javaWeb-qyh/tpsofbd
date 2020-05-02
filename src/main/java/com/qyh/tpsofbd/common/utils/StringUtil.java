package com.qyh.tpsofbd.common.utils;

import com.alibaba.fastjson.JSONObject;

import com.qyh.tpsofbd.common.constant.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Encoder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xg.zhao
 * @date 2018 01 04 17:25
 */
public class StringUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringUtil.class);

    private static final int BYTE_BUFFER = 100;

    private static final Random RANDOM = new Random();

    private static final String PATH_SPLIT_U = "\\";

    private static final String CHINESE_PATTERN = "[\u4e00-\u9fa5]";

    public static boolean isEmpty(final String text) {
        return !isNotEmpty(text);
    }

    public static boolean isNotEmpty(final String text) {
        return text != null && text.length() != 0;
    }

    /**
     * 将字节数组转换为输入流
     */
    public static final InputStream byte2Input(final byte[] buf) {
        return new ByteArrayInputStream(buf);
    }

    /**
     * 将输入流转换为字节数组
     */
    public static final byte[] input2byte(final InputStream inStream) throws IOException {
        final ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        final byte[] buff = new byte[BYTE_BUFFER];
        int rc = 0;
        while ((rc = inStream.read(buff, 0, BYTE_BUFFER)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        return swapStream.toByteArray();
    }

    /**
     * 将字符串首字母大写.
     */
    public static String captureName(final String name) {
        final char[] charArray;
        final char[] cs = charArray = name.toCharArray();
        final int n = 0;
        charArray[n] -= ' ';
        return String.valueOf(cs);
    }

    /**
     * 将集合中的数据连接成字符串.
     */
    public static String join(final Collection collection, final String separator) {
        if (CollectionUtil.isEmpty(collection)) {
            return null;
        }
        return join(collection.iterator(), separator);
    }

    /**
     * 将迭代器中的数据组成一个字符串.
     */
    public static String join(final Iterator iterator, final String separator) {
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        final Object first = iterator.next();
        if (!iterator.hasNext()) {
            return (first == null) ? "" : first.toString();
        }
        final StringBuilder buf = new StringBuilder(256);
        if (first != null) {
            buf.append(first);
        }
        while (iterator.hasNext()) {
            if (separator != null) {
                buf.append(separator);
            }
            final Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }
        return buf.toString();
    }

    /**
     * 判断一个字符串是否都是大写字母组成.
     *
     * @return 如果全部由大写字母组成返回true
     */
    public static boolean isAllUpperCase(final String str) {
        if (str == null || isEmpty(str)) {
            return false;
        }
        for (int sz = str.length(), i = 0; i < sz; ++i) {
            if (!Character.isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断一个字符串是否都是小写.
     *
     * @return 如果全部是小写则返回true 否则返回false
     */
    public static boolean isAllLowerCase(final String str) {
        if (str == null || isEmpty(str)) {
            return false;
        }
        for (int sz = str.length(), i = 0; i < sz; ++i) {
            if (!Character.isLowerCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 用String接收数据库中的时间字段会多出".0"，需要去掉.
     */
    public static String subDateTimeFromDB(String date) {
        if (StringUtil.isEmpty(date)) {
            return "";
        }

        return date.substring(0, date.length() - 2);
    }

    /**
     * 判断一个字符串是否是JSON格式的数组.
     */
    public static boolean isJsonArray(String paramStr) {
        try {
            JSONObject.parseArray(paramStr);
            return true;
        } catch (Exception ext) {
            return false;
        }
    }

    /**
     * 随机生成一个32位的字符串.
     */
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        // 去掉"-"符号
        return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str
                .substring(19, 23) + str.substring(24);
    }

    /**
     * 将字符串转换为UNICODE编码
     */
    public static String toUnicode(String str) {
        String encodedStr = "";
        try {
            StringBuilder retStr = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                int cp = Character.codePointAt(str, i);
                int charCount = Character.charCount(cp);
                if (charCount > 1) {
                    i += charCount - 1;
                    if (i >= str.length()) {
                        throw new IllegalArgumentException("truncated unexpectedly");
                    }
                }

                if (cp < 128) {
                    retStr.appendCodePoint(cp);
                } else {
                    retStr.append(String.format("\\u%x", cp));
                }
            }
            encodedStr = retStr.toString();
        } catch (Exception ext) {
            LOGGER.error("UserAgentUtil.getEncodedString.exception." + ext.getMessage());
        }
        return encodedStr;
    }

    /**
     * 13位以上随机字母字符串（字幕范围A-H） 由系统毫微秒转字符串，0对应A，1对应B..
     */
    public static String randomCode() {
        StringBuilder result = new StringBuilder();
        Random r = new Random(DateUtil.getCurrentTimeMillis());
        String str = String.valueOf(System.nanoTime());
        char ch = 65;
        for (char item : str.toCharArray()) {
            result.append((char) (ch + (item - '0')));
        }
        return result.toString();
    }

    public static String uuid() {
        long rd = new Random().nextLong();
        String string = Long.toHexString(rd);
        long time = DateUtil.getCurrentTimeMillis();
        String string1 = Long.toHexString(time);

        return string + "" + string1;
    }

    public static String getObjectId() throws Exception {
        String token = DateUtil.getCurrentTimeMillis() + new Random().nextLong() + "";
        MessageDigest md = MessageDigest.getInstance("md5");
        byte[] md5 = md.digest(token.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(md5);
    }

    public static String databaseColumnType(String dataType, String length) {
        return dataType + CommonConstant.OPEN_PAREN + length + CommonConstant.CLOSE_PAREN;
    }

    public static String pathDispose(String path) {
        if (isEmpty(path) || path.endsWith(PATH_SPLIT_U) || path
                .endsWith(CommonConstant.DIAGONAL)) {
            return path;
        }
        return path + CommonConstant.DIAGONAL;
    }

    public static boolean verifyLength20(String str) {
        return verifyLength(str, 20);
    }

    public static boolean verifyLength50(String str) {
        return verifyLength(str, 50);

    }

    public static boolean verifyName(String str) {
        return verifyLength(str, 64);
    }

    public static boolean verifyLength100(String str) {
        return verifyLength(str, 100);
    }

    public static boolean verifyLength128(String str) {
        return verifyLength(str, 128);
    }

    public static boolean verifyLength256(String str) {
        return verifyLength(str, 256);
    }

    public static boolean verifyDescription256(String str) {
        if (isEmpty(str)) {
            return false;
        } else {
            return str.length() > 256;
        }
    }

    public static boolean verifyDescription(String str) {
        if (isEmpty(str)) {
            return false;
        } else {
            return str.length() > 512;
        }
    }

    public static boolean verifyLength(String str, int length) {
        if (isEmpty(str)) {
            return true;
        } else {
            return str.length() > length;
        }
    }

    /**
     * 数据库模糊查询字符替换 将关键字'%'和'_'替换为转义字符
     *
     * @param str 数据库模糊查询条件
     * @author xg.zhao 2018/8/1 13:56
     */
    public static String genFuzzyStr(String str) {
        if (StringUtil.isEmpty(str)) {
            return str;
        }
        return str.replace("\\", "\\\\\\\\").replace("%", "\\%").replace("'", "''")
                .replace("\\.", "\\\\.").replace("_", "\\_");
    }

    /**
     * 生成一个长整型UUID(18位数正数)  生成规则：12位当前时间(毫秒)+ 3位伪随机数
     *
     * @author xg.zhao 2018/10/13 10:27
     */
    public synchronized static long longUUID() {
        return Long.parseLong(String.valueOf(DateUtil.getCurrentTimeMillis()).substring(1, 13) + (
                RANDOM.nextInt(898) + 100));
    }

    /**
     * 将字符串转换为UTF8编码
     */
    public String toUtf8String(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c <= 255) {
                sb.append(c);
            } else {
                byte[] b;
                try {
                    b = Character.toString(c).getBytes(CommonConstant.UTF_8);
                } catch (Exception ex) {
                    b = new byte[0];
                    LOGGER.error("将文件名中的汉字转为UTF8编码的串时错误，输入的字符串为：", ex);
                }
                for (byte aB : b) {
                    int k = aB;
                    if (k < 0) {
                        k += 256;
                    }
                    sb.append(CommonConstant.PERCENT).append(Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return sb.toString();
    }

    /**
     * 判断字符串中是否包含中文 不能校验是否为中文标点符号
     *
     * @param str 待校验字符串
     * @return 是否为中文 不能校验是否为中文标点符号
     */
    public static boolean containsChinese(String str) {
        Matcher m = Pattern.compile(CHINESE_PATTERN).matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }

    /**
     * 判定输入的是否是汉字
     *
     * @param c 被校验的字符
     * @return true 是汉字
     */
    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }

    /**
     * 获取字符串中的中文字符单字及其他字符串  存于list
     * 如查询search 会被分为查、询、search
     *
     * @param str 入参字符串
     * @return 含有中文单字字符串列表
     */
    public static List<String> getChineseWords(String str) {
        char[] charArray = str.toCharArray();
        List<String> resultList = new ArrayList<>(charArray.length);
        StringBuilder tempNotChinese = new StringBuilder();
        for (char chinese : charArray) {
            if (isChinese(chinese)) {
                resultList.add("" + chinese);
                if (!StringUtil.isEmpty(tempNotChinese.toString())) {
                    resultList.add(tempNotChinese.toString());
                    tempNotChinese = new StringBuilder();
                }
            } else {
                tempNotChinese.append(chinese);
            }
        }
        if (!StringUtil.isEmpty(tempNotChinese.toString())) {
            resultList.add(tempNotChinese.toString());
        }
        return resultList;
    }

}
