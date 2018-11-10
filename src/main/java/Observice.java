import core.Event;

import java.util.HashMap;
import java.util.Map;

public class Observice {

    public void advice(Event event){
        System.out.println("触发回调打印日志----------------------------" + event.toString());
    }
}
