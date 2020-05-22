package com.qyh.tpsofbd.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:定时任务类
 * @AUTHOR: qyh
 * @create: 2020-05-22 22:18
 **/
@Component
public class scheduledTask {

    //添加注解方法开始执行
    //@Scheduled(fixedRate = 2000)
    //@Scheduled(cron = "*/2 * * * * *")
    public void sum() {
        System.out.println("结束当前时间" + new Date());
    }
}
