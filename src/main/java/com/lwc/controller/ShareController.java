package com.lwc.controller;

import com.lwc.domain.ShareDTO;
import com.lwc.service.ShareService;
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
@RequestMapping("/share")
public class ShareController {
    private final ShareService shareService;
    @GetMapping("/list")
    public String list(Model model) {
        List<ShareDTO> shareList = shareService.getShareList();
        model.addAttribute("shareList", shareList);
        return "share/list";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam("s_number") int s_number, Model model) {
        ShareDTO shareDTO = shareService.getShare(s_number);
        model.addAttribute("share", shareDTO);
        return "share/detail";
    }
}
