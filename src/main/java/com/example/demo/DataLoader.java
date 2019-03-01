package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;

@Component
public class DataLoader  implements CommandLineRunner {
    @Autowired
    BullhornRepository bullhornRepository;
    @Override
    public void run(String...String ) throws Exception{
        Bullhorn bullhorn=new Bullhorn("Java","here is simple document for java","12/12/2019","Ayaleneh");
        bullhornRepository.save(bullhorn);
    }
}
