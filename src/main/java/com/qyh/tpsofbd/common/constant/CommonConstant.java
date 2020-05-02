package com.qyh.tpsofbd.common.constant;

/**
 * 功能描述: 通用常量
 *
 * @author cf.ye
 * @date 2018/10/17 0017 上午 11:24
 */
public class CommonConstant {

    /**
     * 常用WEB字符串
     */
    public static final String HTTP_PROTOCOL = "http://";

    public static final String DEFAULT_CONTENT_TYPE = "application/json; charset=utf-8";

    public static final String MSIE = "MSIE";

    public static final String USER_AGENT = "User-Agent";

    public static final String FIREFOX = "firefox";

    public static final String FONT_YAHEI = "微软雅黑";

    public static final String UTF_8 = "UTF-8";

    public static final String GBK = "GBK";

    public static final String ISO8859_1 = "ISO8859-1";

    /**
     * 常用单位换算
     */
    public static final int KIBI = 1024;

    public static final int MEBI = 1048576;

    public static final int GIBI = 1073741824;

    /**
     * 常用标点和符号
     */
    public static final String EMPTY = "";

    public static final String DOT = ".";

    public static final String COMMA = ",";

    public static final String COLON = ":";

    public static final String DIAGONAL = "/";

    public static final String DIAGONAL_DOUBLE = "//";

    public static final String HYPHEN = "-";

    public static final String UNDER_CROSS = "_";

    public static final String OPEN_PAREN = "(";

    public static final String CLOSE_PAREN = ")";

    public static final String OPEN_BRACKET = "[";

    public static final String CLOSE_BRACKET = "]";

    public static final String OPEN_BRACE = "{";

    public static final String CLOSE_BRACE = "}";

    public static final String BLANK = " ";

    public static final String CODE_AND = "&";

    public static final String CODE_OR = "|";

    public static final String EQUAL = "=";

    public static final String QUESTION = "?";

    public static final String PERCENT = "%";

    public static final String STAR = "*";

    public static final String PLUS = "+";

    public static final String MINUS = "-";

    public static final String LINE_FEED = "\n";

    public static final String AT = "@";

    public static final String AND = "and";

    public static final String OR = "or";

    public static final String TRUE = "true";

    public static final String FALSE = "false";

    /**
     * 常用文件扩展名
     */
    public static final String PNG = ".png";

    public static final String JPG = ".jpg";

    public static final String DOC = ".doc";

    public static final String BPMN = ".bpmn";

    public static final String YML = ".yml";

    public static final String ZIP = ".zip";

    public static final String RAR = ".rar";

    /**
     * 常用IP地址
     */
    public static final String IPV4 = "ipv4";

    public static final String LOCAL_IP_V4 = "127.0.0.1";

    public static final String LOCAL_IP_V4_ZERO = "0.0.0.0";

    public static final String LOCAL_IP_V6 = "0:0:0:0:0:0:0:1";

    /**
     * 常用常量：unknown
     */
    public static final String UNKNOWN = "unknown";

    /**
     * 常用常量：未知
     */
    public static final String UNKNOWN_CHINESE = "未知";

    /**
     * 服务编排模块常用常量：原子服务uuid
     */
    public static final String ATOM_SERVICE_UUID_KEY = "AtomUuid";

    /**
     * 常用数字:Long 1
     */
    public static final long LONG_ONE = 1L;

    /**
     * 常用数字:Long 2
     */
    public static final long LONG_TWO = 2L;

    /**
     * 常用数字:byte 0
     */
    public static final byte BYTE_ZERO = 0;

    /**
     * 常用数字:byte 1
     */
    public static final byte BYTE_ONE = 1;

    /**
     * 常用数字:byte 2
     */
    public static final byte BYTE_TWO = 2;

    /**
     * 常用数字:byte 3
     */
    public static final byte BYTE_THREE = 3;

    /**
     * 常用数字:byte 4
     */
    public static final byte BYTE_FOUR = 4;

    /**
     * 常用数字:Byte 1
     */
    public static final Byte BIG_BYTE_ZERO = 0;

    /**
     * 常用数字:Byte 1
     */
    public static final Byte BIG_BYTE_ONE = 1;

    /**
     * 常用数字:Byte 2
     */
    public static final Byte BIG_BYTE_TWO = 2;

    /**
     * 常用数字:Byte 2
     */
    public static final Byte BIG_BYTE_THREE= 3;
    public static final Byte BIG_BYTE_FOUR= 4;
    public static final Byte BIG_BYTE_ELEVEN= 11;
    public static final Byte BIG_BYTE_TWELVE= 12;

    /**
     * 常用数字:Byte 8
     */
    public static final byte BYTE_EIGHT = 8;

    /**
     * 常用数字:short 1
     */
    public static final short SHORT_ONE = 1;

    /**
     * 常用数字:int -1
     */
    public static final int INT_MINUS_ONE =-1;

    /**
     * 常用数字:int 0
     */
    public static final int INT_ZERO = 0;

    /**
     * 常用数字:int 1
     */
    public static final int INT_ONE = 1;

    /**
     * 常用数字:int 2
     */
    public static final int INT_TWO= 2;

    /**
     * 常用数字:int 3
     */
    public static final int INT_THREE = 3;

    /**
     * 常用数字:int 4
     */
    public static final int INT_FOUR = 4;

    /**
     * 常用数字:String 0
     */
    public static final String STRING_ZERO = "0";

    /**
     * 常用数字:String 1
     */
    public static final String STRING_ONE = "1";

    /**
     * 数字字符串 2
     */
    public static final String STRING_TWO = "2";
    /**
     * 数字字符串 10
     */
    public static final String STRING_TEN = "10";

    /**
     * 信息未读状态
     */
    public static final byte UNREAD = 1;

    /**
     * 信息已读状态
     */
    public static final byte READ = 0;

    /**
     * 信息为已审核状态
     */
    public static final byte AUDITED = 2;

    /**
     * 审核权限 TODO 可以用feign从auth那边获取一下
     */
    public static final long AUDIT_AUTH = 3450L;

    /**
     * 消息类型(审核待办,站内信息)
     */
    public static final byte MSG_AUDIT_TODO = 1;
    public static final byte MSG_INSIDE = 0;
    public static final String TITLE_ADD = "资源新增审核";
    public static final String TITLE_DEL = "资源删除审核";
    public static final String TITLE_EDIT = "资源修改审核";
    public static final String TITLE_DEF = "资源审核";
    public static final String YOU_SUBMIT = "你提交的";

}
