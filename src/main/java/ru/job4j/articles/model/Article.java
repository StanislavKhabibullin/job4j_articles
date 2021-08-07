package ru.job4j.articles.model;

import java.lang.ref.WeakReference;
import java.util.List;

public class Article {

    private int id;

    private WeakReference<String> text;

    public Article(int id, String text) {
        this.id = id;
        this.text = new WeakReference(text);
    }

    public Article(String text) {
        this.text = new WeakReference(text);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text.get();
    }

    public void setText(String text) {
        this.text = new WeakReference(text);
    }
}
