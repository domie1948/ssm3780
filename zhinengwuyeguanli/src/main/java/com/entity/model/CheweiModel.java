package com.entity.model;

import com.entity.CheweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车位
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-29
 */
public class CheweiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车位名称
     */
    private String cheweiName;


    /**
     * 车位地址
     */
    private String cheweiAddress;


    /**
     * 车位月价格
     */
    private Double cheweiNewMoney;


    /**
     * 车位创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 车位详情
     */
    private String cheweiContent;


    /**
     * 是否被使用
     */
    private Integer cheweiTypes;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
     * 车位图片
     */
    private String cheweiPhoto;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：车位名称
	 */
    public String getCheweiName() {
        return cheweiName;
    }


    /**
	 * 设置：车位名称
	 */
    public void setCheweiName(String cheweiName) {
        this.cheweiName = cheweiName;
    }
    /**
	 * 获取：车位地址
	 */
    public String getCheweiAddress() {
        return cheweiAddress;
    }


    /**
	 * 设置：车位地址
	 */
    public void setCheweiAddress(String cheweiAddress) {
        this.cheweiAddress = cheweiAddress;
    }
    /**
	 * 获取：车位月价格
	 */
    public Double getCheweiNewMoney() {
        return cheweiNewMoney;
    }


    /**
	 * 设置：车位月价格
	 */
    public void setCheweiNewMoney(Double cheweiNewMoney) {
        this.cheweiNewMoney = cheweiNewMoney;
    }
    /**
	 * 获取：车位创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：车位创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：车位详情
	 */
    public String getCheweiContent() {
        return cheweiContent;
    }


    /**
	 * 设置：车位详情
	 */
    public void setCheweiContent(String cheweiContent) {
        this.cheweiContent = cheweiContent;
    }
    /**
	 * 获取：是否被使用
	 */
    public Integer getCheweiTypes() {
        return cheweiTypes;
    }


    /**
	 * 设置：是否被使用
	 */
    public void setCheweiTypes(Integer cheweiTypes) {
        this.cheweiTypes = cheweiTypes;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
	 * 获取：车位图片
	 */
    public String getCheweiPhoto() {
        return cheweiPhoto;
    }


    /**
	 * 设置：车位图片
	 */
    public void setCheweiPhoto(String cheweiPhoto) {
        this.cheweiPhoto = cheweiPhoto;
    }

    }
