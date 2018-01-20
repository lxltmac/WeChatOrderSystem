package cn.chenhaoxiang.service;

import cn.chenhaoxiang.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 9:25.
 * Explain: 支付
 */
public interface PayService {
    /**
     * 发起支付
     * @param orderDTO
     * @return
     */
    PayResponse create(OrderDTO orderDTO);
}