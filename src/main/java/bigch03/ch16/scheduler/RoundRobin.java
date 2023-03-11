package bigch03.ch16.scheduler;

/**
 * 모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.
 */
public class RoundRobin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분합니다.");
    }
}
