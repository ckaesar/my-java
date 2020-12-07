package com.kaesar.sword2offer;

/**
 * 标题：翻转单词顺序列
 * 题目描述
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
 * 但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * 题目链接：
 * https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?tpId=13&&tqId=11197&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz44 {

  public String reverseSentence(String str) {
    int n = str.length();
    char[] chars = str.toCharArray();
    int i = 0, j = 0;
    while (j <= n) {
      if (j == n || chars[j] == ' ') {
        reverse(chars, i, j - 1);
        i = j + 1;
      }
      j++;
    }
    reverse(chars, 0, n - 1);
    return new String(chars);
  }

  private void reverse(char[] c, int i, int j) {
    while (i < j)
      swap(c, i++, j--);
  }

  private void swap(char[] c, int i, int j) {
    char t = c[i];
    c[i] = c[j];
    c[j] = t;
  }
}