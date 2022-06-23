package adapter;

public class AirConditional implements Electronic220w {
    @Override
    public void connect() {
        System.out.println("에어컨 220w on");
    }
}
