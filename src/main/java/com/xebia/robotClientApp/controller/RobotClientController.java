package com.xebia.robotClientApp.controller;

import com.xebia.robotClientApp.client.RobotServiceClient;
import com.xebia.robotClientApp.domain.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RobotClientController {

    @Autowired
    RobotServiceClient client;

    @GetMapping("/")
    public ModelAndView home(){
        populateRobot();
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("/walk")
    public ModelAndView walk(@ModelAttribute("robot") Robot robot, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView("robot");
        modelAndView.addObject("response", client.walkingService(robot).getBody());
        return modelAndView;
    }

    @PostMapping("/liftWeight")
    public ModelAndView liftWeight(@ModelAttribute("robot") Robot robot, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView("robot");
        modelAndView.addObject("response", client.liftWeight(robot).getBody());
        return modelAndView;
    }

    @PostMapping("/scan")
    public ModelAndView scan(@ModelAttribute("robot") Robot robot, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView("robot");
        modelAndView.addObject("response", client.displayPrice(robot).getBody());
        return modelAndView;
    }

    /**
     * This creates a new address object for the empty form and stuffs it into
     * the model
     */
    @ModelAttribute("robot")
    public Robot populateRobot() {
        Robot robot = new Robot();
        return robot;
    }
}
