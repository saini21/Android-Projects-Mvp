package com.mvp.zapbuild.login;

import android.text.TextUtils;

/**
 * Created by zapbuild on 22/12/16.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View view;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;

    }

    @Override
    public void userLogin(String name) {
            if(handleInvalidInputs(name)){
                return;
            }


        // call api FOR LOGIN


    }


    private boolean handleInvalidInputs(String name, String password){

        if(TextUtils.isEmpty(name)){
            view.showError("Please enter name");
        } else if(TextUtils.isEmpty(password)){
            view.showError("Please enter password");

        } else {
            return false;
        }
        return true;
    }




}
