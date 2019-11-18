package com.catdog.web.pxy;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class Proxy {
	public int parseInt(String param) {
		Function<String, Integer> f =  Integer :: parseInt;
		return f.apply(param);
	}
	public int random(int a, int b) {
		BiFunction<Integer,Integer , Integer> bf = (t,u)-> (int)(Math.random()*(u-t))+t;
		bf.apply(a, b);
		return bf.apply(a, b);
	}
	public int[] intArray(int size) {
		Function<Integer, int[]> f = t-> new int[t];
		f.apply(size);
		return f.apply(size);
	}
	public boolean equals(String x,String y) {
		BiPredicate<String, String> p = String :: equals;
		return p.test(x, y);
	}
	public String toString(Object param) {
		Function<Object, String> f = s->String.valueOf(s);
		f.apply(param);
		return f.apply(param);
	}
}
