package com.springtuts.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {


        @RequestMapping("home")
        public ModelAndView home(Alien alien)
        {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("home");
            mv.addObject("varname", alien);
            return mv;
        }

        // type 3 using modelandview
        // @RequestMapping("home")
        // public ModelAndView home(@RequestParam("name") String myName)
        // {
        //     ModelAndView mv = new ModelAndView();
        //     mv.setViewName("home");
        //     mv.addObject("varname", myName);
        //     return mv;
        // }

        // TYPE 2
        // @RequestMapping("home")
        // public String home(@RequestParam("name") String myName, HttpSession session)
        // {   
        //     System.out.println("name is " + myName);
        //     session.setAttribute("varname", myName);
        //     return "home";
        // }

        // TYPE ONE
    // @RequestMapping("home")
    // // @ResponseBody
    // public String home(HttpServletRequest req, HttpServletResponse res)
    // {
    //     HttpSession session = req.getSession();
    //     String name = req.getParameter("name");
    //     System.out.println("name from page is " + name);

    //     // here "varname" means webpage variable and varname is inside this file
    //     session.setAttribute("varname", name);
    //     return "home";
    // }

}
