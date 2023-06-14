package com.cys.ex95webapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    val wv: WebView by lazy { findViewById(R.id.wv) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       //WebView 기본설정
        wv.settings.javaScriptEnabled = true //웹뷰 설정 객체를 통해 JS 사용을 허용 하도록 변경 설정
        wv.webViewClient= WebViewClient() //새로운 웹 문서가 열릴떄 기본 웹뷰는 새탭으로 열기에 이 웹뷰가 아니라  웹 브라우저가 실행 되면서 열림. 해도되고 안해도됨 버
        wv.webChromeClient= WebChromeClient() // alert(), confirm() 같은 팝업기능을 사용하도록  권장

        // 웹 뷰가 보여줄 웹문서(html) 로드하기
        // 웹문서가 있는 위치는 프로젝트 안에 있거나 웹서버에 위치할 수 있음.

        // 1. 프로젝트 안에 assets 폴더안에 html 문서 위치
        //wv.loadUrl("file:///android_asset/index.html")

        //2. 닷홈, AWS(아마존 웹 서버) 같은 웹 서버 html 문서가 존재
        //wv.loadUrl("http://vasco1379.dothome.co.kr")
        //wv.loadUrl("http://vasco1379.dothome.co.kr/ajax/05_AJAX.html")
        wv.loadUrl("http://mrhisj23.dothome.co.kr/WebProjTeamC")

    }

    override fun onBackPressed() {
        if(wv.canGoBack() )wv.goBack()
        else finish()

    }
}