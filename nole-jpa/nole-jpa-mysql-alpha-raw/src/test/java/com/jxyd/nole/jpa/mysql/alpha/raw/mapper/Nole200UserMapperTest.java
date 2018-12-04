package com.jxyd.nole.jpa.mysql.alpha.raw.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole200User;

@ContextConfiguration(locations = { "classpath:spring/root/private_*", "classpath*:spring/root/public_*"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Nole200UserMapperTest {

	@Autowired
	Nole200UserMapper nole200UserMapper;
	
	@Test
	public void testSelectByIdxMobile() {
		Nole200User selectByIdxMobile = nole200UserMapper.selectByIndex1("13444444444");
		System.out.println(selectByIdxMobile);
	}

	@Test
	public void testSelectByIdxOpenid() {
		Nole200User selectByIdxOpenid = nole200UserMapper.selectByIndex2("ssssss");
		System.out.println(selectByIdxOpenid);
	}

}
