package br.com.eagle.vnd.domain;

public class VerticalSorting_BAD {

	private Boolean isSuite = false;
	
	private void include(String pageName, String arg) {
		//...
	}
	
	private void includeSetupPage() {
		include("SetUp", "-setup");
	}
	
	private void includeSetupPages() {
		if (isSuite) {
			includeSuiteSetupPage();
		}
		includeSetupPage();
	}
	
	private void includeSuiteSetupPage() {
		include("Suite setup", "-setup");
	}
	
}
