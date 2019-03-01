package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    BullhornRepository bullhornRepository;

    @GetMapping("/")
    public String listBullhorn(Model model){
        model.addAttribute("bullhorns",bullhornRepository.findAll());
        return "list";
    }
    @GetMapping("/add")
    public String bullhornForm(Model model){
        model.addAttribute("bullhorns",new Bullhorn());
        return "bullHornForm";
    }
    @PostMapping("/process")
    public String processBullhorn(@Valid Bullhorn bullhorns, BindingResult result, Model model){
        model.addAttribute("bullhorns",bullhorns);
        if(result.hasErrors()){
            return "bullHornForm";
        }
        else{
            bullhornRepository.save(bullhorns);
            return "redirect:/";
        }
    }
    @RequestMapping("/update/{id}")
    public String updateBullHorn(@PathVariable("id") long id,Model model){
        model.addAttribute("bullhorns",bullhornRepository.findById(id));
        return "bullhornForm";
        //return "list";
    }
    @RequestMapping("/delete/{id}")
    public String deleteBullHorn(@PathVariable("id") long id ,Model model){
       // model.addAttribute("bullhorns",bullhornRepository.deleteById(id));
         bullhornRepository.deleteById(id);
         return "redirect:/";
    }
}
