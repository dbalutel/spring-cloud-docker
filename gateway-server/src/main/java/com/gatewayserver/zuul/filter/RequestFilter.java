package com.gatewayserver.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Log
@Component
public class RequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.warning(">> Pre Request Filter");
        return null;
    }
}
