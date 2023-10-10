package com.lwc.controller;

import com.lwc.domain.TipDTO;
import com.lwc.service.TipService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@Log4j2
@RequestMapping("/tip")
public class TipController {
    private final TipService tipService;
    @GetMapping("/list")
    public String list(Model model) {
        List<TipDTO> tipList = tipService.getTipList();
        model.addAttribute("tipList", tipList);
        return "tip/list";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam("t_number") int t_number, Model model) {
        TipDTO tipDTO = tipService.getTip(t_number);
        model.addAttribute("tip", tipDTO);
        return "tip/detail";
    }
}
