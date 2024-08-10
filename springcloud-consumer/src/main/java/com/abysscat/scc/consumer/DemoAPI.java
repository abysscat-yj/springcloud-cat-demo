package com.abysscat.scc.consumer;

import com.abysscat.scc.contract.HelloServiceClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * demo client.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:20
 */
@FeignClient("helloService")
public interface DemoAPI extends HelloServiceClient {
}
