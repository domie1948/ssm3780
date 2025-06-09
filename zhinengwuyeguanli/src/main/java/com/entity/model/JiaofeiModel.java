package com.entity.model;

import com.entity.JiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 缴费
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-29
 */
public class JiaofeiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 缴费名称
     */
    private String jiaofeiName;


    /**
     * 月份
     */
    private String jiaofeiTime;


    /**
     * 缴费类型
     */
    private Integer jiaofeiTypes;


    /**
     * 缴费金额
     */
    private Double jiaofeiYuMoney;


    /**
     * 实收金额
     */
    private Double jiaofeiShiMoney;


    /**
     * 缴费详情
     */
    private String jiaofeiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：缴费名称
	 */
    public String getJiaofeiName() {
        return jiaofeiName;
    }


    /**
	 * 设置：缴费名称
	 */
    public void setJiaofeiName(String jiaofeiName) {
        this.jiaofeiName = jiaofeiName;
    }
    /**
	 * 获取：月份
	 */
    public String getJiaofeiTime() {
        return jiaofeiTime;
    }


    /**
	 * 设置：月份
	 */
    public void setJiaofeiTime(String jiaofeiTime) {
        this.jiaofeiTime = jiaofeiTime;
    }
    /**
	 * 获取：缴费类型
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 设置：缴费类型
	 */
    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 获取：缴费金额
	 */
    public Double getJiaofeiYuMoney() {
        return jiaofeiYuMoney;
    }


    /**
	 * 设置：缴费金额
	 */
    public void setJiaofeiYuMoney(Double jiaofeiYuMoney) {
        this.jiaofeiYuMoney = jiaofeiYuMoney;
    }
    /**
	 * 获取：实收金额
	 */
    public Double getJiaofeiShiMoney() {
        return jiaofeiShiMoney;
    }


    /**
	 * 设置：实收金额
	 */
    public void setJiaofeiShiMoney(Double jiaofeiShiMoney) {
        this.jiaofeiShiMoney = jiaofeiShiMoney;
    }
    /**
	 * 获取：缴费详情
	 */
    public String getJiaofeiContent() {
        return jiaofeiContent;
    }


    /**
	 * 设置：缴费详情
	 */
    public void setJiaofeiContent(String jiaofeiContent) {
        this.jiaofeiContent = jiaofeiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
