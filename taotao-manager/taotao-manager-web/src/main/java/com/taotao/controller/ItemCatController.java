package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.service.ItemCatService;

@Controller
@RequestMapping(value="/item/cat")
public class ItemCatController {

	@Autowired
	ItemCatService itemCatService;
	
	@RequestMapping(value="/list")
	@ResponseBody
	public List<EUTreeNode> getItemCatList(@RequestParam(value="id",defaultValue="0") long parentId){
		
		List<EUTreeNode> itemCatList = itemCatService.getItemCatList(parentId);
		
		
		return itemCatList;
	}
	
	
}
