package com.example.mtm.resource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mtm.model.Subject;
import com.example.mtm.model.repository.SubjectRepository;

import java.util.List;

@RestController
@RequestMapping("/rest/subject")
public class SubjectResource {

    @Autowired
    SubjectRepository subjectRepository;

    @GetMapping("/all")
    public String getAll() {
        return subjectRepository.findAll().toString();
    }

    /*@GetMapping("/{name}")
    public List<Subject> getUser(@PathVariable("name") final String name) {
        return subjectRepository.findByName(name);

    }*/

    @GetMapping("/id/{id}")
    public Subject getId(@PathVariable("id") final Integer id) {
        return subjectRepository.findOne(id);
    }

    @PostMapping("/update/{id}/{name}")
    public Subject update(@PathVariable("id") final Integer id, @PathVariable("name")
                         final String name) {


    	Subject subject = getId(id);
    	subject.setName(name);

        return subjectRepository.save(subject);
    }
}