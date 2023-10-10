package com.lwc.mapper;

import com.lwc.domain.ShareDTO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShareMapper {
    public List<ShareDTO> getShareList();

    public ShareDTO getShare(int s_number);
}
