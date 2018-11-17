package com.mypackage.LoginService;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mypackage.LoginDao.FriendsDao;


public class FriendsService {

	public void displayFriends(String username, PrintWriter pw) {
		FriendsDao dao = new FriendsDao();
		Map<String, List<String>> map = dao.friendsOfUsers();
		
		List<String> friends = map.get(username);
		
		
		for(int i = 0; i <= friends.size(); i ++) {
			pw.println(friends.get(i));
		}
		
	}
}
