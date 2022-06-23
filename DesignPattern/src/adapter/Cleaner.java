package adapter;

public class Cleaner implements Electronic220w {
    @Override
    public void connect() {
        System.out.println("청소기 220w on");
    }
}
