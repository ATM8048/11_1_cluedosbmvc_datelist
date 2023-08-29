package ch.bbw.ma.cluedosbmvc.cluedosbmvc;

import ch.bbw.ma.cluedosbmvc.cluedosbmvc.model.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @Autowired


    private final DateService service;
    @Autowired
    public ViewController(DateService service){
        this.service = service;
    }
    @GetMapping("/")

    public String showList(Model model){
        model.addAttribute("personList", service.getPersonList());
        System.out.println("ViewController.showList");
        return "index";
    }
}
