package net.ducatillon.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @RequestMapping("/oups")
  public String oups() {
    return "notimplemented";
  }

  @RequestMapping({"", "/", "index", "index.html"})
  public String index() {
    return "index";
  }
}
