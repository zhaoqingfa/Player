package com.edu.player.base;

import com.edu.player.base.interfac.IModel;

/**
 * Created by zqf on 2018/11/25.
 */

public abstract class BaseModel implements IModel {
    public BaseModel() {
        init();
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
