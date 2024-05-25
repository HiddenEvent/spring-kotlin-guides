package me.ricky.storage.rdb.main.config

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = ["me.ricky.storage.rdb.main.config"])
@EnableJpaRepositories(basePackages = ["me.ricky.storage.rdb.main.config"])
internal class MainJpaConfig
