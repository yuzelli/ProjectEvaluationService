package biz;

import java.util.List;

import bean.UserInfo;

public interface UserBiz {
	public UserInfo registerUserInfo(UserInfo user)throws Exception;

	public boolean deleteUserInfoByID(int userID) throws Exception;

	public UserInfo updateUserInfoByID(int userID,UserInfo user)throws Exception;
	
	public List<UserInfo> findAllUserInfo() throws Exception;
	
	public UserInfo findUserInfoByID(int userID)throws Exception;

	public UserInfo LoginUserInfo(String phone,String passWord)throws Exception;
	
	public boolean VerificationUserPhone(String phone) throws Exception;

}
