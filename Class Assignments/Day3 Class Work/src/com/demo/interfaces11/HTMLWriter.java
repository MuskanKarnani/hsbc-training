package com.demo.interfaces11;

import com.demo.interfaces1.Writer;

public class HTMLWriter implements Writer
{

	@Override
	public String write(String msg) {
		System.out.println("HI, I AM A HTML WRITER");
		return msg;
	}

	
}
