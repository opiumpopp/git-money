package com.yougou.util;

import java.util.UUID;

/**
 * Class description goes here
 */
public class UUIDUtil {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
