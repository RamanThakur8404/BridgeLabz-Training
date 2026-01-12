package com.browserbuddyapp;

public class BrowserBuddyApp {
	private ClosedTabsStack recentlyClosed;

	public BrowserBuddyApp() {
		this.recentlyClosed = new ClosedTabsStack();
	}

	public static void main(String[] args) {
		BrowserBuddyApp browser = new BrowserBuddyApp();

		// Create first tab
		BrowserTab tab1 = new BrowserTab("https://www.google.com");
		System.out.println("Tab 1: " + tab1.getTitle() + " -> " + tab1.getCurrentUrl());

		// Browsing
		tab1.visit("https://www.google.com/search?q=java");
		tab1.visit("https://www.youtube.com");
		tab1.visit("https://github.com");

		System.out.println("Current: " + tab1.getCurrentUrl());

		// Navigate back & forward
		System.out.println("Back -> " + tab1.goBack());
		System.out.println("Back -> " + tab1.goBack());
		System.out.println("Forward -> " + tab1.goForward());

		// Close tab
		System.out.println("\nClosing tab...");
		browser.closeTab(tab1);

		// Reopen recently closed tab
		System.out.println("Reopening last closed tab...");
		BrowserTab reopened = browser.reopenLastClosedTab();

		if (reopened != null) {
			System.out.println("Reopened: " + reopened.getTitle() + " -> " + reopened.getCurrentUrl());
		}
	}

	// Close a tab and save to recently closed
	public void closeTab(BrowserTab tab) {
		recentlyClosed.push(tab);
		System.out.println("Closed: " + tab.getTitle());
	}

	// Restore most recently closed tab
	public BrowserTab reopenLastClosedTab() {
		BrowserTab tab = recentlyClosed.pop();
		if (tab != null) {
			System.out.println("Restored: " + tab.getTitle());
		}
		return tab;
	}
}