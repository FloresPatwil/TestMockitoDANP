package com.example.myapplication.login;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.finalActivity.FinalActivity;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

// import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements Login.View{
    private EditText user,pass;
    private Login.Presenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.edUser);
        pass = (EditText) findViewById(R.id.edPass);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void usuarioValido() {
        startActivity(new Intent(LoginActivity.this, FinalActivity.class ));
    }

    @Override
    public void error() {
        Toast.makeText(this, "Usuario no es valido", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUserName() {
        return user.getText().toString();
    }

    @Override
    public String getPassword() {
        return pass.getText().toString();
    }
}