package hello;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import dashboard.model.Citizen;
import dashboard.persistence.CitizenRepositoy;

@Controller
public class MainController {

    private static final Logger logger = Logger.getLogger(MainController.class);
    public static List<String> messages = new ArrayList<>();
    private List<SseEmitter> sseEmitters = Collections.synchronizedList(new ArrayList<>());
    
    @RequestMapping("/")
    public String landing(Model model) {
    	model.addAttribute("messages",messages);

    	
        return "index";
    }



}