package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 缴费
 *
 * @author 
 * @email
 * @date 2021-04-29
 */
@TableName("jiaofei")
public class JiaofeiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaofeiEntity() {

	}

	public JiaofeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "jiaofei_time",fill = FieldFill.UPDATE)

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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Jiaofei{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiaofeiName=" + jiaofeiName +
            ", jiaofeiTime=" + jiaofeiTime +
            ", jiaofeiTypes=" + jiaofeiTypes +
            ", jiaofeiYuMoney=" + jiaofeiYuMoney +
            ", jiaofeiShiMoney=" + jiaofeiShiMoney +
            ", jiaofeiContent=" + jiaofeiContent +
            ", createTime=" + createTime +
        "}";
    }
}
