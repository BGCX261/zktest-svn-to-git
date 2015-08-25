package com.kaiser.zk;

import org.zkoss.zhtml.Messagebox;
import org.zkoss.zul.Window;

public class MyWindow1 extends Window {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7106191451568035711L;

	public void onCreate() {
		this.setSizable(true);
		this.doOverlapped();
	}

	public void onOk() {
		try {
			Messagebox.show("This is onOk event!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
}
