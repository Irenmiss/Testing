package com.example.testing;

import java.util.Objects;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Неверно указан email");
        }
        if (Objects.equals(login, email)) {
            throw new IllegalArgumentException("Логин и email не могут быть одинаковыми");
        }
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
