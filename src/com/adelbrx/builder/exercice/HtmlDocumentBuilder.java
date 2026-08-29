package com.adelbrx.builder.exercice;

import com.adelbrx.builder.exercice.html.HtmlDocument;
import com.adelbrx.builder.exercice.html.HtmlImage;
import com.adelbrx.builder.exercice.html.HtmlParagraph;

public class HtmlDocumentBuilder implements DocumentBuilder {
    private HtmlDocument document = new HtmlDocument();

    @Override
    public void addImage(Image image) {
        document.add(new HtmlImage(image.getSource()));
    }

    @Override
    public void addText(Text text) {
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public String getResult() {
        return document.toString();
    }
}
