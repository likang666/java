package com.work;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
//		登录。功能如下：输入用户名密码，用户名为’a’，
//		密码为123，输出欢迎你，三。否则输出用户名，密码错误。
		String loginName = "admin";//预先设置的账号
		String loginPwd = "123456";//预先设置的密码
		Scanner input = new Scanner(System.in);
		System.out.println("请输入账号：");
		String name = input.next();
		System.out.println("请输入密码：");
		String pwd = input.next();
		
		if (name.equals(loginName)&&pwd.equals(loginPwd)) {
			System.out.println("欢迎光临");
		}else {
			System.out.println("账号或密码错误！");
		}
	}
}
