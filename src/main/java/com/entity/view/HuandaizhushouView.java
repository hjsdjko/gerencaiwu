package com.entity.view;

import com.entity.HuandaizhushouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 还贷助手
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huandaizhushou")
public class HuandaizhushouView extends HuandaizhushouEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 xuesheng
			/**
			* 姓名
			*/
			private String xueshengName;
			/**
			* 手机号
			*/
			private String xueshengPhone;
			/**
			* 身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 照片
			*/
			private String xueshengPhoto;
			/**
			* 金额
			*/
			private Double newMoney;

	public HuandaizhushouView() {

	}

	public HuandaizhushouView(HuandaizhushouEntity huandaizhushouEntity) {
		try {
			BeanUtils.copyProperties(this, huandaizhushouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















				//级联表的get和set xuesheng
					/**
					* 获取： 姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}
					/**
					* 获取： 手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}
					/**
					* 获取： 照片
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}
					/**
					* 获取： 金额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 金额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}


}
