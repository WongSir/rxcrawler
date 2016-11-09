package com.mrkid.ecommerce.crawler.utils;

import com.google.common.collect.ImmutableMap;
import com.mrkid.ecommerce.crawler.dto.JDCategoryDTO;
import org.apache.http.message.BasicNameValuePair;

import java.util.Map;

/**
 * User: xudong
 * Date: 09/11/2016
 * Time: 8:49 AM
 */
public class JDUtils {
    private static Map<Long, String> skipCategories = ImmutableMap.of(1713l, "图书", 4051l, "音像制品");

    public static boolean shouldFetchItems(long rootCid) {
        return !skipCategories.containsKey(rootCid);
    }
}