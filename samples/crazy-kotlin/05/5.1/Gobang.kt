

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
// �������̵Ĵ�С
val BOARD_SIZE = 15
// ����һ����ά�������䵱����
var board = Array(BOARD_SIZE, {Array(BOARD_SIZE, {""})})
fun initBoard(){
	// ��ÿ��Ԫ�ظ�Ϊ"��"�������ڿ���̨��������
	for (i in 0 until BOARD_SIZE){
		for (j in 0 until BOARD_SIZE){
			board[i][j] = "��"
		}
	}
}
// �ڿ���̨������̵ķ���
fun printBoard(){
	// ��ӡÿ������Ԫ��
	for (i in 0 until BOARD_SIZE){
		for ( j in 0 until BOARD_SIZE ){
			// ��ӡ����Ԫ�غ󲻻���
			print(board[i][j])
		}
		// ÿ��ӡ��һ������Ԫ�غ����һ�����з�
		println()
	}
}
fun main(args: Array<String>){
	initBoard()
	printBoard()
	var inputStr = readLine()
	while (inputStr != null){
		// ���û�������ַ����Զ��ţ�,����Ϊ�ָ������ָ���2���ַ���
		var posStrArr = inputStr.split(",")
		// ��2���ַ���ת�����û����������
		var xPos = posStrArr[0].toInt()
		var yPos = posStrArr[1].toInt()
		// �Ѷ�Ӧ������Ԫ�ظ�Ϊ"��"��
		board[yPos - 1][xPos - 1] = "��"
		/*
		 �����������2����������Ϊ������������꣬����board����
		 ���漰
			1���������Ч�ԣ�ֻ�������֣����ܳ������̷�Χ
			2���µ���ĵ㣬�����ظ�����
			3��ÿ���������Ҫɨ��˭Ӯ��
		 */
		printBoard()
		println("����������������꣬Ӧ��x,y�ĸ�ʽ��")
		inputStr = readLine()
	}
}
