package com.kaiser.zk;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Composer;
import org.zkoss.zk.ui.event.InputEvent;

public class MyComposer2 implements Composer {
	@Override
	public void doAfterCompose(Component com) throws Exception {
		// com.addEventListener("onClick", new MyListener());
		com.addEventListener("onChange", new MyListener());

	}

	class MyListener implements org.zkoss.zk.ui.event.EventListener {
		@Override
		public void onEvent(Event event) throws Exception {
			System.out.println(((InputEvent) event).getValue());			
		}
	}
}
