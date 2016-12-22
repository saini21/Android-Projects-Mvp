package com.mvp.zapbuild.login;

/**
 * Created by zapbuild on 22/12/16.
 */

public interface LoginContract {

    interface View{

        void showError(String msg);

    }


    interface Presenter{

        void userLogin(String name);

    }

}
