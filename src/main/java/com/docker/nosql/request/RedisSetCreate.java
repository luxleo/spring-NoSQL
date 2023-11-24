package com.docker.nosql.request;

import lombok.Data;

@Data
public class RedisSetCreate {
    private Object key;
    private Object value;
}
