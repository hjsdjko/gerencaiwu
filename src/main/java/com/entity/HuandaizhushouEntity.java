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
 * 还贷助手
 *
 * @author 
 * @email
 */
@TableName("huandaizhushou")
public class HuandaizhushouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuandaizhushouEntity() {

	}

	public HuandaizhushouEntity(T t) {
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
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 名目
     */
    @TableField(value = "huandaizhushou_name")

    private String huandaizhushouName;


    /**
     * 开始还贷时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "huandaizhushou_time",fill = FieldFill.UPDATE)

    private Date huandaizhushouTime;


    /**
     * 几个月
     */
    @TableField(value = "huandaizhushou_number")

    private Integer huandaizhushouNumber;


    /**
     * 每月金额
     */
    @TableField(value = "huandaizhushou_new_money")

    private Double huandaizhushouNewMoney;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 备注
     */
    @TableField(value = "huandaizhushou_content")

    private String huandaizhushouContent;


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
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：名目
	 */
    public String getHuandaizhushouName() {
        return huandaizhushouName;
    }


    /**
	 * 获取：名目
	 */

    public void setHuandaizhushouName(String huandaizhushouName) {
        this.huandaizhushouName = huandaizhushouName;
    }
    /**
	 * 设置：开始还贷时间
	 */
    public Date getHuandaizhushouTime() {
        return huandaizhushouTime;
    }


    /**
	 * 获取：开始还贷时间
	 */

    public void setHuandaizhushouTime(Date huandaizhushouTime) {
        this.huandaizhushouTime = huandaizhushouTime;
    }
    /**
	 * 设置：几个月
	 */
    public Integer getHuandaizhushouNumber() {
        return huandaizhushouNumber;
    }


    /**
	 * 获取：几个月
	 */

    public void setHuandaizhushouNumber(Integer huandaizhushouNumber) {
        this.huandaizhushouNumber = huandaizhushouNumber;
    }
    /**
	 * 设置：每月金额
	 */
    public Double getHuandaizhushouNewMoney() {
        return huandaizhushouNewMoney;
    }


    /**
	 * 获取：每月金额
	 */

    public void setHuandaizhushouNewMoney(Double huandaizhushouNewMoney) {
        this.huandaizhushouNewMoney = huandaizhushouNewMoney;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：备注
	 */
    public String getHuandaizhushouContent() {
        return huandaizhushouContent;
    }


    /**
	 * 获取：备注
	 */

    public void setHuandaizhushouContent(String huandaizhushouContent) {
        this.huandaizhushouContent = huandaizhushouContent;
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
        return "Huandaizhushou{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", huandaizhushouName=" + huandaizhushouName +
            ", huandaizhushouTime=" + huandaizhushouTime +
            ", huandaizhushouNumber=" + huandaizhushouNumber +
            ", huandaizhushouNewMoney=" + huandaizhushouNewMoney +
            ", insertTime=" + insertTime +
            ", huandaizhushouContent=" + huandaizhushouContent +
            ", createTime=" + createTime +
        "}";
    }
}
