package com.kaiser.zk;

import java.util.Date;

import org.zkoss.zhtml.Messagebox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Separator;
import org.zkoss.zul.Window;

public class MyWindow2 extends Window {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7106191451568035711L;

	public void onCreate() {
		this.setHeight("200px");
		this.setPosition("right,top");
	}

	public void onOk() {
	}

	public void onCancel() {
		try {
			Messagebox.show("This is onCancel event!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void onClick() {

	}

	public void onClose() {
		this.setPage(null);
	}

	public void onAddItem() {
		new Label("Add at " + new Date()).setParent(this);
		Separator sep = new Separator();
		sep.setBar(true);
		sep.setParent(this);
	}
}
