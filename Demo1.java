package com.work;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
//		��¼���������£������û������룬�û���Ϊ��a����
//		����Ϊ123�������ӭ�㣬������������û������������
		String loginName = "admin";//Ԥ�����õ��˺�
		String loginPwd = "123456";//Ԥ�����õ�����
		Scanner input = new Scanner(System.in);
		System.out.println("�������˺ţ�");
		String name = input.next();
		System.out.println("���������룺");
		String pwd = input.next();
		
		if (name.equals(loginName)&&pwd.equals(loginPwd)) {
			System.out.println("��ӭ����");
		}else {
			System.out.println("�˺Ż��������");
		}
	}
}
