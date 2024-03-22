package cn.chenxinfan.algorithm.lottery.reservoir;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 蓄水池算法
 *
 * @author chenxinfan
 * @site www.chenxinfan.cn
 * @date 2024/3/22 22:13
 */
@Data
@NoArgsConstructor
public class Reservoir<T> {

    /**
     * 终奖个数
     */
    private int num;

    /**
     * 参与活动认数
     */
    private int count;

    /**
     * 获取名单
     */
    private List<T> list;

    /**
     * 随机数
     */
    private Random random;

    public Reservoir(int num) {
        this.num = num;
        this.list = new ArrayList<>(num);
        this.random = new Random();
    }

    /**
     * 增加参加活动认数得总数
     */
    private void incrCount() {
        this.count = this.count + 1;
    }

    /**
     * 参与活动
     */
    public void participate(T t) {
        if (getCount() < getNum()) {
            //小于获奖总人数，直接放入获奖名单
            getList().add(t);
        } else {
            //获奖池已满，可能需要替换人员
            //得到随机点 左闭右开
            int index = random.nextInt(getCount() + 1);
            if (index < num) {
                //需要替换
                getList().set(index, t);
            }
        }
        //参与活动认数+1
        incrCount();
    }
}
