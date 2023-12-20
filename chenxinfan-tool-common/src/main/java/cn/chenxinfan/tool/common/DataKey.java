package cn.chenxinfan.tool.common;

import java.util.Objects;

/**
 * @author chenxinfan
 * @site www.chenxinfan.cn
 * @date 2023/12/19 21:24
 */
public class DataKey<T> {

    private String key;

    public DataKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof DataKey) {
            DataKey<?> dataKey = (DataKey<?>) o;
            return Objects.equals(this.key, dataKey.key);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
