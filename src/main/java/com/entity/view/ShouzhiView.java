package com.entity.view;

import com.entity.ShouzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 收支
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shouzhi")
public class ShouzhiView extends ShouzhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 收支的值
		*/
		private String shouzhiYesnoValue;
		/**
		* 收支类型的值
		*/
		private String shouzhiLeixingValue;



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

	public ShouzhiView() {

	}

	public ShouzhiView(ShouzhiEntity shouzhiEntity) {
		try {
			BeanUtils.copyProperties(this, shouzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 收支的值
			*/
			public String getShouzhiYesnoValue() {
				return shouzhiYesnoValue;
			}
			/**
			* 设置： 收支的值
			*/
			public void setShouzhiYesnoValue(String shouzhiYesnoValue) {
				this.shouzhiYesnoValue = shouzhiYesnoValue;
			}
			/**
			* 获取： 收支类型的值
			*/
			public String getShouzhiLeixingValue() {
				return shouzhiLeixingValue;
			}
			/**
			* 设置： 收支类型的值
			*/
			public void setShouzhiLeixingValue(String shouzhiLeixingValue) {
				this.shouzhiLeixingValue = shouzhiLeixingValue;
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
