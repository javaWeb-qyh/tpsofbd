package com.qyh.tpsofbd.task;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @description:异步任务类
 * @AUTHOR: qyh
 * @create: 2020-05-22 22:10
 **/
@Component
public class AsyncTask {

    public void task1() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(2000L);
        long end=System.currentTimeMillis();
        System.out.println("任务1耗时="+(end-begin));
    }

    public Future<String> task2() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(2000L);
        long end=System.currentTimeMillis();
        System.out.println("任务2耗时="+(end-begin));
        return new AsyncResult<String>("任务2");
    }
}
