package com.mvp.zapbuild.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mvp.zapbuild.R;

/**
 * Created by zapbuild on 22/12/16.
 */

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    private EditText editName, edtPassword;
    private Button button;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = (EditText) findViewById(R.id.editText);
        edtPassword = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        loginPresenter = new LoginPresenter(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String password = edtPassword.getText().toString();
                loginPresenter.userLogin(name);
            }
        });

    }

    @Override
    public void showError(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }



}
