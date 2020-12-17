package com.cmlx.canal.handler;


import com.cmlx.canal.entity.FeedEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

/**
 * @Author cmlx
 * @Date -> 2020/12/14 18:20
 * @Desc ->
 **/
@Slf4j
@Component
@CanalTable(value = "fitness_app_feed")
public class FeedHandler implements EntryHandler<FeedEntity> {

    @Override
    public void insert(FeedEntity feedEntity) throws Exception {
        log.info("insert message  {}", feedEntity);
    }

    @Override
    public void update(FeedEntity before, FeedEntity after) throws Exception {
        log.info("update before {} ", before);
        log.info("update after {}", after);
    }

    @Override
    public void delete(FeedEntity feedEntity) throws Exception {
        log.info("delete  {}", feedEntity);
    }
}
