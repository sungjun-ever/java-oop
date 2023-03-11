package bigch03.ch13.userinfo.web;

import bigch03.ch13.domain.userinfo.UserInfo;
import bigch03.ch13.domain.userinfo.dao.UserInfoDao;
import bigch03.ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import bigch03.ch13.domain.userinfo.dao.mysql.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("zkfmak16");
        userInfo.setUserName("임성준");
        userInfo.setPassword("1234");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else {
            System.out.println("db error");
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
