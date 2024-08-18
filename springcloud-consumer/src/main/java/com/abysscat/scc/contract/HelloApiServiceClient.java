package com.abysscat.scc.contract;

import com.abysscat.springcloudapi.service.HelloApiService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * hello service client.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:13
 */
@FeignClient(value = "helloService", contextId = "hello")
public interface HelloApiServiceClient extends HelloApiService {


}
