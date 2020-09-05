package com.example.myapplication;

import java.util.regex.Pattern;

public class Ultis {
    public static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^"
                    + "(?=.*[0-9])"                             // minium onen umber
                    + "(?=.*[a-z])"                             // ninium one lower case character
                    + "(?=.*[A-Z])"                             //minium one UPPER case character
                    + "(?=.*[a-zA-Z])"                           //any character
                    + "(?=.*[@#$%^&+=])"                         // minium one special character
                    + "(?=\\S+$)"                              // no white spaces
                    + "{10,}"                                    // minium length 6 characters
                    + "$");
}
