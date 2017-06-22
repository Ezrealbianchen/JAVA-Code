package com.Ezreal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Gobang {
	//定义棋盘的大小
	private static int BOARD_SIZE = 15;
	private String[][] board;
	public void initBoard() {
		//初始化棋盘数组
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//绘制棋盘
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				board[i][j] = "+";
			}
		}
	}
	
	//在控制台打印出棋盘的方法
	public void printBoard() {
		//打印每个数组元素
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				System.out.print(board[i][j]);
			}
			//！！！！！！！可测试
			System.out.println();
		}
	}
	
	
	public void Computer() {
		/*
		 * 随机生成两个数
		 * 检查这个位置是否已经有棋子
		 * 如果有则重新生成
		 * 如果没有则放置
		 */
		Random r = new Random();
		int RandomX = r.nextInt(BOARD_SIZE);
		int RandomY = r.nextInt(BOARD_SIZE);
		while(true) {
			if(board[RandomX][RandomY]=="+")break;
			RandomX = r.nextInt(BOARD_SIZE);
			RandomY = r.nextInt(BOARD_SIZE);
		}
		board[RandomX][RandomY] = "○";
		
	}
	
	public boolean Check() {
		int count = 0;
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				if(board[i][j]=="●")count++;
				else count = 0;
				if(count>=5) return true;
			}
		}
		
		count = 0;
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				if(board[j][i]=="●")count++;
				else count = 0;
				if(count>=5) return true;
			}
		}
		
		count = 0;
		//斜线
		
		for(int i=4;i<BOARD_SIZE;i++) {
			for(int a=0,b=i;a<BOARD_SIZE&b>=0;a++,b--) {
				if(board[a][b]=="●")count++;
				else count = 0;
				if(count>=5) return true;
						
			}
			
		}
		
		count = 0;
		
		for(int i=10;i>=0;i--) {
			for(int a=0,b=i;a<BOARD_SIZE&b<BOARD_SIZE;a++,b++) {
				if(board[a][b]=="●")count++;
				else count = 0;
				if(count>=5) return true;
						
			}
			
		}
		
		count = 0;
		
		for(int i=4;i<BOARD_SIZE;i++) {
			for(int a=14,b=i;a>=0&b>=0;a--,b--) {
				if(board[a][b]=="●")count++;
				else count = 0;
				if(count>=5) return true;
						
			}
			
		}
		
		count = 0;
		
		for(int i=10;i>=0;i--) {
			for(int a=14,b=i;a>=0&b<BOARD_SIZE;a--,b++) {
				if(board[a][b]=="●")count++;
				else count = 0;
				if(count>=5) return true;
						
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) throws Exception{
		
		
		
		Gobang gb = new Gobang();
		gb.initBoard();
		gb.printBoard();
	
		//用于获取键盘输入的方法
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		
		while((inputStr = br.readLine())!=null) {
			//将用户输入的字符串以逗号(,)作为分隔符，分成两个字符串
			String[] posStrArr = inputStr.split(",");
			//将两个字符串转换成用户下棋的坐标
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			gb.board[yPos - 1][xPos - 1] = "●";
			gb.Computer();
			gb.printBoard();
			if(gb.Check()==true){
				System.out.println("胜负已分!");
				break;
			}
			System.out.println("请输入下棋坐标，格式为x,y：");
			
			
		
		}
	}
	
}
