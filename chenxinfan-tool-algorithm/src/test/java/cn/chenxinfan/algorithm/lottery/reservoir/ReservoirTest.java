package cn.chenxinfan.algorithm.lottery.reservoir;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 蓄水池算法测试用例
 *
 * @author chenxinfan
 * @site www.chenxinfan.cn
 * @date 2024/3/22 22:31
 */
public class ReservoirTest {

    @Test
    public void test_1() {
        /*
        场景：
        100个人参与可中奖10人的活动，参与10000论，那么每个人可以获奖的次数就大概是1000次左右
         */
        //参与人数
        int personNum = 100;
        //可中奖认数
        int awardNum = 10;
        //活动次数
        int activityCount = 10000;
        List<Integer> personList = new ArrayList<>(personNum);
        for (int i = 0; i < personNum; i++) {
            personList.add(0);//将所有人的获奖次数初始化为0
        }
        for (int i = 0; i < activityCount; i++) {
            Reservoir<Integer> reservoir = new Reservoir<>(awardNum);
            for (int j = 0; j < personNum; j++) {
                //编号为j的参与活动
                reservoir.participate(j);
            }
            //第i轮活动参与结束
            reservoir.getList().stream().forEach(val -> {
                personList.set(val, personList.get(val) + 1);
            });
        }
        System.out.println(personList);
    }

}
