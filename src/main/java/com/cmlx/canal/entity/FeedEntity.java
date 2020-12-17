package com.cmlx.canal.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author cmlx
 * @Date -> 2020/12/14 16:48
 * @Desc ->
 **/
@Data
@Table(name = "fitness_app_feed")
public class FeedEntity implements Serializable {

    @Id
    private Long id;    //动态id
    private Integer type;   //动态类型 0-图文动态
    private String content; //内容
    private String picUrls; //图片json
    private String videos;  //视频json
    private String atUsers; //@用户列表
    private String cityCode; //城市码
    private BigDecimal longitude;   //经度
    private BigDecimal latitude;    //纬度
    private String address; //地址
    private Long pushId; //发布人id
    private Long topicId; //话题id
    private Long courseId;  //课程id
    private Integer dataState;
    private Long createTime;
    private Long updateTime;


}
