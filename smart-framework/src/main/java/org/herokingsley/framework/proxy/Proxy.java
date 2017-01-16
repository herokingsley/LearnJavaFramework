package org.herokingsley.framework.proxy;

/**
 *  代理接口
 * @author Administrator
 * @date 2016/12/10
 */
public interface Proxy {

    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
