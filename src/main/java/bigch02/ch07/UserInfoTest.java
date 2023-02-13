package bigch02.ch07;

public class UserInfoTest {
    public static void main(String[] args){
        UserInfo userLim = new UserInfo();
        userLim.userName = "임성준";
        userLim.userId = "zkfmak16";
        userLim.userPassWord = "1234";
        System.out.println(userLim.showUserInfo());

        UserInfo userInfo = new UserInfo("zkfmak16", "1234", "임성준");
        System.out.println(userInfo.showUserInfo());
    }
}
