package com.catdog.web.pxy;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bugs")
public class BugsProxy extends Proxy{
	
	
	public Map<String,String> crawling(String url) {
		System.out.println("넘어온 URL \n"+url);
		HashMap<String, String> map = null;
		map =  new HashMap<>();
		try {
			Document rawData = Jsoup.connect(url).timeout(10*1000).get();
            Elements ranking = rawData.select("div[class=ranking]");
            Elements title = rawData.select("p[class=title]");
            Elements artist = rawData.select("p[class=artist]");
            for(int i = 0; i <20; i++) {
                map.put("ranking", ranking.get(i).text());
                map.put("title", title.get(i).text());
                map.put("artist", artist.get(i).text());
            }
            System.out.println("artist : "+artist.get(4).text());
          
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		return map;
	}
}
