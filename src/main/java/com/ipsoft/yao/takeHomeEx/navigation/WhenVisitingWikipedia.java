package com.ipsoft.yao.takeHomeEx.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ipsoft.yao.takeHomeEx.step.NavigationUser;

@RunWith(SerenityRunner.class)
public class WhenVisitingWikipedia{
	
	@Steps
	public NavigationUser mark;
	
	@Managed
	public WebDriver browser;

	@Test
	public void shouldBeEnglishVersion(){
		//Given
		mark.isOnHomePage();
		
		//When
		mark.navigatesToEnglish();
		
		//Then
		mark.shouldSeePageTitleContaining("Wikipedia");
		
		
	}
	
}