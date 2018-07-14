package com.algorithm.hanio;
/**
 * 汉诺塔的递归实现
 * @author 誠
 *
 */

import com.algorithm.nonrecursive.hanoi.*;

public class Hanio {
	//只有一个盘子，即只移动一部
	public void moveOne(int n, String init, String destination){
		System.out.println("move: " + n + " from " + init + " to " + destination);
	}
	
	/**
	 * 有n个盘子，递归，先将前n-1个盘子放到tem柱上，再将第n个盘子放到destination柱上
	 */
	
	public void move(int n, String init, String tem, String destination){
		if(n <= 0 ){
			System.out.println("number error !");
		}
		
		if(n == 1){
			moveOne(n, init, destination);
		}
		else{
			move(n-1, init, destination, tem);  //将前n-1个盘子借助 目标柱子destination 移到 辅助柱tem
			moveOne(n, init, destination);  //将第n个柱子移到 目标柱子destination
			move(n-1, tem, init, destination);  //将n-1个盘子借助 初始柱init 移到 目标柱子destination上
		}
	}
	
	public static void main(String args[]){
		/**Hanio hanio = new Hanio();
		hanio.move(4, "A", "B", "C");
		
		hanoi_noncursive ha = new hanoi_noncursive();
		ha.hanoi(3, 'a', 'b', 'c');*/
		
		
	}
}
