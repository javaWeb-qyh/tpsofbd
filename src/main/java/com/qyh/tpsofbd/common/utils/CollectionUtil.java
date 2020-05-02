package com.qyh.tpsofbd.common.utils;


import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * 集合常用工具类
 *
 * @author xg.zhao
 * @date 2018 01 06 20:35
 */
public class CollectionUtil {

    /**
     * Util工具类不需要创建对象 使用私有构造函数
     */
    private CollectionUtil(){
    }

    /**
     * 集合转为JSON字符串
     * @param collection 集合
     * @return JSON字符串
     */
    public static String array2JsonString(Collection collection) {
        Object o = JSON.toJSON(collection);
        return o.toString();
    }

    /**
     * JSON字符串转为集合
     * @param jsonString JSON字符串
     * @return 集合
     */
    public static Collection jsonString2Array(String jsonString) {
        if (StringUtil.isEmpty(jsonString) || !StringUtil.isJsonArray(jsonString)) {
            return new ArrayList();
        }
        return (Collection) JSON.parse(jsonString);
    }

    /**
     *  int列表转为int数组
     * @param list int列表
     * @return int数组
     */
    public static int[] collection2IntArray(List<Integer> list) {
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    /**
     *  判断集合是否不为空
     * @param collection 集合
     * @return 是否不为空
     */
    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断集合是否为空
     * @param collection 集合
     * @return 是否为空
     */
    public static boolean isEmpty(Collection collection) {
        return (collection == null || collection.isEmpty());
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return (map == null || map.isEmpty());
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    public static boolean isEmpty(Set<?> set) {
        return (set == null || set.isEmpty());
    }

    public static boolean isNotEmpty(Set<?> set) {
        return !(isEmpty(set));
    }

    public static <T> List<T> list() {
        return Collections.emptyList();
    }

    public static <T> List<T> list(T t) {
        return Collections.singletonList(t);
    }

    public static <T> List<T> list(List<T> ts) {
        return Collections.unmodifiableList(new ArrayList<>(ts));
    }
}
