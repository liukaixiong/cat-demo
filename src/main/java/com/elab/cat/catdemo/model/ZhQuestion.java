package com.elab.cat.catdemo.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "zh_question")
public class ZhQuestion {
    //
    // 表字段 : zh_question.id
    @Id
    private Integer id;

    // 问题编号
    // 表字段 : zh_question.question_id
    @Column(name="question_id")
    private Integer questionId;

    // 问题地址
    // 表字段 : zh_question.url
    private String url;

    // 标题
    // 表字段 : zh_question.title
    private String title;

    // 类型
    // 表字段 : zh_question.type
    private String type;

    // 问题类型
    // 表字段 : zh_question.question_type
    @Column(name="question_type")
    private String questionType;

    // 关注者数目
    // 表字段 : zh_question.follow_count
    @Column(name="follow_count")
    private Integer followCount;

    // 被浏览数
    // 表字段 : zh_question.browse_count
    @Column(name="browse_count")
    private Integer browseCount;

    // 问题标签
    // 表字段 : zh_question.tag
    private String tag;

    // 回答总数
    // 表字段 : zh_question.total
    private Integer total;

    // 创建时间
    // 表字段 : zh_question.created
    private Date created;

    // 修改时间
    // 表字段 : zh_question.updatetime
    private Date updatetime;

    // 系统时间
    // 表字段 : zh_question.system_time
    @Column(name="system_time")
    private Date systemTime;

    // 描述
    // 表字段 : zh_question.remark
    private String remark;

    /**
     * 描述 ：
     * 对应数据库： ->  zh_question.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  zh_question.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 描述 ： 问题编号
     * 对应数据库： ->  zh_question.question_id
     *
     * @mbg.generated
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 描述 ： 问题编号
     * 对应数据库： ->  zh_question.question_id
     *
     * @mbg.generated
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 描述 ： 问题地址
     * 对应数据库： ->  zh_question.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * 描述 ： 问题地址
     * 对应数据库： ->  zh_question.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 描述 ： 标题
     * 对应数据库： ->  zh_question.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * 描述 ： 标题
     * 对应数据库： ->  zh_question.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 描述 ： 类型
     * 对应数据库： ->  zh_question.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * 描述 ： 类型
     * 对应数据库： ->  zh_question.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 描述 ： 问题类型
     * 对应数据库： ->  zh_question.question_type
     *
     * @mbg.generated
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * 描述 ： 问题类型
     * 对应数据库： ->  zh_question.question_type
     *
     * @mbg.generated
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    /**
     * 描述 ： 关注者数目
     * 对应数据库： ->  zh_question.follow_count
     *
     * @mbg.generated
     */
    public Integer getFollowCount() {
        return followCount;
    }

    /**
     * 描述 ： 关注者数目
     * 对应数据库： ->  zh_question.follow_count
     *
     * @mbg.generated
     */
    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    /**
     * 描述 ： 被浏览数
     * 对应数据库： ->  zh_question.browse_count
     *
     * @mbg.generated
     */
    public Integer getBrowseCount() {
        return browseCount;
    }

    /**
     * 描述 ： 被浏览数
     * 对应数据库： ->  zh_question.browse_count
     *
     * @mbg.generated
     */
    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    /**
     * 描述 ： 问题标签
     * 对应数据库： ->  zh_question.tag
     *
     * @mbg.generated
     */
    public String getTag() {
        return tag;
    }

    /**
     * 描述 ： 问题标签
     * 对应数据库： ->  zh_question.tag
     *
     * @mbg.generated
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * 描述 ： 回答总数
     * 对应数据库： ->  zh_question.total
     *
     * @mbg.generated
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 描述 ： 回答总数
     * 对应数据库： ->  zh_question.total
     *
     * @mbg.generated
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 描述 ： 创建时间
     * 对应数据库： ->  zh_question.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 描述 ： 创建时间
     * 对应数据库： ->  zh_question.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 描述 ： 修改时间
     * 对应数据库： ->  zh_question.updatetime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 描述 ： 修改时间
     * 对应数据库： ->  zh_question.updatetime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 描述 ： 系统时间
     * 对应数据库： ->  zh_question.system_time
     *
     * @mbg.generated
     */
    public Date getSystemTime() {
        return systemTime;
    }

    /**
     * 描述 ： 系统时间
     * 对应数据库： ->  zh_question.system_time
     *
     * @mbg.generated
     */
    public void setSystemTime(Date systemTime) {
        this.systemTime = systemTime;
    }

    /**
     * 描述 ： 描述
     * 对应数据库： ->  zh_question.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 描述 ： 描述
     * 对应数据库： ->  zh_question.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}