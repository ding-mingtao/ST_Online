package com.entity.model;

import com.entity.JiudianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 酒店订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-02
 */
public class  JiudianOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 酒店id
     */
    private Integer jiudianId;


    /**
     * 用户id
     */
    private Integer yonghuId;


    /**
     * 预定开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiudianOrderStartTime;


    /**
     * 预定结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiudianOrderEndTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 获取：酒店id
	 */
    public Integer getJiudianId() {
        return jiudianId;
    }


    /**
	 * 设置：酒店id
	 */
    public void setJiudianId(Integer jiudianId) {
        this.jiudianId = jiudianId;
    }
    /**
	 * 获取：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户id
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预定开始时间
	 */
    public Date getJiudianOrderStartTime() {
        return jiudianOrderStartTime;
    }


    /**
	 * 设置：预定开始时间
	 */
    public void setJiudianOrderStartTime(Date jiudianOrderStartTime) {
        this.jiudianOrderStartTime = jiudianOrderStartTime;
    }
    /**
	 * 获取：预定结束时间
	 */
    public Date getJiudianOrderEndTime() {
        return jiudianOrderEndTime;
    }


    /**
	 * 设置：预定结束时间
	 */
    public void setJiudianOrderEndTime(Date jiudianOrderEndTime) {
        this.jiudianOrderEndTime = jiudianOrderEndTime;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
