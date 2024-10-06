package oit.is.z2668.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z2668.kaizi.janken.model.Janken;

@Controller
public class JankenController {

  @GetMapping("/janken")
  public String janken(@RequestParam String name, ModelMap model) {
    Janken janken = new Janken(name);
    janken.setName(name);
    model.addAttribute("userName", janken.getName());
    return "janken.html";
  }

  @GetMapping("/jankengame")
  public String jankengame(@RequestParam String hand, ModelMap model) {
    String userHand = hand;
    model.addAttribute("userHand", userHand);
    Janken janken = new Janken(userHand);
    model.addAttribute("cpuHand", janken.getCpuHand());
    model.addAttribute("result", janken.getResult());
    return "janken.html";
  }
}
