package com.kaesar.sword2offer;

/**
 * 标题：不用加减乘除做加法
 * 题目描述
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * 题目链接：
 * https://www.nowcoder.com/practice/59ac416b4b944300b617d4f7f111b215?tpId=13&&tqId=11201&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz48 {

  /**
   * a ^ b 表示没有考虑进位的情况下两数的和，(a & b) << 1 就是进位。
   * 递归会终止的原因是 (a & b) << 1 最右边会多一个 0，那么继续递归，进位最右边的 0 会慢慢增多，最后进位会变为 0，递归终止。
   */
  public int add(int num1, int num2) {
    return num2 == 0 ? num1 : add(num1 ^ num2, (num1 & num2) << 1);
  }

  public static void main(String[] args) {
    Jz48 jz48 = new Jz48();
    System.out.println(jz48.add(2, 6));
  }
}
