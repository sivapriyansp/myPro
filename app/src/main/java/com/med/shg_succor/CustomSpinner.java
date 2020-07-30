package com.med.shg_succor;

public class CustomSpinner {

    private String spinnertext;
    private int spinnerImage;


    public CustomSpinner(String spinnertext, int spinnerImage) {
        this.spinnertext = spinnertext;
        this.spinnerImage = spinnerImage;
    }

    public String getSpinnertext() {
        return spinnertext;
    }

    public int getSpinnerImage() {
        return spinnerImage;
    }
}
