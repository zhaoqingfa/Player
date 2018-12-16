package com.edu.player.business.login;

import com.edu.player.base.BasePresenter;
import com.edu.player.base.interfac.IView;

/**
 * Created by zqf on 2018/11/24.
 */

public class LoginPresenter extends BasePresenter<ILoginContact.IV, ILoginContact.IM> {
    public LoginPresenter(ILoginContact.IV iv, ILoginContact.IM im) {
        super(iv, im);
    }
}
