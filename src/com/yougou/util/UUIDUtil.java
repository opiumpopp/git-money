/*
 * 类名 UUIDUtils.java
 *
 * 版本信息 
 *
 * 日期 2014年3月21日
 *
 * 版权声明Copyright (C) 2014 YouGou Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为优购科技开发研制，未经本公司正式书面同意，其他任何个人、团体不得
 * 使用、复制、修改或发布本软件。
 */
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
