package com.kushal.learning.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.kushal.learning.messenger.model.Message;
import com.kushal.learning.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap();
	private static Map<Long, Profile> profiles = new HashMap();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfile(){
		return profiles;
	}
}

