package singleton;

/**
 * 유일 객체
 */
public class Singleton {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        // 동일 객체 확인
        System.out.println(aClient.equals(bClient));
    }
}
