package com.entity.view;

import com.entity.CheweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 车位
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-29
 */
@TableName("chewei")
public class CheweiView extends CheweiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否被使用的值
		*/
		private String cheweiValue;



	public CheweiView() {

	}

	public CheweiView(CheweiEntity cheweiEntity) {
		try {
			BeanUtils.copyProperties(this, cheweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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















}
