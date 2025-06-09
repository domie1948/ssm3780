package com.entity.vo;

import com.entity.JiaofeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 缴费
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-29
 */
@TableName("jiaofei")
public class JiaofeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 缴费名称
     */

    @TableField(value = "jiaofei_name")
    private String jiaofeiName;


    /**
     * 月份
     */

    @TableField(value = "jiaofei_time")
    private String jiaofeiTime;


    /**
     * 缴费类型
     */

    @TableField(value = "jiaofei_types")
    private Integer jiaofeiTypes;


    /**
     * 缴费金额
     */

    @TableField(value = "jiaofei_yu_money")
    private Double jiaofeiYuMoney;


    /**
     * 实收金额
     */

    @TableField(value = "jiaofei_shi_money")
    private Double jiaofeiShiMoney;


    /**
     * 缴费详情
     */

    @TableField(value = "jiaofei_content")
    private String jiaofeiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：缴费名称
	 */
    public String getJiaofeiName() {
        return jiaofeiName;
    }


    /**
	 * 获取：缴费名称
	 */

    public void setJiaofeiName(String jiaofeiName) {
        this.jiaofeiName = jiaofeiName;
    }
    /**
	 * 设置：月份
	 */
    public String getJiaofeiTime() {
        return jiaofeiTime;
    }


    /**
	 * 获取：月份
	 */

    public void setJiaofeiTime(String jiaofeiTime) {
        this.jiaofeiTime = jiaofeiTime;
    }
    /**
	 * 设置：缴费类型
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 获取：缴费类型
	 */

    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 设置：缴费金额
	 */
    public Double getJiaofeiYuMoney() {
        return jiaofeiYuMoney;
    }


    /**
	 * 获取：缴费金额
	 */

    public void setJiaofeiYuMoney(Double jiaofeiYuMoney) {
        this.jiaofeiYuMoney = jiaofeiYuMoney;
    }
    /**
	 * 设置：实收金额
	 */
    public Double getJiaofeiShiMoney() {
        return jiaofeiShiMoney;
    }


    /**
	 * 获取：实收金额
	 */

    public void setJiaofeiShiMoney(Double jiaofeiShiMoney) {
        this.jiaofeiShiMoney = jiaofeiShiMoney;
    }
    /**
	 * 设置：缴费详情
	 */
    public String getJiaofeiContent() {
        return jiaofeiContent;
    }


    /**
	 * 获取：缴费详情
	 */

    public void setJiaofeiContent(String jiaofeiContent) {
        this.jiaofeiContent = jiaofeiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
