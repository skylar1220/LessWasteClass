package com.lwc.service;

import com.lwc.domain.ShareDTO;
import java.util.List;

public interface ShareService {
    List<ShareDTO> getShareList();

    ShareDTO getShare(int s_number);
}
