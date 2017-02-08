package com.ipsoft.yao.takeHomeEx.ui;


import net.serenitybdd.core.pages.PageObject;


public class LanguageNavigator extends PageObject{

	public void selectEnglish() {
		$("*[id=js-link-box-en]").click();
	}
	
}
