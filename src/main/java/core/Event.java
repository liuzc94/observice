package core;

import java.lang.reflect.Method;

public class Event {
    //事件源
    private Object source;
    //通知目标
    private Object tartget;
    //回调
    private Method callback;
    //触发
    private Object trigger;
    //调用事件
    private long time;

    public Event(Object tartget, Method callback) {
        this.tartget = tartget;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Object getTarget() {
        return tartget;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Event setTartget(String tartget) {
        this.tartget = tartget;
        return this;

    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public Object getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", tartget=" + tartget +
                ", callback=" + callback +
                ", trigger=" + trigger +
                ", time=" + time +
                '}';
    }
}
