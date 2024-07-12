package com.example.myapplication.login;

public class LoginModel implements Login.Model{

    private Login.Presenter presenter;
    public LoginModel(Login.Presenter presenter){
        this.presenter = presenter;
    }
    @Override
    public void validaUser(String user, String pass) {
        if (user.equals("alberto")&&pass.equals("androiddesdecero")){
            presenter.usuarioValido();
        }else{
            presenter.error();
        }
    }
}
