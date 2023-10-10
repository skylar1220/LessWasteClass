package com.lwc.service;

import com.lwc.domain.TipDTO;
import java.util.List;

public interface TipService {
    List<TipDTO> getTipList();
    TipDTO getTip(int t_number);
}
