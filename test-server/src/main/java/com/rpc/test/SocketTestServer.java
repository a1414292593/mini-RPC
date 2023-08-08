package com.rpc.test;

import com.rpc.annotation.ServiceScan;
import com.rpc.serializer.CommonSerializer;
import com.rpc.transport.RpcServer;
import com.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author ziyang
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
