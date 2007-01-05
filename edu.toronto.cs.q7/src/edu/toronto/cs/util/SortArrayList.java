/*
 * Created on Mar 8, 2005
 */
package edu.toronto.cs.util;

import java.util.ArrayList;

/**
 * @author Yijun
 */
public class SortArrayList extends ArrayList {
	private static final long serialVersionUID = 1L;
	public void add(Comparable o) {
		boolean inserted = false;	//顺序查找插入。将来可以考虑采用好的更好的插入方法。
		for (int i=0; i<size(); i++) {
			Comparable s = (Comparable) get(i);
			if (s.compareTo(o)>0) {
				add(i, o);
				inserted = true;
				break;
			}
		}
		if (!inserted)
			super.add(o);
	}
//	public void add(Comparable o)
//	{
//		if(this.size()==0)
//		{
//			super.add(o);
//			return;
//		}
//		add(0, this.size(),o);
//	}
//	public void add(int start, int end, Comparable o){
//		if(start==end)	//两者相等，所以肯定插在该值的相邻的位置
//		{
//			Comparable s = (Comparable) get(start);
//			if(s.compareTo(o)>0)
//				add(start,o);
//			else
//				add(start+1,o);
//		} else {
//			int j=(start+end)/2;
//			Comparable s = (Comparable) get(j);
//			if(s.compareTo(o)>0)
//				add(j,end,o);
//			else
//				add(start,j,o);
//		}
//	}
}
