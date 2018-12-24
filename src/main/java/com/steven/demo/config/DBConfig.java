//package com.steven.demo.config;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//
//import java.beans.PropertyVetoException;
//
//@Configuration
//@ConfigurationProperties(prefix = "spring.datasource")
//public class DBConfig {
//
//    @Getter
//    @Setter
//    private String url;
//
//    @Getter
//    @Setter
//    private String password;
//
//    @Getter
//    @Setter
//    private String username;
//
//    @Getter
//    @Setter
//    private String driverClassName;
//
//    @Bean(name="dataSource")
//    public ComboPooledDataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(driverClassName);
//        dataSource.setJdbcUrl(url);
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//        dataSource.setMaxPoolSize(20);
//        dataSource.setMinPoolSize(5);
//        dataSource.setInitialPoolSize(10);
//        dataSource.setMaxIdleTime(300);
//        dataSource.setAcquireIncrement(5);
//        dataSource.setIdleConnectionTestPeriod(60);
//
//        return dataSource;
//    }
//
//}