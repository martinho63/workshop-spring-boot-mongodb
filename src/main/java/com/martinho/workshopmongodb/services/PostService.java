package com.martinho.workshopmongodb.services;

import com.martinho.workshopmongodb.domain.Post;
import com.martinho.workshopmongodb.domain.User;
import com.martinho.workshopmongodb.repository.PostRepository;
import com.martinho.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(("Objeto não encontrado!!!")));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }

}
