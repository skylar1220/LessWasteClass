package com.lwc.mapper;

import com.lwc.domain.TipDTO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TipMapper {
    public List<TipDTO> getTipList();
    public TipDTO getTip(int t_number);
}
