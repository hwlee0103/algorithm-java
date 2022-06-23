package adapter;

public class HairDryer implements Electronic110w {

    @Override
    public void powerOn() {
        System.out.println("헤어드라이 110w");
    }

}
