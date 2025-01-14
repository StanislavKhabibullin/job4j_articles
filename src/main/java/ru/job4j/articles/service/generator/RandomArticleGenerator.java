package ru.job4j.articles.service.generator;

import org.hsqldb.lib.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.job4j.articles.Application;
import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;
import ru.job4j.articles.store.ArticleStore;
import ru.job4j.articles.store.WordStore;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.stream.Collectors;

public class RandomArticleGenerator implements ArticleGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class.getSimpleName());

    @Override
    public Article generate(List<Word> words) {
        var wordsCopy = new ArrayList<>(words);
        Collections.shuffle(wordsCopy);
        var content = wordsCopy.stream()
                .map(Word::getValue)
                .collect(Collectors.joining(" "));
        var ter = new Article(content);

        return new Article(content);

    }


}
