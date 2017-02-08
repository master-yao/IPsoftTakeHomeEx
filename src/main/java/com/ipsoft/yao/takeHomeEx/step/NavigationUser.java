package com.ipsoft.yao.takeHomeEx.step;

import org.assertj.core.api.Assertions;

import com.ipsoft.yao.takeHomeEx.ui.CurrentPage;
import com.ipsoft.yao.takeHomeEx.ui.LanguageNavigator;
import com.ipsoft.yao.takeHomeEx.ui.WikipediaHomepage;

import net.thucydides.core.annotations.Step;

public class NavigationUser {
	
	public  WikipediaHomepage wikipediaHomepage;
	public  CurrentPage currentPage;
	public  LanguageNavigator languageNavigator;
	
	@Step
	public void isOnHomePage() {
		wikipediaHomepage.open();
	}
	
	@Step
	public void navigatesToEnglish() {
		languageNavigator.selectEnglish();
	}
	
	@Step
	public void shouldSeePageTitleContaining(String string) {
		Assertions.assertThat(currentPage.$("*[title=Wikipedia]").containsText(string)).isEqualTo(true);
	}
}
