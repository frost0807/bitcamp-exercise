package Bulletin;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	public static Scanner sc;
	private static int postId;
	private static ArrayList<Post> pList;
	
	public static void init() {
		sc=new Scanner(System.in);
		pList=new ArrayList<>();
		postId=1;
	}
	
	public static void showMain() {
		while(true) {
			System.out.println("게시판 프로그램입니다.");
			if(pList.isEmpty()) {
				System.out.println("-------------------------------------------");
				System.out.println("저장된 게시물이 없습니다.");
				System.out.println("-------------------------------------------");
			} else {
				System.out.println("-------------------------------------------");
				for(Post p:pList) {
					System.out.printf("게시물번호:%d 제목:%10s\n",p.getId(),p.getTitle());
				}
				System.out.println("-------------------------------------------");
			}
			System.out.println("게시물을 작성하려면 0을 입력하시거나\n보고싶은 게시물의 게시물번호를 입력하세요(종료하려면 -1을 입력하세요)");
			int userChoice=UtilScanner.nextInt(sc);
			Post temp=new Post();
			temp.setId(userChoice);

			if(userChoice==0) {
				write();
			} else if(userChoice!=0&&userChoice!=-1&&pList.contains(temp)) {
				printOne(temp);
			} else if(userChoice==-1) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
	}
	public static void write() {
		System.out.println("-------------------------------------------");
		System.out.printf("제목을 입력해주세요");
		String tempTitle=UtilScanner.nextLine(sc);
		System.out.println("내용을 입력해주세요");
		String tempContent=UtilScanner.nextLine(sc);
		System.out.println("사용할 비밀번호 숫자 8자리를 입력해주세요");
		String tempPassword=UtilScanner.nextLine(sc,8);
		System.out.println("-------------------------------------------");
		pList.add(new Post(postId++,tempPassword,tempTitle,tempContent));
	}
	public static void printOne(Post temp) {
		temp=pList.get(pList.indexOf(temp));
		System.out.printf("제목:%s\n",temp.getTitle());
		System.out.printf("내용:%s\n",temp.getContent());
		System.out.println("수행할 작업을 입력해주세요 1.삭제 2.수정 3.댓글보기 4.뒤로가기");
		
		int userChoice2=UtilScanner.nextInt(sc,1,4);
		
		if(userChoice2==1) {
			deletePost(temp);
		} else if(userChoice2==2) {
			updatePost(temp);
			printOne(temp);
		} else if(userChoice2==3) {
			temp.printReply();
		}
	}
	public static void deletePost(Post temp) {
		System.out.println("비밀번호 숫자 8자리를 입력해주세요");
		String tempPassword=UtilScanner.nextLine(sc,8);
		if(temp.getPassword().equals(tempPassword)) {
			System.out.println(temp.getId()+"번 게시물을 정말로 삭제하시겠습니까? Y/N");
			String yOrN=UtilScanner.nextLine(sc);
			if(yOrN.equalsIgnoreCase("y")) {
				pList.remove(temp);
				System.out.println("게시물이 삭제되었습니다.");
			}
		} else {
			System.out.println("비밀번호를 잘못 입력하셨습니다.");
		}
	}
	public static void updatePost(Post temp) {
		System.out.println("-------------------------------------------");
		System.out.println("비밀번호 숫자 8자리를 입력해주세요");
		String tempPassword=UtilScanner.nextLine(sc,8);
		if(temp.getPassword().equals(tempPassword)) {
			System.out.printf("제목을 입력해주세요");
			String tempTitle=UtilScanner.nextLine(sc);
			System.out.println("내용을 입력해주세요");
			String tempContent=UtilScanner.nextLine(sc);
			System.out.println("-------------------------------------------");
			pList.set(pList.indexOf(temp),new Post(temp.getId(),tempPassword,tempTitle,tempContent));
			System.out.println("게시물이 수정되었습니다.");
		} else {
			System.out.println("비밀번호를 잘못 입력하셨습니다.");
		}
	}
}