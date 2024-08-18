package com.abysscat.scc.contract;

import com.abysscat.springcloudapi.service.UserApiService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * user service client.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:13
 */
@FeignClient(value = "helloService", contextId = "user")
public interface UserApiServiceClient extends UserApiService {

}
