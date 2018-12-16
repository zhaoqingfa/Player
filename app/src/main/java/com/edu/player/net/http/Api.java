package com.edu.player.net.http;

import com.edu.player.net.http.interfac.IApiService;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by zqf on 2018/11/23.
 */

public class Api {
//    private static Api api = new Api(IApiService.BASE_URL);
//    protected Retrofit.Builder retrofitBuilder;
//    protected OkHttpClient.Builder httpBuilder;
//
//    private Api(String url) {
//        httpBuilder = new OkHttpClient.Builder();
//        retrofitBuilder = new Retrofit.Builder();
//        retrofitBuilder.addConverterFactory(ScalarsConverterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
//                        .setLenient()
//                        .create()
//                ))
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .client(httpBuilder.addInterceptor(getLoggerInterceptor()).build())
//                .baseUrl(url);
//    }
//
//    public static IApiService getInstance() {
//        return api
//    }
}
