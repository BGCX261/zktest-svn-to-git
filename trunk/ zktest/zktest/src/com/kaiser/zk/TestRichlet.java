package com.kaiser.zk;

import org.zkoss.zk.ui.GenericRichlet;
import org.zkoss.zk.ui.Page;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

public class TestRichlet extends GenericRichlet {

	@Override
	public void service(Page page) {
		page.setTitle("My first zk page!");
		final Window window = new Window("Richlet test", "normal", true);
		window.setPosition("center");
		window.setWidth("200px");
		window.setHeight("200px");
		window.doOverlapped();
		window.setSizable(true);
		new Label("Hello World").setParent(window);
		window.setPage(page);
	}

}
