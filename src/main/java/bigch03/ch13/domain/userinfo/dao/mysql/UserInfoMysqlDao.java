package bigch03.ch13.domain.userinfo.dao.mysql;

import bigch03.ch13.domain.userinfo.UserInfo;
import bigch03.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Mysql DB userID = " + userInfo.getUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Mysql DB userID = " + userInfo.getUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete FROM Mysql DB userID = " + userInfo.getUserID());
    }
}
