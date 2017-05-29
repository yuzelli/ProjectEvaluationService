package bizImpl;

import java.util.List;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import bean.UserInfo;
import biz.UserBiz;

public class UserBizImpl implements UserBiz{
	UserDao userDao = new UserDaoImpl();

	@Override
	public UserInfo registerUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.registerUserInfo(user);
	}

	@Override
	public boolean deleteUserInfoByID(int userID) throws Exception {
		// TODO Auto-generated method stub
		return userDao.deleteUserInfoByID(userID);
	}

	@Override
	public UserInfo updateUserInfoByID(int userID, UserInfo user)
			throws Exception {
		// TODO Auto-generated method stub
		return userDao.updateUserInfoByID(userID, user);
	}

	@Override
	public List<UserInfo> findAllUserInfo() throws Exception {
		// TODO Auto-generated method stub
		return userDao.findAllUserInfo();
	}

	@Override
	public UserInfo findUserInfoByID(int userID) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findUserInfoByID(userID);
	}

	@Override
	public UserInfo LoginUserInfo(String phone, String passWord)
			throws Exception {
		// TODO Auto-generated method stub
		return userDao.LoginUserInfo(phone, passWord);
	}

	@Override
	public boolean VerificationUserPhone(String phone) throws Exception {
		// TODO Auto-generated method stub
		return userDao.VerificationUserPhone(phone);
	}

}
