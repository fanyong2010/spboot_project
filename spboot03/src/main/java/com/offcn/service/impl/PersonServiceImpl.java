package com.offcn.service.impl;

import com.offcn.dao.PersonDao;
import com.offcn.pojo.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao pd;


    @Override
    public void add(Person person) {
        pd.save(person);
    }

    @Override
    public void delete(Long id) {
        pd.deleteById(id);
    }

    @Override
    public void update(Person person) {
        // person对象中如果有id, 就修改
        pd.save(person);
    }

    @Override
    public Person getOne(Long id) {
        return pd.findById(id).get();
    }

    @Override
    public List<Person> getAll() {
        return pd.findAll();
    }
}
