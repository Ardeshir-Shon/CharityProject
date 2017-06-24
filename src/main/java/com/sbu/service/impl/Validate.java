package com.sbu.service.impl;

/**
 * Created by Mammad on 6/24/2017.
 */
public class Validate {
    public static Boolean validateEmail(String email){
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    public static Boolean validateNumer(String email){
        return email != null && email.matches("[-+]?\\d*\\.?\\d+");
    }

}
