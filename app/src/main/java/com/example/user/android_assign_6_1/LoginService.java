package com.example.user.android_assign_6_1;

/**
 * Created by USER on 09-04-2018.
 */

class LoginService {
    public boolean login(String username, String password) {
        /*boolean returns true or false
        taking username and password by using string
        * string is a sequence of characters  */
        return "Nagaraju401".equals(username) && "27103".equals(password);
        //here returns true if username and password is equal as given above or else gets error message
    }
}