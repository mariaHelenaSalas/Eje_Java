package com.tibuapp.tibu_app.models.Dtos;

import com.tibuapp.tibu_app.models.User;

public class UserDto {
    String title;
    User user;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
