package InterfacesExample;

class Phone{
    public void call(){
        System.out.println("Calling");
    }
    public void sms(){
        System.out.println("sending sms");
    }
}

interface Icamera{
    void capture();
    void record();
}

interface  ImusicPlayer{
    void playSong();
    void pauseSong();
}

class Smartphone extends Phone implements Icamera, ImusicPlayer{
    @Override
    public void capture() {
        System.out.println("Capturing");
    }

    @Override
    public void record() {
        System.out.println("recodring video");
    }

    public void playSong(){
        System.out.println("Playing song");
    }

    @Override
    public void pauseSong() {
        System.out.println("pausing song");
    }
}
public class InterfaceExample1 {

    public static void main(String args[]){
        Smartphone s=new Smartphone();
        Icamera camera=s;
        camera.capture();
        camera.record();
    }
}
