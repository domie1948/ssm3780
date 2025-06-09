package com.entity.view;

import com.entity.CheweiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 车位收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-29
 */
@TableName("chewei_collection")
public class CheweiCollectionView extends CheweiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 chewei
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
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 车位创建时间
			*/
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
				* 是否被使用的值
				*/
				private String cheweiValue;
			/**
			* 车位图片
			*/
			private String cheweiPhoto;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;

	public CheweiCollectionView() {

	}

	public CheweiCollectionView(CheweiCollectionEntity cheweiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, cheweiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set chewei
					/**
					* 获取： 车位名称
					*/
					public String getCheweiName() {
						return cheweiName;
					}
					/**
					* 设置： 车位名称
					*/
					public void setCheweiName(String cheweiName) {
						this.cheweiName = cheweiName;
					}
					/**
					* 获取： 车位地址
					*/
					public String getCheweiAddress() {
						return cheweiAddress;
					}
					/**
					* 设置： 车位地址
					*/
					public void setCheweiAddress(String cheweiAddress) {
						this.cheweiAddress = cheweiAddress;
					}
					/**
					* 获取： 车位月价格
					*/
					public Double getCheweiNewMoney() {
						return cheweiNewMoney;
					}
					/**
					* 设置： 车位月价格
					*/
					public void setCheweiNewMoney(Double cheweiNewMoney) {
						this.cheweiNewMoney = cheweiNewMoney;
					}
					/**
					* 获取： 车位创建时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 车位创建时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}
					/**
					* 获取： 车位详情
					*/
					public String getCheweiContent() {
						return cheweiContent;
					}
					/**
					* 设置： 车位详情
					*/
					public void setCheweiContent(String cheweiContent) {
						this.cheweiContent = cheweiContent;
					}
					/**
					* 获取： 是否被使用
					*/
					public Integer getCheweiTypes() {
						return cheweiTypes;
					}
					/**
					* 设置： 是否被使用
					*/
					public void setCheweiTypes(Integer cheweiTypes) {
						this.cheweiTypes = cheweiTypes;
					}


						/**
						* 获取： 是否被使用的值
						*/
						public String getCheweiValue() {
							return cheweiValue;
						}
						/**
						* 设置： 是否被使用的值
						*/
						public void setCheweiValue(String cheweiValue) {
							this.cheweiValue = cheweiValue;
						}
					/**
					* 获取： 车位图片
					*/
					public String getCheweiPhoto() {
						return cheweiPhoto;
					}
					/**
					* 设置： 车位图片
					*/
					public void setCheweiPhoto(String cheweiPhoto) {
						this.cheweiPhoto = cheweiPhoto;
					}































				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}



}
