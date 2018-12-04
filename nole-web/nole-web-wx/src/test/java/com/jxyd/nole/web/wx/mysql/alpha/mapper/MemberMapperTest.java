package com.jxyd.nole.web.wx.mysql.alpha.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jxyd.nole.web.wx.dto.Msg;

@ContextConfiguration(locations = {"classpath*:spring/root/public_*.xml","classpath:spring/root/private_*"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class MemberMapperTest {

	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testSelectMsgs() {
		List<Msg> msgs = memberMapper.selectMsgs(1L);
		System.out.println(msgs);
	}

}
