import core.Event;

import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) {

        try{
            //观察者
            Observice observer = new Observice();
            Method method = Observice.class.getMethod("advice",new Class<?>[]{Event.class});
            //发布者
            Subject subject = new Subject();
            subject.addLisenter(subjectEventType.ON_ADD,observer,method);

            subject.add();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
