package com.Ezreal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Gobang {
	//�������̵Ĵ�С
	private static int BOARD_SIZE = 15;
	private String[][] board;
	public void initBoard() {
		//��ʼ����������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//��������
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				board[i][j] = "+";
			}
		}
	}
	
	//�ڿ���̨��ӡ�����̵ķ���
	public void printBoard() {
		//��ӡÿ������Ԫ��
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				System.out.print(board[i][j]);
			}
			//���������������ɲ���
			System.out.println();
		}
	}
	
	
	public void Computer() {
		/*
		 * �������������
		 * ������λ���Ƿ��Ѿ�������
		 * ���������������
		 * ���û�������
		 */
		Random r = new Random();
		int RandomX = r.nextInt(BOARD_SIZE);
		int RandomY = r.nextInt(BOARD_SIZE);
		while(true) {
			if(board[RandomX][RandomY]=="+")break;
			RandomX = r.nextInt(BOARD_SIZE);
			RandomY = r.nextInt(BOARD_SIZE);
		}
		board[RandomX][RandomY] = "��";
		
	}
	
	public boolean Check() {
		int count = 0;
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				if(board[i][j]=="��")count++;
				else count = 0;
				if(count>=5) return true;
			}
		}
		
		count = 0;
		for(int i=0;i<BOARD_SIZE;i++) {
			for(int j=0;j<BOARD_SIZE;j++) {
				if(board[j][i]=="��")count++;
				else count = 0;
				if(count>=5) return true;
			}
		}
		
		count = 0;
		//б��
		
		for(int i=4;i<BOARD_SIZE;i++) {
			for(int a=0,b=i;a<BOARD_SIZE&b>=0;a++,b--) {
				if(board[a][b]=="��")count++;
				else count = 0;
				if(count>=5) return true;
						
			}
			
		}
		
		count = 0;
		
		for(int i=10;i>=0;i--) {
			for(int a=0,b=i;a<BOARD_SIZE&b<BOARD_SIZE;a++,b++) {
				if(board[a][b]=="��")count++;
				else count = 0;
				if(count>=5) return true;
						
			}
			
		}
		
		count = 0;
		
		for(int i=4;i<BOARD_SIZE;i++) {
			for(int a=14,b=i;a>=0&b>=0;a--,b--) {
				if(board[a][b]=="��")count++;
				else count = 0;
				if(count>=5) return true;
						
			}
			
		}
		
		count = 0;
		
		for(int i=10;i>=0;i--) {
			for(int a=14,b=i;a>=0&b<BOARD_SIZE;a--,b++) {
				if(board[a][b]=="��")count++;
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
	
		//���ڻ�ȡ��������ķ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		
		while((inputStr = br.readLine())!=null) {
			//���û�������ַ����Զ���(,)��Ϊ�ָ������ֳ������ַ���
			String[] posStrArr = inputStr.split(",");
			//�������ַ���ת�����û����������
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);
			gb.board[yPos - 1][xPos - 1] = "��";
			gb.Computer();
			gb.printBoard();
			if(gb.Check()==true){
				System.out.println("ʤ���ѷ�!");
				break;
			}
			System.out.println("�������������꣬��ʽΪx,y��");
			
			
		
		}
	}
	
}
