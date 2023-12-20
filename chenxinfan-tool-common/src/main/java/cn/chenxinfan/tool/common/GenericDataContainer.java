package cn.chenxinfan.tool.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用数据容器
 *
 * @author chenxinfan
 * @site www.chenxinfan.cn
 * @date 2023/12/19 21:31
 */
public class GenericDataContainer {

    private Map<DataKey<?>, Object> map;

    public GenericDataContainer() {
        map = new HashMap<>();
    }

    public GenericDataContainer(Map<DataKey<?>, Object> map) {
        this.map = map;
    }

    public <T> void put(DataKey<T> key, T value) {
        map.put(key, value);
    }

    @SuppressWarnings("uncheck")
    public <T> T get(DataKey<T> key) {
        return (T) map.get(key);
    }
}
