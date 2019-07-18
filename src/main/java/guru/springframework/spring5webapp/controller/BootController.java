/*
 * Copyright (c) 2019.  Alper Güngör, All rights reserved.
 */

package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootController {

    private BookRepository bookRepository;

    public BootController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books",bookRepository.findAll());

        return "books";
    }
}
