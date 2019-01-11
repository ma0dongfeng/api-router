package com.krista.apirouter.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 本地缓存
 *
 * @author Administrator
 */
public class LocalCache {
    private LocalCache() {

    }

    private static Map<String, Class<?>> requestParamTypeCache = new HashMap<>(16);

    public static void addRequestParamType(String key, Class<?> type) {
        requestParamTypeCache.put(key, type);
    }

    public static Class getRequestParamType(String key) {
        return requestParamTypeCache.get(key);
    }
}