package com.grasswort.grasswortshardjdbc.shard;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;

public class HintShardingKeyAlgorithm implements HintShardingAlgorithm {
    @Override
    public Collection<String> doSharding(Collection collection, HintShardingValue hintShardingValue) {
        // 这里collection根据我测试的经验它代表的实际节点的集合，hintShardingValue则是分片键
        Collection hintValues = hintShardingValue.getValues();
        Collection<String> shards = new ArrayList<>(hintValues.size());
        for (Object hintValue : hintValues) {
            String val = String.valueOf(hintValue);
            for (Object shardObj : collection) {
                String shard = String.valueOf(shardObj);
                if (shard.equals(val)) {
                    shards.add(shard);
                }
            }
        }
        return shards;
    }
}
