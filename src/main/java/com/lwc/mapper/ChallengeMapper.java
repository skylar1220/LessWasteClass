package com.lwc.mapper;

import com.lwc.domain.ChallengeDTO;
import com.lwc.domain.ChallengeMemberDTO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChallengeMapper {
    public List<ChallengeDTO> getChallengeList();

    public ChallengeDTO getChallenge(int c_number);

//    public void joinChallenge(ChallengeMemberDTO challengeMemberDTO);
}
