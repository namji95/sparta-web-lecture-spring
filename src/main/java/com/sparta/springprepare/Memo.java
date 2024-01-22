package com.sparta.springprepare;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Memo {
    private String username;
    private String contents;

}

/**
 * @Getter : 모든 필드의 getter를 만들어 주는 어노테이션
 * @Setter : 모든 필드의 setter를 만들어 주는 어노테이션
 * @AllArgsConstructor : 모든 필드의 생성자를 만들어 주는 어노테이션
 * @NoArgsConstructor : 기본 생성자를 만들어 주는 어노테이션
 * @RequiredArgsConstructor : 요구되는(final을 가지는) 필드들을 가지는 생성자
 * 클래스 내부 필드들에 접근하기 위해서
 * 메서드로 접근해야 함
 * 그래서 필요한 메서드가 getter, setter 메서드
 * 예시는 밑
 */
//class Main {
//    public static void main(String[] args) {
//        Memo memo = new Memo();
//        memo.setUsername("namji");
//        memo.setContents("my name is ");
//        System.out.println(memo.getContents() +
//                memo.getUsername());
//    }
//}