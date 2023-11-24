package com.naveen.nameList.contoller;

import com.naveen.nameList.Repositorys.AdhaarRepo;
import com.naveen.nameList.Repositorys.PersonRepo;
import com.naveen.nameList.entity.Adhaar;
import com.naveen.nameList.entity.CreateAadhaar;
import com.naveen.nameList.entity.Person;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AdhaarController {

    @Autowired
    AdhaarRepo adhaarRepo;

    @Autowired
    PersonRepo personRepo;
//-----------------------------HTML------------------------
    @GetMapping("/creaeaadhaar")
    public String aadharFormFill(){
        return "createAadhaar.html";
    }

//-----------------------------HTML------------------------
    @PostMapping("/createAadhaar")
    public String createAadhaar(@ModelAttribute()CreateAadhaar createAadhaar, Model model){
        Adhaar adhaar=new Adhaar();
        Optional<Person> person1= personRepo.findById(createAadhaar.getPersonId());
        adhaarRepo.save(adhaar);
        return "index";
    }
}
