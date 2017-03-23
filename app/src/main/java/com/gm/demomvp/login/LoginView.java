package com.gm.demomvp.login;

import com.gm.demomvp.base.BaseView;
import com.gm.demomvp.model.Recipy;

/**
 * Name       : Gowtham
 * Created on : 22/3/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

public interface LoginView extends BaseView {

    void showLoading(boolean canShow);

    void intiateAdapter();

    void getPostFromServer();

    void fetchingSuccess();

    void fetchingFailuere(String message);

    void showNoPosts();

    void refreshAdapter();

    void showRecipy(Recipy recipy);
}
