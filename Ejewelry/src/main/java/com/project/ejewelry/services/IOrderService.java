package com.project.ejewelry.services;

import com.project.ejewelry.dtos.OrderDTO;
import com.project.ejewelry.exceptions.DataNotFoundException;
import com.project.ejewelry.models.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
}
