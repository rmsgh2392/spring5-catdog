package com.catdog.web.pxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.catdog.web.enums.Path;

@Component("crawler")
public class CrawlingProxy extends Proxy{
	@Autowired BugsProxy bugs;
//	@Autowired CGVProxy cgv;
//	@Autowired DictionProxy dic; 
//	@Autowired Trunk<String> trunk;
	public Map<String,String> choose(Map<?,?> paramMap){
		switch (toString(paramMap.get("site"))) {
		case "BUGS":
			return bugs.crawling(Path.BUGS.toString());
//			break;
/*		case "CGV" :
			
			return cgv.crawling(Path.CGV.toString());
			break;*/
/*		case "네이버 오늘의 단어":
			System.out.println(Path.DICTION.toString());
			box = dic.crawling(Path.DICTION.toString());
			break;*/
			default :
			break;
//				crawling("http://"+paramMap.get("site")+"/");
		}
		return  bugs.crawling(Path.BUGS.toString());
	}
	/*public Box<String> crawling(String url) {
		try {
			if(url.equals("https://music.bugs.co.kr/chart")) {
				ArrayList<String> box = new ArrayList<>();
				Document rawData = Jsoup.connect(url).timeout(10*1000).get();
				Elements ranking = rawData.select("div[class=ranking]");
				Elements title = rawData.select("p[class=title]");
				Elements artist = rawData.select("p[class=artist]");
				for(Element e : ranking) {
					box.add(e.text() + ":::::");
				}
				for(Element e : title) {
					box.add(e.text() + ":::::");
				}
				for(Element e : artist) {
					box.add(e.text() + ":::::");
				}
				System.out.println(box);
			}else if(url.equals("http://www.cgv.co.kr/movies/?lt=3")) {
				Document rawData = Jsoup.connect(url).timeout(10*1000).get();
				Elements ranking = rawData.select("strong[class=rank]");
				Elements title = rawData.select("strong[class=title]");
				for(Element e : ranking) {
					box.add(e.text() + ":::::");
				}
				for(Element e : title) {
					box.add(e.text() + ":::::");
				}
				System.out.println(box);
			}else if(url.equals("https://endic.naver.com/?sLn=kr")) {
				Document rawData = Jsoup.connect(url).timeout(10*1000).get();
				Elements word = rawData.select("a[class=word_link]");
				Elements mean = rawData.select("div[class=txt_trans]");
				for(Element e : word) {
					box.add(e.text() + ":::::");
				}
				for(Element e : mean) {
					box.add(e.text() + ":::::");
				}
			}
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		return box;
	}*/
}
