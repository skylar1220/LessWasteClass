package com.lwc;

import com.lwc.domain.ChallengeDTO;
import com.lwc.mapper.ChallengeMapper;
import com.lwc.service.ChallengeService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChallengeTest {
    @Autowired
    private ChallengeMapper challengeMapper;
    @Autowired
    private ChallengeService challengeService;

    @Test
    public void getChallengeListMapper(){
        List<ChallengeDTO> challengeDTOListList = challengeMapper.getChallengeList();
        System.out.println(challengeDTOListList.toString());
    }

//    @Test
//    public void getChallengeListService(){
//        List<TipDTO> tipList2 = tipService.getTipList();
//        System.out.println("ser:" + tipList2.toString());
//    }
}
