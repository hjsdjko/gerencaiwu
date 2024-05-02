package com.entity.model;

import com.entity.HuandaizhushouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 还贷助手
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuandaizhushouModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 名目
     */
    private String huandaizhushouName;


    /**
     * 开始还贷时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date huandaizhushouTime;


    /**
     * 几个月
     */
    private Integer huandaizhushouNumber;


    /**
     * 每月金额
     */
    private Double huandaizhushouNewMoney;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 备注
     */
    private String huandaizhushouContent;


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
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：名目
	 */
    public String getHuandaizhushouName() {
        return huandaizhushouName;
    }


    /**
	 * 设置：名目
	 */
    public void setHuandaizhushouName(String huandaizhushouName) {
        this.huandaizhushouName = huandaizhushouName;
    }
    /**
	 * 获取：开始还贷时间
	 */
    public Date getHuandaizhushouTime() {
        return huandaizhushouTime;
    }


    /**
	 * 设置：开始还贷时间
	 */
    public void setHuandaizhushouTime(Date huandaizhushouTime) {
        this.huandaizhushouTime = huandaizhushouTime;
    }
    /**
	 * 获取：几个月
	 */
    public Integer getHuandaizhushouNumber() {
        return huandaizhushouNumber;
    }


    /**
	 * 设置：几个月
	 */
    public void setHuandaizhushouNumber(Integer huandaizhushouNumber) {
        this.huandaizhushouNumber = huandaizhushouNumber;
    }
    /**
	 * 获取：每月金额
	 */
    public Double getHuandaizhushouNewMoney() {
        return huandaizhushouNewMoney;
    }


    /**
	 * 设置：每月金额
	 */
    public void setHuandaizhushouNewMoney(Double huandaizhushouNewMoney) {
        this.huandaizhushouNewMoney = huandaizhushouNewMoney;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：备注
	 */
    public String getHuandaizhushouContent() {
        return huandaizhushouContent;
    }


    /**
	 * 设置：备注
	 */
    public void setHuandaizhushouContent(String huandaizhushouContent) {
        this.huandaizhushouContent = huandaizhushouContent;
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
