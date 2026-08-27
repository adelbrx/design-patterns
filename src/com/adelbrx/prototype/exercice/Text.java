package com.adelbrx.prototype.exercice;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void render() {
        System.out.println("Rendering text");
    }

    @Override
    public Component clone() {
        return new Text(getContent());
    }
}
