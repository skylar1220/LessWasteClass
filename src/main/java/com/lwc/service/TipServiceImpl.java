package com.lwc.service;

import com.lwc.domain.TipDTO;
import com.lwc.mapper.TipMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class TipServiceImpl implements TipService{
    private final TipMapper tipMapper;
    @Override
    public List<TipDTO> getTipList() {
        return tipMapper.getTipList();
    }

    @Override
    public TipDTO getTip(int t_number) {
        return tipMapper.getTip(t_number);
    }
}
