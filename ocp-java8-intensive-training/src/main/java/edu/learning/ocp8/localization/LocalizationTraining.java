package edu.learning.ocp8.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationTraining {

    public static void main(String... args) {
        Locale locale = new Locale("de");
        ResourceBundle rb = ResourceBundle.getBundle("SRBundel");
        System.out.print(rb.getString("Hello"));

//        int num =
    }

}

// ResourceBundle is an abstract class
// ListResourceBundle extends from ResourceBundle
// PropertyResourceBundle extends from ResourceBundle