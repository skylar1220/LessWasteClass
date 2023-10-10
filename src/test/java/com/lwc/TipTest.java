package com.lwc;

import com.lwc.domain.TipDTO;
import com.lwc.mapper.TipMapper;
import com.lwc.service.TipService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TipTest {
    @Autowired
    private TipMapper tipMapper;
    @Autowired
    private TipService tipService;

    @Test
    public void getTipListMapper(){
        List<TipDTO> tipList = tipMapper.getTipList();
        System.out.println(tipList.toString());
    }

    @Test
    public void getTipListService(){
        List<TipDTO> tipList2 = tipService.getTipList();
        System.out.println("ser:" + tipList2.toString());
    }
}
