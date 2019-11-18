package com.catdog.web.aop;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catdog.web.pxy.Box;
import com.catdog.web.pxy.CrawlingProxy;

@Service
public class TxService {
	@Autowired CrawlingProxy crawler;
//	@Autowired Box<String> box;
	
	public Map<String,String> crawling(Map<?,?> paramMap){
		return crawler.choose(paramMap);
	}
}
