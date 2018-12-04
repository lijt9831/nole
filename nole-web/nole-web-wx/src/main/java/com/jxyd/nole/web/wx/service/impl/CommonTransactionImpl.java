package com.jxyd.nole.web.wx.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxyd.nole.jpa.mysql.alpha.raw.mapper.Nole205FavorateLabelMapper;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole205FavorateLabel;
import com.jxyd.nole.jpa.mysql.alpha.raw.model.Nole205FavorateLabelExample;
import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsReq;
import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsReq.Add;
import com.jxyd.nole.web.wx.controller.CommonController.ConfigMyFavorsReq.Del;
import com.jxyd.nole.web.wx.service.CommonTransaction;

/** 
 * 说明：00通用 事务实现
 * 创建人：zxg
 * 创建时间：2018
 */
@Service
@Transactional
public class CommonTransactionImpl implements CommonTransaction {

	@Autowired
	private Nole205FavorateLabelMapper nole205FavorateLabelMapper;
	
	@Override
	public void configMyFavors(ConfigMyFavorsReq configMyFavorsReq) {
		List<Del> delList = configMyFavorsReq.getDelList();
		if (delList != null && !delList.isEmpty()) {
			for (Del del : delList) {
				if (del != null && del.getId() != null) {
					Nole205FavorateLabelExample example = new Nole205FavorateLabelExample();
					example.createCriteria().andNole300IdEqualTo(del.getId());
					nole205FavorateLabelMapper.deleteByExample(example);
				}
			}
		}
		List<Add> addList = configMyFavorsReq.getAddList();
		if (addList != null && !addList.isEmpty()) {
			Long userId = (Long) SecurityUtils.getSubject().getSession().getAttribute("userId");
			for (Add add : addList) {
				if (add != null && add.getId() != null) {
					Nole205FavorateLabel nole205FavorateLabel = new Nole205FavorateLabel();
					// nole205FavorateLabel.setId(id);
					nole205FavorateLabel.setNole200Id(userId);
					nole205FavorateLabel.setNole300Id(add.getId());
					nole205FavorateLabel.setGmtCreate(new Date());
					nole205FavorateLabelMapper.insert(nole205FavorateLabel);
					Long id = nole205FavorateLabel.getId();
					System.out.println(id);
				}
			}
		}

	}

}
