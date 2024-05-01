package com.example.greengrowth;

public class cropitem {

    int background;
    String cropname;

    public cropitem() {}

    public cropitem(int background, String cropname) {
        this.background = background;
        this.cropname = cropname;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getCropname() {
        return cropname;
    }

    public void setCropname(String cropname) {
        this.cropname = cropname;
    }
}
