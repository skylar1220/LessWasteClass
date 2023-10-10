package com.lwc.domain;

import java.util.Date;
import lombok.Data;

@Data
public class ChallengeDTO {
    private int c_number;
    private String c_name;
    private String c_content;
    private Date c_regdate;
    private int m_number;
    private int menu_category;

}
