/**
 * 
 */
package com.bangucs.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mitsuo.hangai
 *
 */
public class Trigram {
	/**
	 * This method purses difference of 2 Strings with Trigram algorithm.
	 * @param a
	 * @param b
	 * @return difference between 2 strings
	 *　 if a == b  => return 1
	 *  if a <> b  => return 0　
	 */
	public double purseTrigram(String a, String b){
		double difference = 0;
		int aLength = a.length();
		int bLength = b.length();
		List<String> aArray = new ArrayList<String>();
		List<String> bArray = new ArrayList<String>();
		double same = 0;   //同じののかず
		double denom = 0;  //分母
		//そもそも同じなら以下何もせずに1返す
		if(a.equals(b)){
			return 1;
		}
		//3文字以内ならその場で比較して返しちゃう
		else if(aLength<=3 || bLength<=3){
			if(a.equals(b)){
				same = 1;
				denom = 1;
				return 1;
			}else{
				return difference;
			}
		}
		for(int i=0;i<aLength-2;i++){
			aArray.add(i, a.substring(i, i+3));
		}
		for(int i=0;i<bLength-2;i++){
			bArray.add(i, b.substring(i, i+3));
		}
		int aSize = aArray.size();
		int bSize = bArray.size();
		//compare 2 strings
		if(aSize >= bSize){
			for(int i =0;i<aSize;i++){
				for(int j=0;j<bSize;j++){
					if(aArray.get(i).equals(bArray.get(j))){
						same ++;
					}
				}
			}
			denom = aSize;
		}else{
			for(int i =0;i<bSize;i++){
				for(int j=0;j<aSize;j++){
					if(bArray.get(i).equals(aArray.get(j))){
						same ++;
					}
				}
			}
			denom = bSize;
		}
		if(same==0){
			difference = 0;
		}else{
			difference = same/denom;
		}
		return difference;
	}
}
