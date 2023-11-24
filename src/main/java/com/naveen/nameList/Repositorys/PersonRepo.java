package com.naveen.nameList.Repositorys;

import com.naveen.nameList.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person ,Long> {
}
