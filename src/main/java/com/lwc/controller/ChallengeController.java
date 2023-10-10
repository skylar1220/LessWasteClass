package com.lwc.controller;

import com.lwc.domain.ChallengeDTO;
import com.lwc.service.ChallengeService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@Log4j2
@RequestMapping("/challenge")
public class ChallengeController {
    private final ChallengeService challengeService;

    @GetMapping("/list")
    public String list(Model model) {
        List<ChallengeDTO> challengeList = challengeService.getChallengeList();
        model.addAttribute("challengeList", challengeList);
        return "challenge/list";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("c_number") int c_number, Model model) {
        ChallengeDTO challengeDTO = challengeService.getChallenge(c_number);
        model.addAttribute("challenge", challengeDTO);
        return "challenge/detail";
    }
//    @PostMapping("/detail")
//    public String join(@ModelAttribute ChallengeDTO challengeDTO) {
//        challengeService.joinChallenge(m_number, c_number);
//        return "redirect::challenge/detail";
//    }
}
