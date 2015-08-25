package com.kaiser.zk;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Composer;
import org.zkoss.zul.Window;

public class MyComposer1 implements Composer {

	@Override
	public void doAfterCompose(Component com) throws Exception {
		((Window) com).setTitle("My Window1");
	}
}
