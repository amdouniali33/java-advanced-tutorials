package org.dao.module;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//    @Autowired
//    DataSourceProperties dataSourceProperties;
//
//    @Bean
//    @ConfigurationProperties(prefix = DataSourceProperties.PREFIX)
//    DataSource realDataSource() {
//        DataSource dataSource = DataSourceBuilder
//                .create(this.dataSourceProperties.getClassLoader())
//                .url(this.dataSourceProperties.getUrl())
//                .username(this.dataSourceProperties.getUsername())
//                .password(this.dataSourceProperties.getPassword())
//                .build();
//        return dataSource;
//    }
//
//    @Bean
//    @Primary
//    DataSource dataSource() {
//        return new DataSourceSpy(realDataSource());
//    }
}