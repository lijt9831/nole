package com.jxyd.nole.bas.log;

import org.junit.Test;

public class LogTest {
	
	private static final Log LOG = LogFactory.getLog(LogTest.class);

	@Test
	public void testTraceString() {
		LOG.trace("This is trace log .");
	}

	@Test
	public void testDebugString() {
		LOG.debug("This is debug log .");
	}

	@Test
	public void testInfoString() {
		LOG.info("This is info log .");
	}

	@Test
	public void testWarnString() {
		LOG.warn("This is warn log .");
	}

	@Test
	public void testErrorString() {
		LOG.error("This is error log .");
	}

	@Test
	public void testElapseString() {
		LOG.elapseStart("111");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOG.elapseEnd("Elapse:","111");
	}


}
