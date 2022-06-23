package proxy;

import proxy.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 대리인, 무엇인가를 대신하여 처리
 */
public class Proxy {
    public static void main(String[] args) {
        String url = "www.naver.com";
        Browser browser = new Browser(url);
        // 매번 새로생성, 캐싱기능 없음
        browser.show();
        browser.show();

        // 캐싱 기능
        BrowserProxy browserProxy = new BrowserProxy(url);
        browserProxy.show();
        browserProxy.show();

        // aop before/after
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        AopBrowser aopBrowser = new AopBrowser(url
        ,()->{
            System.out.println("before");
            start.set(System.currentTimeMillis());
        }
        ,()->{
            long now = System.currentTimeMillis();
            System.out.println("after");
            end.set(now - start.get());
        }
        );
        // 신규 브라우저 생성, 랜딩 1.5초 딜레이
        aopBrowser.show();
        System.out.println("loading start : " + start.get());
        System.out.println("loading end : " + end.get());

        // 캐싱, 랜딩 0초
        aopBrowser.show();
        System.out.println("loading start : " + start.get());
        System.out.println("loading end : " + end.get());
    }
}
