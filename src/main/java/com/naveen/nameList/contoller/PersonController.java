package com.naveen.nameList.contoller;

import com.naveen.nameList.Repositorys.PersonRepo;
import com.naveen.nameList.entity.Form;
import com.naveen.nameList.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @Autowired
    PersonRepo personRepo;

//------------------------------------HTML_ReDirect-------------------------------------------------
@GetMapping("/fillform")
public String formPage(){
    return "form.html";
}


//------------------------------------HTML_ReDirect-------------------------------------------------
    @PostMapping("/addPerson")
    public String fillForm(@ModelAttribute("form-fill") Form form, Model model) {
        Person person = new Person();

        model.addAttribute("form", form);
        person.setName(form.getName());
        person.setFatherName(form.getFatherName());
        person.setMotherName(form.getMotherName());
        person.setPlace(form.getPlace());
        person.setDob(form.getDob());
        personRepo.save(person);
        return "index";
    }
}
