package com.rpc.transport;

import com.rpc.entity.RpcRequest;
import com.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 * @author ziyang
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
