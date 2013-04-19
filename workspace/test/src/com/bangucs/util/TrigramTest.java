package com.bangucs.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrigramTest {

	@Test
	public void testPurseTrigram() {
		Trigram tri = new Trigram();
		String a = "���ޤ��Ϻ��ޤǿ��ä��ѥ��������򤪤ܤ��Ƥ����Τ���";
		String b = "�����Ϻ��ޤǤ˸����ǲ��ο����Ф��Ƥ����Τ���";
		System.out.println(a + "\r\n�����ȡ�\r\n" + b + "\r\n�����ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
		assertTrue(tri.purseTrigram(a,b) != 0);
		
		a = "�٤εҤϤ褯�������Ҥ�";
		b = "�������夬�����ʤ˲İ����櫓���ʤ�";
		System.out.println(a + "\r\n�����ȡ�\r\n" + b + "\r\n�����ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
		assertTrue(tri.purseTrigram(a,b) == 0);
		
		a = "���ν����������ϥץ����ͤ��ܻؤ��ͤ����ޤ륵���Ȥ�ɾ���ι⤤���ʤ������ǥ��ԥڤ������Τ����Ƥ����Ȥ����ο���Ū�ʼ������ȤäƤ��뤳�Ȥ�ʬ���äƤ��ޤ���";
		b = "���γ����ϡ����ͤ��ܻؤ��Ƥ����ͤ��������ޤ��ۡ����ڡ����ǡ�ɾ���ι⤤���ʤ������ǥ��ԥڤ������Τ����Ƥ����ȸ�������̯�ʼ������Ȥä����Ȥ�ʬ�����ޤ�����";
		System.out.println(a + "\r\n���ȡ�\r\n" + b + "\r\n���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
		assertTrue(tri.purseTrigram(a,b) != 0);

		a = "�ɤ����Ƥ��ѻ������ΤǤ��ߤޤ��������˼��餷�ޤ�";
		b = "�ɤ����Ƥ��ѻ������ΤǤ��ߤޤ��������˼��餷�ޤ�";
		System.out.println(a + "���ȡ�" + b + "���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
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
//		System.out.println(a + "���ȡ�" + b + "���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
//		assertTrue(tri.purseTrigram(a,b) != 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "���ȡ�" + b + "���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
//		assertTrue(tri.purseTrigram(a,b) != 0);
//
//		a = "";
//		b = "";
//		System.out.println(a + "���ȡ�" + b + "���ϡ�" + tri.purseTrigram(a,b) + "�����餤���Ƥ�");
//		assertTrue(tri.purseTrigram(a,b) != 0);

		
	}

}
