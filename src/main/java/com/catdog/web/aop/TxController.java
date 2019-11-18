package com.catdog.web.aop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catdog.web.pxy.Box;
import com.catdog.web.pxy.BugsProxy;
import com.catdog.web.pxy.CrawlingProxy;
import com.catdog.web.pxy.PageProxy;
import com.catdog.web.pxy.Proxy;
import com.catdog.web.pxy.Trunk;

@RestController
@RequestMapping("/tx")
public class TxController {
	@Autowired Proxy proxy;
	@Autowired PageProxy pager;
	@Autowired TxService txService;
	@Autowired Trunk<String> trunk;
	@Autowired CrawlingProxy crawler;
	@Autowired BugsProxy bugs;
	@Autowired Box<HashMap<String,String>> box;
	
	@GetMapping("/crawling/{site}")
	public Map<String,String> bringbugs(@PathVariable String site) {
		System.out.println("넘어온 " +site);
		trunk.put(Arrays.asList("site"), Arrays.asList(site));
//        txService.crawling(trunk.get());
		System.out.println(txService.crawling(trunk.get()));
		return txService.crawling(trunk.get());
		
	}
}
