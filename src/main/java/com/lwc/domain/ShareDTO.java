package com.lwc.domain;

import java.util.Date;
import lombok.Data;

@Data
public class ShareDTO {
    private int s_number;
    private String s_name;
    private String s_content;
    private Date s_regdate;
    private int m_number;
    private int si_number;
    private int do_number;
    private String s_pic;
    private int menu_category;

}
