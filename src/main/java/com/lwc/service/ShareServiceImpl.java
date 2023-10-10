package com.lwc.service;

import com.lwc.domain.ShareDTO;
import com.lwc.mapper.ShareMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class ShareServiceImpl implements ShareService{
    private final ShareMapper shareMapper;
    @Override
    public List<ShareDTO> getShareList() {
        return shareMapper.getShareList();
    }

    @Override
    public ShareDTO getShare(int s_number) {
        return shareMapper.getShare(s_number);
    }
}
