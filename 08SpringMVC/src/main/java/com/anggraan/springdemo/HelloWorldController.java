package com.anggraan.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
    // need a controller method to show initial form
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }

    // new a controller method read form data
    // and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model)
    {
        // read the request parameter from the html form
        String name = request.getParameter("studentName");

        // convert the tada to all caps
        name = name.toUpperCase();

        // create the message
        String result = "Yo! " + name;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String name, Model model)
    {
        // convert the tada to all caps
        name = name.toUpperCase();

        // create the message
        String result = "Hello my friend from v3! " + name;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
