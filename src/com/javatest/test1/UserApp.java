package com.javatest.test1;

import java.util.ArrayList;

public class UserApp {

	public static void main(String[] args) {

		ArrayList<User> user = new ArrayList<User>();

		User u01 = new Staff("master", "m7788", "운영자", 3500000);
		User u02 = new Customer("jung-ws", "j1357913579", "정우성", 1000);
		User u03 = new Customer("LeeHR", "a123!!", "이효리", 2500);
		User u04 = new Customer("ms-park", "y2345", "박명수", 1200);

		user.add(u01);
		user.add(u02);
		user.add(u03);
		user.add(u04);
		
		System.out.println("-------------회원+운영자 전체리스트-------------");

		int count = 0;
		for (int i = 0; i < user.size(); i++) {
			count = count + 1;
			System.out.print(count + ".");
			user.get(i).showInfo();
		}
		System.out.println("");
		System.out.println("운영자의 연봉은 " + (((Staff)user.get(0)).getSalary())*12 +" 입니다.");

	}

}
