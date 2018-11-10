package core;

public class Observice {

    public void advice(Event event){
        System.out.println("触发回调打印日志----------------------------" + event.toString());
    }
}
