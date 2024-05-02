package com.entity.vo;

import com.entity.HuandaizhushouEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 还贷助手
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huandaizhushou")
public class HuandaizhushouVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "huandaizhushou_time")
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

    @TableField(value = "insert_time")
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

}
