package br.com.eagle.vnd.domain;

public class VerticalSorting_GOOD {

	private Boolean isSuite = false;
		
	private void includeSetupPages() {
		if (isSuite) {
			includeSuiteSetupPage();
		}
		includeSetupPage();
	}
	
	private void includeSuiteSetupPage() {
		include("Suite setup", "-setup");
	}
	
	private void includeSetupPage() {
		include("SetUp", "-setup");
	}
	
	private void include(String pageName, String arg) {
		//...
	}
}
