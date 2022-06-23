package adapter;

/**
 * 서로 다른 타입 연결
 */
public class Adapter {
    public static void main(String[] args) {
        // 110w
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        // 110w to 220w
        Cleaner cleaner = new Cleaner();
        Electronic110w socketAdapter = new SocketAdapter(cleaner);
        connect(socketAdapter);

        // 110w to 220w
        AirConditional airConditional = new AirConditional();
        Electronic110w airAdapter = new SocketAdapter(airConditional);
        connect(airAdapter);
    }

    public static void connect(Electronic110w electronic110w){
        electronic110w.powerOn();
    }
}
