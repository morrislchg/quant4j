package com.quant.client.service;

import com.quant.core.api.ApiResult;
import com.quant.common.domain.vo.RobotStrategyVo;

public interface RobotService {


    ApiResult operatingRobot(RobotStrategyVo vo);
}
