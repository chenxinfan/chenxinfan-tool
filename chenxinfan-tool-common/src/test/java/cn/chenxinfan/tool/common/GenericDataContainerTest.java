package cn.chenxinfan.tool.common;

import org.junit.Test;

/**
 * @author chenxinfan
 * @site www.chenxinfan.cn
 * @date 2023/12/19 21:36
 */
public class GenericDataContainerTest {

    @Test
    public void test_1() {
        GenericDataContainer container = new GenericDataContainer();
        DataKey<String> string = new DataKey<>("222");
        container.put(string, "22");
        container.put(string, "33");
        System.out.println(container.get(string));
        DataKey<Long> num = new DataKey<>("long");
        container.put(num, 100L);
        System.out.println(container.get(num));
    }
}
