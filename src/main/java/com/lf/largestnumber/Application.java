package com.lf.largestnumber;

import com.lf.largestnumber.number.NumberImpl;

import java.util.logging.Logger;

public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        NumberImpl number = new NumberImpl(args);
        String result = number.findLargestNumber();
        LOGGER.info("Largest number possible is: " + result);
    }
}
