package com.gm.demomvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Name       : Gowtham
 * Created on : 22/3/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    protected P basePresenter;

    /**
     * Used to create object for presenter
     * @return BasePresenter object
     */
    protected abstract P createPresenter();

    /**
     * Used to set the layout
     * @return layout file name
     */
    protected abstract int getContentView();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basePresenter = createPresenter();
        setContentView(getContentView());
    }
}
