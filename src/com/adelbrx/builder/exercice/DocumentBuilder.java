package com.adelbrx.builder.exercice;

public interface DocumentBuilder {
    void addImage(Image image);
    void addText(Text text);
    String getResult();
}
