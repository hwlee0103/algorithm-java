package com.company;

/**
 * 에라토스테네스의 체 (Eratosthenes Sieve)
 * 소수 구하기
 */
public class EratosthenesSieve {
    public static void main(String[] args) {
        // boolean 배열값은 default false 생성
        // 배열의 시작은 0부터 이므로 0~50 까지 소수 판별을 위해 0~50 생성
        boolean prime[] = new boolean[51];

        // 자연수 n
        int n = 50;
        // 소수는 false
        // 0과 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        // 2부터 ~ n 까지
        for(int i=2; i*i<=n; i++){
            // prime[i] == false 소수 일 경우
            if(!prime[i]){
                // prime[i] 의 배수 prime[j] 소수 아님 표시(합성수)
                for(int j=i*i; j<=n; j+=i){
                    prime[j] = true;
                }
            }
        }

        // 출력
        for(int i=1; i <= n; i++){
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
