package ru.pravvich;

import com.google.gson.GsonBuilder;

public class User {

    private int id;
    private String username;
    private String login;
    private String password;
    private String country;
    private String city;

    public User(final String username,
                final String login,
                final String password,
                final String country,
                final String city) {

        this.username = username;
        this.login = login;
        this.password = password;
        this.country = country;
        this.city = city;
    }

    public User(final int id,
                final String username,
                final String login,
                final String password,
                final String country,
                final String city) {

        this.id = id;
        this.username = username;
        this.login = login;
        this.password = password;
        this.country = country;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJSON() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(this, this.getClass());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
