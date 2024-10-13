package oit.is.z2668.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z2668.kaizi.janken.model.Janken;
import oit.is.z2668.kaizi.janken.model.Entry;

@Controller
public class JankenController {

  @Autowired
  private Entry Entry;

  /**
   *
   * @param model Thymeleafにわたすデータを保持するオブジェクト
   * @param prin  ログインユーザ情報が保持されるオブジェクト
   * @return
   */
  @GetMapping("/janken")
  public String janken(ModelMap model, Principal prin) {
    String userName = prin.getName(); // ログインユーザ情報
    model.addAttribute("userName", userName);
    this.Entry.addUser(userName);
    model.addAttribute("Entry", this.Entry);
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
