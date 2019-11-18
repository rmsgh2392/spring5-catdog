//package com.catdog.web.test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class test {
//	
//	public static void main(String[] args) {
//		try {
//			Document rawData = Jsoup.connect("https://music.bugs.co.kr/chart").timeout(10*1000).get();
//			Elements ranking = rawData.select("div[class=ranking]");
//			Elements title = rawData.select("p[class=title]");
//			Elements artist = rawData.select("p[class=artist]");
////			Elements dog4 = rawData.select("td [class=navbox-list navbox-even]");
//			
//			
//			List<String> bug1 = new ArrayList<>();
//			List<String> bug2 = new ArrayList<>();
//			List<String> bug3 = new ArrayList<>();
//			for(Element r : ranking) {
//				bug1.add(r.text());
//			}
//			for(Element t : title) {
//				bug2 .add(t.text());
//			}
//			for(Element a : artist) {
//				bug3 .add(a.text());
//			}
//			 
//			System.out.println(bug1+",");
//			System.out.println("-----------------------------------");
//			System.out.println(bug2+",");
//			System.out.println("-----------------------------------");
//			System.out.println(bug3+",");
////			System.out.println(address2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//}
