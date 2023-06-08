package Controller;

import java.util.Scanner;

public class Controller {

    Scanner sc ;

    public void remoteOrigin(){

        System.out.println("1. 관리자 로그인  , 2. 일반 로그인  3. 회원 가입");
        int mode=Integer.parseInt(sc.nextLine());
        if(mode==1){

            AdminRemote();

        }
        else if (mode==2) {
            //TODO 일반 커맨드
            // Remote
            // 1.구매하기 => 물품 리스트출력  -> 잔고가 없으면 잔고 없음 알림   => 있으면 쿼리문
            // 2.구매 내역 확인
//             3. DB X 자바 메모리에다 (장바구니 담기) List<물품>
//             4. 충전하기  select+INSERT   money=10000    Insert  set money=money+넣고싶은값;
            //

        } else if (mode==3) {
            //ToDo 회원가입 로직
        }
    }

    public void AdminRemote(){
        System.out.println("1. 발주넣기 , 2. 재고 현황 보기 . 3. 고객 회원 정보 확인");
        int mode=Integer.parseInt(sc.nextLine());

        if(mode==1){
            //TODO 발주넣기
        }
        else if (mode==2) {
            //TODO 재고 현황 보기


        } else if (mode==3) {
            //ToDo 고객 회원 정보 확인
        }
    }

    public void menu(){
        System.out.println("1. 구매하기 , 2. 구매 내역 보기");
        int mode=Integer.parseInt(sc.nextLine());

        if(mode==1){
            //TODO 발주넣기
        }
        else if (mode==2) {
            //TODO 재고 현황 보기
        }
    }

}
