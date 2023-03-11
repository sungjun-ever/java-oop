package bigch03.ch16.scheduler;

/**
 * 고객의 등급에 따라 등급이 높은 고객은 업무능력이 우수한 상담원에게 배분합니다.
 */
public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("우선 순위가 높은 고객을 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("숙련도가 높은 상담원에게 배정합니다.");
    }
}
