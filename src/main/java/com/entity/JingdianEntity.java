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
 * 景点
 *
 * @author 
 * @email
 * @date
 */
@TableName("jingdian")
public class JingdianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingdianEntity() {

	}

	public JingdianEntity(T t) {
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
     * 景点名
     */
    @TableField(value = "jingdian_name")

    private String jingdianName;


    /**
     * 景点类型
     */
    @TableField(value = "jingdian_types")

    private Integer jingdianTypes;


    /**
     * 景点等级
     */
    @TableField(value = "jingdian_dengji_types")

    private Integer jingdianDengjiTypes;


    /**
     * 景点缩略图
     */
    @TableField(value = "jingdian_photo")

    private String jingdianPhoto;


    /**
     * 景点详情
     */
    @TableField(value = "jingdian_content")

    private String jingdianContent;


    /**
     * 参考门票价格
     */
    @TableField(value = "jingdian_new_money")

    private Integer jingdianNewMoney;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：景点名
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 获取：景点名
	 */

    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 设置：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 获取：景点类型
	 */

    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 设置：景点等级
	 */
    public Integer getJingdianDengjiTypes() {
        return jingdianDengjiTypes;
    }


    /**
	 * 获取：景点等级
	 */

    public void setJingdianDengjiTypes(Integer jingdianDengjiTypes) {
        this.jingdianDengjiTypes = jingdianDengjiTypes;
    }
    /**
	 * 设置：景点缩略图
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 获取：景点缩略图
	 */

    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 设置：景点详情
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 获取：景点详情
	 */

    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 设置：参考门票价格
	 */
    public Integer getJingdianNewMoney() {
        return jingdianNewMoney;
    }


    /**
	 * 获取：参考门票价格
	 */

    public void setJingdianNewMoney(Integer jingdianNewMoney) {
        this.jingdianNewMoney = jingdianNewMoney;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jingdian{" +
            "id=" + id +
            ", jingdianName=" + jingdianName +
            ", jingdianTypes=" + jingdianTypes +
            ", jingdianDengjiTypes=" + jingdianDengjiTypes +
            ", jingdianPhoto=" + jingdianPhoto +
            ", jingdianContent=" + jingdianContent +
            ", jingdianNewMoney=" + jingdianNewMoney +
            ", createTime=" + createTime +
        "}";
    }
}
