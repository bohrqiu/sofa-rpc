/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.common.config;

import com.alipay.sofa.common.config.ConfigKey;

import static com.alipay.sofa.rpc.common.SofaOptions.CONFIG_SERIALIZE_BLACKLIST_OVERRIDE;
import static com.alipay.sofa.rpc.common.SofaOptions.CONFIG_SERIALIZE_WHITELIST_OVERRIDE;

/**
 * @author zhaowang
 * @version : RpcConfigKeys.java, v 0.1 2020年12月14日 9:56 下午 zhaowang Exp $
 */
public class RpcConfigKeys {

    // mesh
    public static ConfigKey<Integer>        MESH_HTTP_CONNECTION_TIMEOUT        = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.mesh.httpConnectionTimeout",
                                                                                        3000,
                                                                                        false,
                                                                                        "Connection timeout of MeshApiClient.",
                                                                                        new String[] { "mesh_http_connect_timeout" });
    public static ConfigKey<Integer>        MESH_HTTP_READ_TIMEOUT              = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.mesh.httpReadTimeout",
                                                                                        15000,
                                                                                        false,
                                                                                        "Read timeout of MeshApiClient.",
                                                                                        new String[] { "mesh_http_read_timeout" });

    //tracer
    public static ConfigKey<String>         TRACER_EXPOSE_TYPE                  = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.tracer.exposeType",
                                                                                        "DISK",
                                                                                        false,
                                                                                        "Report type of tracer. May be 'DISK' or 'MEMORY",
                                                                                        new String[] { "reporter_type" });

    // remoting
    // http
    public static ConfigKey<Boolean>        REMOTING_HTTP_SSL_ENABLE            = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.remoting.http.enableSsl",
                                                                                        false,
                                                                                        false,
                                                                                        "If enable ssl in http remoting call.",
                                                                                        new String[] { "ssl" });
    public static ConfigKey<String>         CERTIFICATE_PATH                    = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.remoting.http.certificatePath",
                                                                                        "",
                                                                                        false,
                                                                                        "Path of certificate.",
                                                                                        new String[] { "certificate_path" });
    public static ConfigKey<String>         PRIVATE_KEY_PATH                    = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.remoting.http.privateKeyPath",
                                                                                        "",
                                                                                        false,
                                                                                        "Path of pricate key.",
                                                                                        new String[] { "private_key_path" });

    // triple
    public static ConfigKey<Boolean>        TRIPLE_EXPOSE_OLD_UNIQUE_ID_SERVICE = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.remoting.http.enableSsl",
                                                                                        false,
                                                                                        false,
                                                                                        "If expose old uniqueId mode. In old mode ,uniqueId will not exist in path; while in new mode, uniqueId will be added"
                                                                                            + " to path.",
                                                                                        new String[] { "triple_expose_old_unique_id_service" });

    // rpc generic serializer
    public static ConfigKey<Boolean>        GENERIC_THROW_EXCEPTION             = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.generic.throw.exception",
                                                                                        false,
                                                                                        false,
                                                                                        "when occur business exception whether rpc callback invoke type throw exception.",
                                                                                        new String[] { "sofa_rpc_generic_throw_exception" });
    public static final ConfigKey<String[]> GENERIC_THROWABLE_FIELDS            = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.generic.exception.fields",
                                                                                        new String[] {
                                                                                        "cause",
                                                                                        "detailMessage",
                                                                                        "stackTrace",
                                                                                        "suppressedExceptions" },
                                                                                        false,
                                                                                        "judge the generic object exception fields.",
                                                                                        new String[] { "sofa_rpc_generic_exception_fields" });

    public static final ConfigKey<String>   SERIALIZE_BLACKLIST_OVERRIDE        = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.serialize.blacklist.override",
                                                                                        "",
                                                                                        false,
                                                                                        "Additional serialization blacklist.",
                                                                                        new String[] { CONFIG_SERIALIZE_BLACKLIST_OVERRIDE });

    public static final ConfigKey<String>   SERIALIZE_WHITELIST_OVERRIDE        = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.serialize.whitelist.override",
                                                                                        "",
                                                                                        false,
                                                                                        "Additional serialization whitelist.",
                                                                                        new String[] { CONFIG_SERIALIZE_WHITELIST_OVERRIDE });

    public static final ConfigKey<String>   SERIALIZE_CHECKER_MODE              = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.codec.serialize.checkMode",
                                                                                        "STRICT",
                                                                                        true,
                                                                                        " The default filtering mode is STRICT.You can also set WARN or DISABLE",
                                                                                        new String[] { "sofa_rpc_codec_serialize_checkMode" });

    /**
     * biz thread pool type
     */
    public static ConfigKey<String>         SERVER_THREAD_POOL_TYPE             = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.server.thread.pool.type",
                                                                                        "cached",
                                                                                        false,
                                                                                        "specify biz thread pool implementation type",
                                                                                        new String[] { "sofa_rpc_server_thread_pool_type" });

    /**
     * grpc client keep alive interval
     */
    public static ConfigKey<Integer>        TRIPLE_CLIENT_KEEP_ALIVE_INTERVAL   = ConfigKey
                                                                                    .build(
                                                                                        "sofa.rpc.triple.client.keepAlive.interval",
                                                                                        0,
                                                                                        false,
                                                                                        "keep alive interval in second for triple client",
                                                                                        new String[] { "sofa_rpc_triple_client_keepAlive_interval" });

}
