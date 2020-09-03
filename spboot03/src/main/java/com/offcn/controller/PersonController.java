package com.offcn.controller;

import com.offcn.pojo.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/")
    public List<Person> add(@RequestBody Person person) {
        personService.add(person);
        return personService.getAll();
    }

    @DeleteMapping("/{id}")
    public List<Person> delete(@PathVariable("id") Long id) {
        personService.delete(id);
        return personService.getAll();
    }

    @PutMapping("/")
    public List<Person> update(@RequestBody Person person) {
        personService.update(person);
        return personService.getAll();
    }

    @GetMapping("/{id}")
    public Person getOne(@PathVariable("id") Long id) {
        return personService.getOne(id);
    }

    @GetMapping("/")
    public List<Person> getAll() {
        return personService.getAll();
    }

}
