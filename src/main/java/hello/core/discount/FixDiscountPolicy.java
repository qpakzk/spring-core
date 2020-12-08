package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    private final MemberService memberService = new MemberServiceImpl();

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? discountFixAmount : 0;
    }
}
