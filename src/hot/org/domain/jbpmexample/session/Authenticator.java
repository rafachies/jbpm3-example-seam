package org.domain.jbpmexample.session;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.bpm.Actor;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

@Name("authenticator")
public class Authenticator {
	
	@Logger private Log log;
	
	@In Actor actor;
	@In Identity identity;
	@In Credentials credentials;

	public boolean authenticate() {
		log.info("authenticating {0}", credentials.getUsername());
		String role = Users.getRole(credentials.getUsername());
		if (role == null) {
			return false;
		}
		identity.addRole(role);
		actor.setId(credentials.getUsername());
		actor.getGroupActorIds().add(role);
		return true;
	}

}
