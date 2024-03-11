package com.martinho.workshopmongodb.resources;

import com.martinho.workshopmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User martinho = new User("1", "Carlos Martinho", "martinho@gmail.com");
        User lindalva = new User("2", "Lindalva Dias", "lindy@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(martinho, lindalva));

        return ResponseEntity.ok().body(list);

    }

}
