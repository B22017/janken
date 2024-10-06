package oit.is.z2668.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {

  @GetMapping("/janken")
  public String janken(@RequestParam String name, ModelMap model) {
    String userName = name;
    model.addAttribute("userName", userName);
    return "janken.html";
  }
}
