package com.edu.player.business.login;

import com.edu.player.base.BaseActivity;

/**
 * Created by zqf on 2018/11/24.
 */

public class LoginActivity extends BaseActivity<LoginPresenter> implements ILoginContact.IV {
    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    public LoginPresenter initPresenter() {
        return new LoginPresenter(this, new LoginModel());
    }
}
