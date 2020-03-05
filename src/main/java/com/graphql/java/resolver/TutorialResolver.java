package com.graphql.java.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.java.dao.AuthorRepository;
import com.graphql.java.domain.Author;
import com.graphql.java.domain.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepository authorRepository;

    public TutorialResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }
}
