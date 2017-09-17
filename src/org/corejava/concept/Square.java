package org.corejava.concept;

public class Square {

	private int length;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int area(int l) {
		return (l * l);
	}

	@Override
	public String toString() {
		return "Square [length=" + length + "]";
	}

	@Override
	public boolean equals(Object s1) {

		Square s2=(Square)s1;
		if (this.length == s2.getLength()) {
			return true;
		}
		return false;
	}

}
