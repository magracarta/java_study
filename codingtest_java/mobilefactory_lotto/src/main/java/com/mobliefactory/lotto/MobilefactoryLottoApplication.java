package com.mobliefactory.lotto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mobliefactory.lotto.DAO")
public class MobilefactoryLottoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobilefactoryLottoApplication.class, args);
    }

}
