import core.EventLisenter;

public class Subject extends EventLisenter {

    //通常彩虹动态代理来实现监控，避免代码侵入
    public void add(){
        System.out.println("调用添加的方法");
        trigger(subjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用移除方法");
        trigger(subjectEventType.ON_REMOVE);
    }
}
