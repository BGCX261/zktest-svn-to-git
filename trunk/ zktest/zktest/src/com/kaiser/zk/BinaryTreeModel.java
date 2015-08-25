package com.kaiser.zk;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zul.AbstractTreeModel;
import org.zkoss.zul.event.TreeDataEvent;

/**
 * A simple implementation of binary tree model by an arraylist
 * 
 * @author Jeff Liu
 */
public class BinaryTreeModel extends AbstractTreeModel {

	private ArrayList _tree = null;

	/**
	 * Constructor
	 * 
	 * @param tree
	 *            the list is contained all data of nodes.
	 */
	public BinaryTreeModel(List tree) {
		super(tree.get(0));
		_tree = (ArrayList) tree;
	}

	// -- TreeModel --//
	public Object getChild(Object parent, int index) {
		int i = _tree.indexOf(parent) * 2 + 1 + index;
		if (i >= _tree.size())
			return null;
		else
			return _tree.get(i);
	}

	// -- TreeModel --//
	public int getChildCount(Object parent) {
		int count = 0;
		if (getChild(parent, 0) != null)
			count++;
		if (getChild(parent, 1) != null)
			count++;
		return count;
	}

	// -- TreeModel --//
	public boolean isLeaf(Object node) {
		return (getChildCount(node) == 0);
	}

}
