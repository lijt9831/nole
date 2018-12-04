package com.jxyd.nole.mgr.shiro.realm;


import java.util.Map;
import java.util.Set;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jxyd.nole.mgr.shiro.mapper.JdbcRealmMapper;


@Component
public class JdbcRealm extends AuthorizingRealm {

	@Autowired
	private JdbcRealmMapper jdbcRealmMapper;
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String username = upToken.getUsername();
		// Null username is invalid
		if (username == null) {
			throw new AccountException("Null usernames are not allowed by this realm.");
		}
		// Get from db
		String password = null;
		String salt = null;
		Map<String, String> map = jdbcRealmMapper.selectUser(username);
		if(map != null) {
			password = map.get("password");
			salt = map.get("password_salt");
		}
		// Get no data.
		if (password == null) {
			throw new UnknownAccountException("Unknow account.");
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password.toCharArray(), getName());
		info.setCredentialsSalt(ByteSource.Util.bytes(salt));
		return info;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// null usernames are invalid
		if (principals == null) {
			throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
		}
		String username = (String) getAvailablePrincipal(principals);
		// get user's permissions from db.
		Set<String> permissions = jdbcRealmMapper.selectUPerms(username);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setStringPermissions(permissions);
		return info;
	}
	
}
