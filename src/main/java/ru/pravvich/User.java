package ru.pravvich;

import java.nio.file.Path;

import java.util.HashMap;
import java.util.Map;

public class User {

    private Map<String, Path> files = new HashMap<>();

    private int id;
    private String name;
    private String login;
    private String password;
    private String country;
    private String city;



    public boolean deleteFile(final String name) {
        files.put(name, null);
        return true;
    }

    private boolean saveFile(final String name) {
        return files.remove(name, null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
