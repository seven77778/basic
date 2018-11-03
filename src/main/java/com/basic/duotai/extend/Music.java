package com.basic.duotai.extend;

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
     * 向上转型不要强制转型。向上转型后父类的引用所指向的属性是父类的属性
     * 如果子类重写了父类的方法，那么父类引用指向的或者调用的方法是子类的方法,这个叫动态绑定
    * */
    static void tune(Instrument i){
        i.play(Node.C_SHARP);
    }

    private transient long fastTime;

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
        Instrument instrument = new Wind();
        tune(instrument);
    }


    public Music() {
        this(System.currentTimeMillis());
        System.out.println("void ");
    }

    public Music(long time) {
        fastTime = time;
        System.out.println("with ");
    }

    /**
     * data 方法重写了toString...
     * */
    @Override
    public String toString(){
        return "music";
    }
}
