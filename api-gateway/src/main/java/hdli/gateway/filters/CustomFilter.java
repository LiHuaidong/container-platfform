package hdli.gateway.filters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * <h3>自定义filter</h3>
 * <p></p>
 *
 * @author : Hendrixli
 * @date : 2025-09-18 16:31
 **/
@Configuration
public class CustomFilter implements GlobalFilter, Ordered {

    @Value("${test.test}")
    public String testTest;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return null;
    }

    @Override
    public int getOrder() {
        System.out.println(testTest);
        return 0;
    }
}
