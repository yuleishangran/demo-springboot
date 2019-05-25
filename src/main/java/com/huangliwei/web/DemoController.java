package com.huangliwei.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/show")
    @ResponseBody
    public Map<String, String> show() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("username", "yuleishangran");
        map.put("password", "123456");
        return map;
    }


    @RequestMapping("/login")
    public ModelAndView login(Model model)
    {
        model.addAttribute("name","hwx577316");
        model.addAttribute("email","353045159@qq.com");
        return new ModelAndView("home/index","model1",model);
    }
}
