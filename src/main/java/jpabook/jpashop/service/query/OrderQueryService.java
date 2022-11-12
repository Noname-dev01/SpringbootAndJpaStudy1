package jpabook.jpashop.service.query;

import jpabook.jpashop.api.OrderSimpleApiController;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class OrderQueryService {

//    private final OrderRepository orderRepository;
    //OSIV를 껐을 경우 해결하는 방법이다.
    //OrderDto를 package jpabook.jpashop.service.query로 가져온다(이부분은 다시 코드를 돌려놔야되서 안함 OSIV와 성능 최적화 강의 참고)
//    public List<OrderDto> ordersV3(){
//        List<Order> orders = orderRepository.findAllWithMemberDelivery();
//        List<OrderDto> result = orders.stream()
//                .map(o -> new OrderDto(o))
//                .collect(toList());
//        return result;
//    }
}
