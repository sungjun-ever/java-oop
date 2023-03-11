package bigch03.ch16.scheduler;

/**
 * 쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.
 */
public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("대기가 적은 상담원에게 배분합니다.");
    }
}
