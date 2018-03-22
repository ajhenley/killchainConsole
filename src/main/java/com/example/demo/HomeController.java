package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    @RequestMapping("/}")
    public String basic(Model model){
        return "index";
    }

    @RequestMapping("/data")
    public @ResponseBody String showIndex(){
        RestTemplate restTemplate = new RestTemplate();
        Gamestate gamestate = new Gamestate("score","server","status");
        return gamestate.toString();
    }

    @PostMapping ("/data")
    public @ResponseBody String showTests(@RequestParam String command){
        command = "processing..." + command + "...has been processed.";
        return command;
    }

    @PostMapping ("/datas")
    public @ResponseBody String processCommands(@RequestParam String command,
                                                @RequestParam String gameid,
                                                @RequestParam String gamehash){
        if (gameid.equals("") || gamehash.equals("")) {
            return "redirect:/newmatch";
        }
        command = Command.process(command);
        return command;
    }

}
