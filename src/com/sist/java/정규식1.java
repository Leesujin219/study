package com.sist.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ���Խ�1 {
	public static void main(String[] args) throws Exception {
		String[] data= {"ab","cha","apple","bat","baby","bonus","c","ct","cA","ca","co","c.",
				"c0","car","combat","count","date","disc"};
		
		String[] pattern= {".*","c[a-z]*","c[a-z]","c[a-zA-Z]","c[a-zA-Z0-9]",
				"c.","c.*","c\\.","c\\w","c\\d",
				"c.*t","[b|c].*",".*a.*",".*a.+",".*a.","[b|c].{2}",".*sc$"};
		
		System.out.println(data.length);
		for(int x=0;x<pattern.length;x++) {
			Pattern p=Pattern.compile(pattern[x]);
			System.out.print("Pattern : "+pattern[x]+" ��� : ");
			for(int i=0;i<data.length;i++) {
				Matcher m=p.matcher(data[i]);
				if(m.matches()) {
					System.out.print(data[i]+",");	
				}
			}
			System.out.println();
		}
	}
}
