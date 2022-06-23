package adapter;

public class SocketAdapter implements Electronic110w {
    private Electronic220w electronic220w;

    public SocketAdapter(Electronic220w electronic220w){
        this.electronic220w = electronic220w;
    }

    @Override
    public void powerOn() {
        electronic220w.connect();
    }
}
