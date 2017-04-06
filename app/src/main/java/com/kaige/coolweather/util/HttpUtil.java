package com.kaige.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by dell on 2017/4/5.
 */

public class HttpUtil {
    public static void sendOkHttRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
