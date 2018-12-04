package com.jxyd.nole.mgr.shiro.section;


import java.util.Set;

import org.apache.shiro.config.Ini;
import org.apache.shiro.config.Ini.Section;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.jxyd.nole.mgr.shiro.mapper.JdbcRealmMapper;


public class SectionFactoryBean implements FactoryBean<Ini.Section> {

	@Autowired
	private JdbcRealmMapper jdbcRealmMapper;

	private Ini.Section section;

	@Override
	public Section getObject() throws Exception {
		this.init();
		String pattern = "authc,perms[%s]";
		Set<String> permissions = jdbcRealmMapper.selectSPerms();
		for (String permission : permissions) {
			String url = permission.startsWith("/") ? permission : "/" + permission;
			section.put(url, String.format(pattern, permission));
		}
		// 未记录在册的URL 一律不准使用
		section.put("/**", "authc");
		return section;
	}

	@Override
	public Class<?> getObjectType() {
		return getClass();
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	
	private String anonUrls;
	private String authcUrls;
	
	public void setAnonUrls(String anonUrls) {
		this.anonUrls = anonUrls;
	}

	public void setAuthcUrls(String authcUrls) {
		this.authcUrls = authcUrls;
	}

	public void init() {
		StringBuffer sb = new StringBuffer();
		sb.append("[urls]\n");
		if(anonUrls != null) {
			String[] anonUrlArray = anonUrls.split(",");
			for (String anonUrl : anonUrlArray) {
				sb.append(anonUrl.trim()).append(" = anon\n");
			}
		}
		if(authcUrls != null) {
			String[] authcUrlArray = authcUrls.split(",");
			for (String authcUrl : authcUrlArray) {
				sb.append(authcUrl.trim()).append(" = authc\n");
			}
		}
		Ini ini = new Ini();
		ini.load(sb.toString());
		Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
		if (CollectionUtils.isEmpty(section)) {
			// no urls section. Since this _is_ a urls chain definition
			// property, just assume the
			// default section contains only the definitions:
			section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
		}
		this.section = section;
	}

}
