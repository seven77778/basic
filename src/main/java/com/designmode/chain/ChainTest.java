package com.designmode.chain;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * Created by lsh on 2018/11/28 16:32
 *
 * definition：
 */
public class ChainTest implements FilterChain {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {

    }
}
