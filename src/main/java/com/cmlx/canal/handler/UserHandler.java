package com.cmlx.canal.handler;

import com.cmlx.canal.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

/**
 * @Author cmlx
 * @Date -> 2020/12/14 15:50
 * @Desc ->
 **/
@Slf4j
@Component
@CanalTable(value = "user_info")
public class UserHandler implements EntryHandler<UserInfo> {

    @Override
    public void insert(UserInfo userInfo) {
        log.info("insert message  {}", userInfo);
    }

    @Override
    public void update(UserInfo before, UserInfo after) {
        log.info("update before {} ", before);
        log.info("update after {}", after);
    }

    @Override
    public void delete(UserInfo userInfo) {
        log.info("delete  {}", userInfo);
    }
}
