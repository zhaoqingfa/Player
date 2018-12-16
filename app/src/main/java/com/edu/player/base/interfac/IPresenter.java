package com.edu.player.base.interfac;

import io.reactivex.disposables.Disposable;

/**
 * Created by zqf on 2018/11/23.
 */

public interface IPresenter {
    /**
     * 默认初始化
     */
    void init();

    /**
     * 析构函数
     */
    void destroy();
}
