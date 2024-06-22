/*
 * public class BalanceHtml { private int top; private char[] arr;
 * 
 * public BalanceHtml() { top = -1; arr = new char[10]; }
 * 
 * public boolean isEmpty() { if (top == -1) return true; else return false; }
 * 
 * public boolean isFull() { if (top == arr.length - 1) return true; else return
 * false; }
 * 
 * private boolean match(char p1, char p2) { if (p1 == '[' && p2 == ']') return
 * true; if (p1 == '{' && p2 == '}') return true; if (p1 == '(' && p2 == ')')
 * return true; return false; }
 * 
 * public void checkExp(String exp) { CharStack st = new CharStack(); String
 * ch1, ch2; char ch; for (int i = 0; i < (exp.length()); i++) {
 * 
 * ch = exp.charAt(i);
 * 
 * System.out.println(ch1); if (ch1 == "<html>" || ch1 == "<p>" || ch1 ==
 * "<div>") {
 * 
 * st.push(ch1); System.out.println("push" + ch1); } if (ch1 == '}' || ch1 ==
 * ']' || ch1 == ')') { if (st.isEmpty()) return; ch2 = st.pop();
 * System.out.println("pop " + ch2); if (!(match(ch2, ch1))) {
 * System.out.println("mimatch"); }
 * 
 * } } if (st.isEmpty()) System.out.println("Balance and valid"); else
 * System.out.println("not valid....");
 * 
 * }
 * 
 * }
 */