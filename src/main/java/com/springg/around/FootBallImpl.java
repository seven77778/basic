package com.springg.around;

/**
 * Created by lsh on 2018/11/13 17:10.
 *
 * @author lsh
 * @date 2018/11/13
 *
 * 单例模式
 *
 */
public class FootBallImpl implements FootBallFactory {



    @Override
    public FootBall getBall() {
        return new FootBall();
    }

    @Override
    public void method2() {

    }
}
