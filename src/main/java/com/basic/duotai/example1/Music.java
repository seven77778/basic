package com.basic.duotai.example1;

/**
 * Created by lsh on 2018/10/27.
 *
 * @author lsh
 * @date 2018/10/27
 */
public class Music {
    /**
    * tune()方法接收一个 Instrument 引用，同时也接收任何导出自 Instrument 的类
     * 从 Wind 向上转型到 Instrument 可能会缩小接口，但是不会比 Instrument 的全部接口更窄
    * */
    static void tune(Instrument i){
        i.play(Node.C_SHARP);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
        Instrument instrument = new Wind();
        tune(instrument);
    }

}
