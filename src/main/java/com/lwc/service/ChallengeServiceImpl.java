package com.lwc.service;

import com.lwc.domain.ChallengeDTO;
import com.lwc.domain.ChallengeMemberDTO;
import com.lwc.mapper.ChallengeMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class ChallengeServiceImpl implements ChallengeService{
    private final ChallengeMapper challengeMapper;
    @Override
    public List<ChallengeDTO> getChallengeList() {
        return challengeMapper.getChallengeList();
    }

    @Override
    public ChallengeDTO getChallenge(int c_number) {
        return challengeMapper.getChallenge(c_number);
    }

//    @Override
//    public void joinChallenge(int m_number, int c_number) {
//        ChallengeMemberDTO challengeMemberDTO = new ChallengeMemberDTO();
//        challengeMemberDTO.setM_number(m_number);
//        challengeMemberDTO.setC_number(c_number);
//        challengeMapper.joinChallenge(challengeMemberDTO);
//    }
}
