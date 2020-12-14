package com.yougou.util;

import java.util.UUID;

/**
 * Class description goes here
 *
 * @author ylq
 * @date 14-5-12 上午11:49
 */
public class UUIDUtil {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
