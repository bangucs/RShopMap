package com.bangucs.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrigramTest {

	@Test
	public void testPurseTrigram() {
		Trigram tri = new Trigram();
		String a = "おまえは今まで食ったパンの枚数をおぼえているのか？";
		String b = "お前は今までに見た映画の数を覚えているのか？";
		System.out.println(a + "\r\n　　と　\r\n" + b + "\r\n　　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
		assertTrue(tri.purseTrigram(a,b) != 0);
		
		a = "隣の客はよく柿食う客だ";
		b = "おれの妹がこんなに可愛いわけがない";
		System.out.println(a + "\r\n　　と　\r\n" + b + "\r\n　　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
		assertTrue(tri.purseTrigram(a,b) == 0);
		
		a = "この女子中学生はプロ詩人を目指す人が集まるサイトで評価の高い作品を選んでコピペしたものを投稿するという確信犯的な手口を使っていることが分かっています。";
		b = "その学生は、詩人を目指している人たちが集まるホームページで、評価の高い作品を選んでコピペしたものを投稿すると言う、巧妙な手口を使ったことが分かりました。";
		System.out.println(a + "\r\n　と　\r\n" + b + "\r\n　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
		assertTrue(tri.purseTrigram(a,b) != 0);

		a = "どうしても用事あるのですみませんお先に失礼します";
		b = "どうしても用事あるのですみませんお先に失礼します";
		System.out.println(a + "　と　" + b + "　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
		assertTrue(tri.purseTrigram(a,b) == 1);

		a = "";
		b = "";
		System.out.println(a + "　と　" + b + "　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
		assertTrue(tri.purseTrigram(a,b) ==1);

		a = "a";
		b = "aa";
		System.out.println(a + "　と　" + b + "　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
		assertTrue(tri.purseTrigram(a,b) == 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "　と　" + b + "　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
//		assertTrue(tri.purseTrigram(a,b) != 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "　と　" + b + "　は　" + tri.purseTrigram(a,b) + "　くらい似てる");
//		assertTrue(tri.purseTrigram(a,b) != 0);

		
	}

}
