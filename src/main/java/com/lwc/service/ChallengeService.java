package com.lwc.service;

import com.lwc.domain.ChallengeDTO;
import java.util.List;

public interface ChallengeService {
    List<ChallengeDTO> getChallengeList();

    ChallengeDTO getChallenge(int c_number);

//    void joinChallenge(int m_number, int c_number);
}
