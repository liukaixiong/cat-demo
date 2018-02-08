package com.elab.cat.catdemo.bean;

import com.alibaba.druid.pool.DruidDataSource;
import com.x.jdbc.spring.DaoScannerConfigurer;
import com.x.jdbc.sql.ConfigurableFactory;
import com.x.jdbc.template.IJdbcTemplate;
import com.x.jdbc.template.JdbcTemplateSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Liukx
 * @create 2018-02-06 14:51
 * @email liukx@elab-plus.com
 **/
@Configuration
//@EnableCaching
//@Order(10)
public class DataSourceBean {


//    @Bean("dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/xiong?characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return dataSource;
    }

//    @Bean
    public IJdbcTemplate jdbcTemplate() {
        JdbcTemplateSupport jdbcTemplateSupport = new JdbcTemplateSupport();
        jdbcTemplateSupport.setDataSource(dataSource());
        return jdbcTemplateSupport;
    }

//    @Bean
    public ConfigurableFactory configurableFactory() {
        ConfigurableFactory configurableFactory = new ConfigurableFactory();
        configurableFactory.setSqlConfigurableLocations("sql");
        configurableFactory.buildSqlConfigurableFactory();
        return configurableFactory;
    }

    @Bean
    public DaoScannerConfigurer daoScannerConfigurer() {
        DaoScannerConfigurer daoScannerConfigurer = new DaoScannerConfigurer();
        daoScannerConfigurer.setBasePackage("com.elab.cat.catdemo.dao");
        daoScannerConfigurer.setJdbcTemplate(jdbcTemplate());
        daoScannerConfigurer.setConfigurableFactory(configurableFactory());
        return daoScannerConfigurer;
    }
}
