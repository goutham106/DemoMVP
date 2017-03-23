package com.gm.demomvp.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.gm.demomvp.R;
import com.gm.demomvp.base.BaseActivity;
import com.gm.demomvp.domain.client.RetroAdapter;
import com.gm.demomvp.model.Recipy;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends BaseActivity<LoginPresenter> implements LoginView{
    private static final String TAG = "Login";
    Button checkRecipy;
    EditText editText;
    ProgressBar progressBar;

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        checkRecipy = (Button) findViewById(R.id.checkRecipy);
        editText = (EditText) findViewById(R.id.editText);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        checkRecipy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basePresenter.fetchData(editText.getText().toString());
            }
        });
    }

    @Override
    public void showLoading(boolean canShow) {
        if (canShow)
            progressBar.setVisibility(View.VISIBLE);
        else
            progressBar.setVisibility(View.GONE);
    }

    @Override
    public void intiateAdapter() {

    }

    @Override
    public void getPostFromServer() {

    }

    @Override
    public void fetchingSuccess() {

    }

    @Override
    public void fetchingFailuere(String message) {

    }

    @Override
    public void showNoPosts() {

    }

    @Override
    public void refreshAdapter() {

    }

    @Override
    public void showRecipy(Recipy recipy) {
        Log.e(TAG, "showRecipy: "+recipy.results.get(0).ingredients );
    }

    @Override
    public void setPresenter() {

    }
}
