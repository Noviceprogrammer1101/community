package com.wei.community.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author wei
 */

@Data
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
