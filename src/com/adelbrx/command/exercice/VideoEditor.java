package com.adelbrx.command.exercice;

public class VideoEditor {
    private float contrast;
    private String text;

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void removeText() {
        this.text = "";
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", text='" + text + '\'' +
                '}';
    }
}
