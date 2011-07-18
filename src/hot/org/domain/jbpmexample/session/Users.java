package org.domain.jbpmexample.session;

import java.util.HashMap;
import java.util.Map;

public class Users {
	
	private static Map<String, String> usersMap = new HashMap<String, String>();
	
	static {
		usersMap.put("porcasolta", "consultant");
		usersMap.put("pancaloca", "consultant");
		usersMap.put("lagoaseca", "manager");
		usersMap.put("quasenada", "manager");
		usersMap.put("rasgabucho", "architect");
		usersMap.put("poucastrancas", "architect");
		usersMap.put("tripaseca", "vendor");
		usersMap.put("rachacuca", "vendor");
	}
	
	public static String getRole(String username) {
		return usersMap.get(username);
	}

}
