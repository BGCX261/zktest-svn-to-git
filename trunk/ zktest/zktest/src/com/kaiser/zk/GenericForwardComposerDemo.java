package com.kaiser.zk;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

public class GenericForwardComposerDemo extends GenericForwardComposer {

	private Button logindemo;
	private Textbox username;
	private Textbox password;

	public void onClick$logindemo(Event event) throws InterruptedException {
		System.out.println(username.getValue() + ", " + password.getValue());
	}

}
