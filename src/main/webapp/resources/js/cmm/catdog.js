"use strict"
var catdog = catdog || {}
catdog =(()=>{
	let _,js,img,css,main_vue_js
	let init=()=>{
		_ = $.ctx()
		js = $.js()
		css =$.css()
		img = $.img()
		main_vue_js = js+'/vue/main_vue.js'
	}
	let onCreate =()=>{
		init()
		$.when($.getScript(main_vue_js))
		.done(()=>{
			setContentView()
		})
		.fail(()=>{alert('화면 불러오기 실패')})
	}
	let setContentView=()=>{
		$('body').html(main_vue.main_page({css : $.css()}))
		$('<button>',{
			text : '벅스차트',
			href : '#'
		})
		.addClass('btn btn-info btn-circle btn-xl')
		.appendTo('p[class="card-text1"]')
		.click(()=>{
			alert('벅스차트 ㄱㄱ')
			
			$.getJSON(_+'/tx/crawling/'+"BUGS",d=>{
				let i = 0
				let artist
				for(;i<10;i++){
					artist =d.artist
				}
				alert(d.ranking7)
				$('<textarea>',{
					text : artist
				})
				.appendTo('td#td1').css({'display':'block','margin-top': '0px','margin-bottom': '0px','height': '500px','width': '100%'})
			})
			bugsCrawling({css : $.css()})
		})
		$('<button>',{
			text : 'cgv',
			href : '#'
		})
		.addClass('btn btn-warning btn-circle btn-xl')
		.appendTo('p[class="card-text2"]')
		.click(()=>{
			cgvCrawling({css : $.css()})
		})
		$('<button>',{
			text : 'naver',
			href : '#'
		})
		.addClass('btn btn-danger btn-circle btn-xll')
		.appendTo('p[class="card-text3"]')
		.click(()=>{
			dicCrawling({css : $.css()})
		})
	}
	let bugsCrawling =x=>{
		$('.row').remove()
		$('<table style="width:100%">'+
		  '<link rel="stylesheet"  href="'+x.css+'/style.css">'+
			'<thead>'+
			 '<tr>'+
			   '<th colspan="2" style="color :white; background-color : black;">벅스 차트순위'+
			   '</th>'+
			 '</tr>'+
			'</thead>'+
			'<tbody>'+
			 '<tr>'+
			   '<td id="td1">'+
//			 '<textarea style="display: block;margin-top: 0px;margin-bottom: 0px;height: 500px;width: 100%;">'+
//			 '</textarea>'+
			 '</td>'+
			 '</tr>'+
			'</tbody>'+
			'</table>').appendTo('#team')
		
	}
	let cgvCrawling =x=>{
		$('.row').remove()
		$('<table style="width:100%">'+
		  '<link rel="stylesheet"  href="'+x.css+'/style.css">'+
			'<thead>'+
			 '<tr>'+
			   '<th colspan="2" style="color :white; background-color : black;">CGV MOVIE순위'+
			   '</th>'+
			 '</tr>'+
			'</thead>'+
			'<tbody>'+
			 '<tr>'+
			   '<td id="td1">'+
			 '</td>'+
			 '</tr>'+
			'</tbody>'+
			'</table>').appendTo('#team')
	}
	let dicCrawling =x=>{
		$('.row').remove()
		$('<table style="width:100%">'+
		  '<link rel="stylesheet"  href="'+x.css+'/style.css">'+
			'<thead>'+
			 '<tr>'+
			   '<th colspan="2" style="color :white; background-color : black;">NAVER 오늘의 단어'+
			   '</th>'+
			 '</tr>'+
			'</thead>'+
			'<tbody>'+
			 '<tr>'+
			   '<td id="td1">'+
			 '</td>'+
			 '</tr>'+
			'</tbody>'+
			'</table>').appendTo('#team')
	}
	return{onCreate}
})()