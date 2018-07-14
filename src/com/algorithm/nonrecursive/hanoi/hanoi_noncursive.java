package com.algorithm.nonrecursive.hanoi;

/**
 * 使用栈实现非递归形式的汉诺塔
 * @author 誠
 *
 */

public class hanoi_noncursive {
	
	public void hanoi(int n, char init, char tem, char desti){
		StackHanoi stack = new StackHanoi();
		
		stack.push(new State(n, init, tem, desti));
		
		State state = null;
		
		while((state = stack.pop()) != null){
			if(state.n == 1){
				move(state.init, state.desti);
			}
			else{
				stack.push(new State(state.n-1, state.tem, state.init, state.desti));
				stack.push(new State(1, state.init, state.tem, state.desti));
				stack.push(new State(state.n-1, state.init, state.desti, state.tem));
			}			
		}
	}
	
	public void move(char init, char desti){
		System.out.println("move: " + init + " to " + desti);
	}
	
}

/**
 * 保存状态的函数
 * @author 誠
 *
 */
class State{
	/**
	 * 盘子的数目
	 */
	public int n;
	
	/**
	 * 初始的柱子
	 */
	public char init;
	
	/**
	 * 辅助的柱子
	 */
	public char tem;
	
	/**
	 * 目标柱子
	 */
	public char desti;
	
	/**
	 * 构造函数
	 * @param n
	 * @param init
	 * @param tem
	 * @param desti
	 */
	public State(int n, char init, char tem, char desti){
		this.n = n;
		this.init = init;
		this.tem = tem;
		this.desti = desti;
	}
	
}

/**
 * 栈函数
 */
class StackHanoi{
	private State[] storage = new State[1000];
	
	private int top = 0;
	
	/**
	 * 出栈函数
	 * @param state
	 * @return
	 */
	public State pop(){
		if(top > 0){
			return storage[--top];
		}
		else{
			return null;
		}
	}
	
	/**
	 * 入栈函数
	 */
	public void push(State state){
		storage[top++] = state;
	}
}








