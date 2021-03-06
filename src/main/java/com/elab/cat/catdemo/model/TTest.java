package com.elab.cat.catdemo.model;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

//import javax.persistence.Table;
//implements ColumnMapping
@Table(name = "t_test")
public class TTest {
    //
    // 表字段 : t_test.id
//    @javax.persistence.Column(name="ids")
    @Id
    private Integer id;

    //
    // 表字段 : t_test.username
//    @javax.persistence.Column(name="usernamess")
    private String username;

    //
    // 表字段 : t_test.name
//    @javax.persistence.Column(name="names")
    private String name;

    //
    // 表字段 : t_test.sex
//    @javax.persistence.Column(name="sex1")
    private String sex;

    //
    // 表字段 : t_test.status
//    @javax.persistence.Column(name="status1")
    private String status;

    //
    // 表字段 : t_test.time
//    @javax.persistence.Column(name="time1")
    private Date time;

    //
    // 表字段 : t_test.created
//    @javax.persistence.Column(name="created1")
    private Date created;

    //
    // 表字段 : t_test.test_id
//    @Column(name = "test_id")
    private String test_id;

    //
    // 表字段 : t_test.love_name
//    @javax.persistence.Column(name="love_name1")
//    @Ignore
    private String love_name;

    //    @Column(name = "girlName")
    @Ignore
    private String girlName;

    //    @javax.persistence.Column(name="girlStatus1")
    @Ignore
    private String girlStatus;

    @JoinTable(schema = "com.elab.cat.catdemo.dao.TestMapping.selectByExample", joinColumns = {
            @JoinColumn(name = "id", referencedColumnName = "id"),
            @JoinColumn(name = "status", referencedColumnName = "status")
    })
    private TTest test;

    @JoinTable(schema = "com.elab.cat.catdemo.dao.TestMapping.selectByExample", joinColumns = {
            @JoinColumn(name = "test_id", referencedColumnName = "test_id")
    })
    private List<TTest> testList;

    public List<TTest> getTestList() {
        return testList;
    }

    public void setTestList(List<TTest> testList) {
        this.testList = testList;
    }

    public TTest getTest() {
        return test;
    }

    public void setTest(TTest test) {
        this.test = test;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public String getGirlStatus() {
        return girlStatus;
    }

    public void setGirlStatus(String girlStatus) {
        this.girlStatus = girlStatus;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.id
     *
     * @mbggenerated
     */
//    @javax.persistence.Column(name="ids")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.time
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.time
     *
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.test_id
     *
     * @mbggenerated
     */
    public String getTest_id() {
        return test_id;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.test_id
     *
     * @mbggenerated
     */
    public void setTest_id(String test_id) {
        this.test_id = test_id == null ? null : test_id.trim();
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.love_name
     *
     * @mbggenerated
     */
    public String getLove_name() {
        return love_name;
    }

    /**
     * 描述 ：
     * 对应数据库： ->  t_test.love_name
     *
     * @mbggenerated
     */
    public void setLove_name(String love_name) {
        this.love_name = love_name == null ? null : love_name.trim();
    }

    /**
     * 对应映射sql中的数据
     *
     * @param rs
     * @throws SQLException
     */
    public void mappingColumn(ResultSet rs) throws SQLException {
        this.setId(rs.getInt("id"));
        this.setLove_name(rs.getString("love_name"));
        this.setName(rs.getString("name"));
        this.setUsername(rs.getString("username"));
        this.setCreated(rs.getDate("created"));
        this.setTime(rs.getDate("time"));
        this.setSex(rs.getString("sex"));
        this.setStatus(rs.getString("status"));
        this.setTest_id(rs.getString("test_id"));
    }


    @Override
    public String toString() {
        return "TTest{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", status='" + status + '\'' +
                ", time=" + time +
                ", created=" + created +
                ", test_id='" + test_id + '\'' +
                ", love_name='" + love_name + '\'' +
                ", girl_name='" + girlName + '\'' +
                ", girlStatus='" + girlStatus + '\'' +
                '}';
    }
}