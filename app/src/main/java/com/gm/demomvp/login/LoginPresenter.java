package com.gm.demomvp.login;

import android.util.Log;

import com.gm.demomvp.base.BasePresenter;
import com.gm.demomvp.base.BasePresenterImpl;
import com.gm.demomvp.domain.client.RetroAdapter;
import com.gm.demomvp.model.Recipy;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Name       : Gowtham
 * Created on : 22/3/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

public class LoginPresenter extends BasePresenter implements LoginPresenterImpl {
    private static final String TAG = "LoginPresenter";
    LoginView view;

    LoginPresenter(LoginView view){
        this.view= view;
    }


    public void fetchData(String s){
        view.showLoading(true);
        Call<Recipy> call = RetroAdapter.getInstance().getRecipyService().getRecipyBySearch(s);
        call.enqueue(new Callback<Recipy>() {
            @Override
            public void onResponse(Call<Recipy> call, Response<Recipy> response) {
                view.showLoading(false);
                if (response.isSuccessful()) {
                    Recipy recipy = response.body();
                    Log.e(TAG, "onResponse: "+recipy.title );
                    view.showRecipy(recipy);
                }
            }

            @Override
            public void onFailure(Call<Recipy> call, Throwable t) {
                Log.e(TAG, "onFailure: "+ t.getMessage() );
                view.showLoading(false);
            }
        });
    }

}
