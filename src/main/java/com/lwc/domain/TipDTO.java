package com.lwc.domain;

import java.util.Date;
import lombok.Data;

@Data
public class TipDTO {
    private int t_number;
    private String t_name;
    private String t_content;
    private Date t_regdate;
    private int m_number;
    private int menu_category;

}
