package com.bangucs.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrigramTest {

	@Test
	public void testPurseTrigram() {
		Trigram tri = new Trigram();
		String a = "例えば、あるメトリクスを分析することで、バグが潜みやすい箇所を絞り込んでいくことができます。";
		String b = "例えば、あるメトリクスをよく見ることで、バグが潜みがちな場所を特定することができます。";
		double result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n と \r\n"+ b + "\r\n は" + result + " くらい似てるみたい。");
		assertTrue(result != 0);
				
		a = "起動戦士ガンダム";
		b = "超時空要塞マクロス";
		result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n と \r\n"+ b + "\r\n は" + result + " くらい似てるみたい。");
		assertTrue(result == 0);
		
		a = "離れてても　胸の奥で　友達だよ";
		b = "離れても　胸の奥の　友達で　いさせて";
		result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n と \r\n"+ b + "\r\n は" + result + " くらい似てるみたい。");
		assertTrue(result != 0);

		a = "前回参加していない人、初めての参加者、テスト初心者の方でもわかりやすいように説明していきます。";
		b = "前回参加していない人、初めての参加者、テスト初心者の方でもわかりやすいように説明していきます。";
		result = tri.purseTrigram(a,b);
		System.out.println(a + " \r\n と \r\n"+ b + "\r\n は" + result + " くらい似てるみたい。");
		assertTrue(result ==1);

		a = "";
		b = "";
		assertTrue(tri.purseTrigram(a,b) ==1);
		
		a = "";
		b = "";
		assertTrue(tri.purseTrigram(a,b) ==1);

		a = "a";
		b = "aa";
		assertTrue(tri.purseTrigram(a,b) == 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "鐃緒申鐃夙￥申" + b + "鐃緒申鐃熟￥申" + tri.purseTrigram(a,b) + "鐃緒申鐃緒申鐃初い鐃緒申鐃銃わ申");
//		assertTrue(tri.purseTrigram(a,b) != 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "鐃緒申鐃夙￥申" + b + "鐃緒申鐃熟￥申" + tri.purseTrigram(a,b) + "鐃緒申鐃緒申鐃初い鐃緒申鐃銃わ申");
//		assertTrue(tri.purseTrigram(a,b) != 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "鐃緒申鐃夙￥申" + b + "鐃緒申鐃熟￥申" + tri.purseTrigram(a,b) + "鐃緒申鐃緒申鐃初い鐃緒申鐃銃わ申");
//		assertTrue(tri.purseTrigram(a,b) != 0);

		
	}

}
