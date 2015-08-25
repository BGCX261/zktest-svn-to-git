package com.kaiser.zk;

import org.zkforge.fckez.FCKeditor;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.InputEvent;
import org.zkoss.zul.Window;

public class MyWindow6 extends Window {
	/**
	 * 
	 */
	private static final long serialVersionUID = 902584856223786544L;

	public void onCreate() {
		FCKeditor fck = new FCKeditor();
		fck.setValue("Hello Java");
		fck.setParent(this);
		fck.addEventListener(Events.ON_CHANGE, new EventListener() {
			public void onEvent(Event event) throws Exception {
				System.out.println(((InputEvent) event).getValue());
			}

		});

	}
}
