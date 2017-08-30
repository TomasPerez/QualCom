package com.guenther.spring2.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.InputStream;

@Controller
public class HomeController {

    private String address;
    private String city;
    private String state;
    private String weight;
    private String company;

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("message", "Hello driver!");
        mv.addObject("bob", "Please enter your number to check in:");
        mv.addObject("title", "Welcome to QualComm 2.0!");
        return mv;
    }
    @RequestMapping("/home")
    public ModelAndView register(@RequestParam("PhoneNumber")String phone) {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("message", "Welcome back driver!");
        mv.addObject("action", "What will it be today?!");
        mv.addObject("phone",phone);
        return mv;
    }


    @RequestMapping("/allinfo")
    public ModelAndView allinfo(@RequestParam("checkin")String checkin) {
            if (checkin.equals("Checkout")){
                ModelAndView mv = new ModelAndView("allinfo");
                mv.addObject("inst", "Please enter your number here: ");
                return mv;
            }else{
                ModelAndView mv = new ModelAndView("form");
               mv.addObject("inst", "Great news, You've been checked in!");
                return mv;
            }
    }

    @RequestMapping("/form")
    public ModelAndView form(){
        ModelAndView mv = new ModelAndView("form");
        mv.addObject("inst", "Awesome! You've successfully been checked out.!");
        return mv;
    }
    @RequestMapping(value = "/Billoflading")
    public ModelAndView addbills (
            @RequestParam("address") String address,
            @RequestParam("company") String company,
            @RequestParam("city") String city,
            @RequestParam("state") String state,
            @RequestParam("weight") String weight

    ) {
        //add the info to DB through DAO
        boolean result = DAO.addspecs(address, company, city, state, weight);

        ModelAndView mv = new ModelAndView("Billoflading");
        mv.addObject("message","Your info has been stored! ");
        mv.addObject("address", address);
        mv.addObject("company", company);
        mv.addObject("city", city);
        mv.addObject("state", state);
        mv.addObject("weight", weight);
        return mv;
    }


}


//            this.company = company;
//            this.address = address;
//            this.city = city;
//            this.state = state;
//            this.weight = weight;


//    @RequestMapping("/checkout")
//    public ModelAndView checkout(){
//        return
//    }
//    @RequestMapping("/admin")
//    public ModelAndView admin(){
//        return
//    }
