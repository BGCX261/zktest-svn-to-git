package com.kaiser.zk;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Window;

public class MyWindow5 extends Window {
	/**
	 * 
	 */
	private static final long serialVersionUID = 902584856223786544L;

	public void onCreate(Event event) {
		this.setTitle("MyWindow5");
		this.doOverlapped();
		this.setSizable(true);
		
//		this.addEventListener("onClick", new MyListener());
	}

	class MyListener implements org.zkoss.zk.ui.event.EventListener {

		@Override
		public void onEvent(Event event) throws Exception {
			
		}

	}

}
