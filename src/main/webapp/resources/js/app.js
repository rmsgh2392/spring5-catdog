"use strict"
var app =(()=>{
	let _,js,css,img,catdog_js
	let init =()=>{
		_ = $.ctx()
		js = $.js()
		css = $.css()
		img = $.img()
		catdog_js = js +'/cmm/catdog.js'
		alert('ctx :'+_)
	}
	let run =x=>{
		$.getScript(x+'/resources/js/cmm/router.js',()=>{
			$.extend(new Session(x))
			onCreate()
		})
	}
	let onCreate =()=>{
		init()
		$.when(
		   $.getScript(catdog_js)		
		)
		.done(()=>{
			catdog.onCreate()
		})
		.fail(()=>{alert('화면 불러오기 실패')})
		
	
	}
	return{run}
})()