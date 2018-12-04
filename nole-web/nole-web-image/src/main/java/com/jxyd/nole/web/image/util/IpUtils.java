package com.jxyd.nole.web.image.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

public class IpUtils {

	public static String getIpAddr() {
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		if (req == null) {
			return null;
		}
		String ip = req.getHeader("X-Forwarded-For");
		if (isUnknown(ip)) {
			ip = req.getHeader("Proxy-Client-IP");
		}
		if (isUnknown(ip)) {
			ip = req.getHeader("WL-Proxy-Client-IP");
		}
		if (isUnknown(ip)) {
			ip = req.getHeader("HTTP_CLIENT_IP");
		}
		if (isUnknown(ip)) {
			ip = req.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (isUnknown(ip)) {
			ip = req.getRemoteAddr();
		}
		if (ip.contains(",")) {
			ip = ip.substring(0, ip.indexOf(","));
		}
		if ("127.0.0.1".equals(ip) || "0:0:0:0:0:0:0:1".equals(ip)) {
			try {
				ip = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException ignore) {
			}
		}
		return ip;
	}

	private static boolean isUnknown(String ip) {
		return ip == null || ip.trim().length() == 0 || ip.equalsIgnoreCase("unknown");
	}
}
