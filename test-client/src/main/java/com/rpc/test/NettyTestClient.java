package com.rpc.test;

import com.rpc.api.ByeService;
import com.rpc.api.HelloObject;
import com.rpc.api.HelloService;
import com.rpc.serializer.CommonSerializer;
import com.rpc.transport.RpcClient;
import com.rpc.transport.RpcClientProxy;
import com.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 * @author ziyang
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
