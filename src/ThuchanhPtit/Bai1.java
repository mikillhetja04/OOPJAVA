package ThuchanhPtit;
/*tìm số nhỏ nhất trong khoảng cách các dãy số sau
 * 
 */
import java.util.*;
public class Bai1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-- > 0) {
			String s = sc.nextLine();
			List<Integer> list = new ArrayList<>();
			String[] arr = s.split(" ");
			for(String str : arr) {
				list.add(Integer.parseInt(str));
			}
			if(list.size()<2) {
				System.out.println(0);
			}
			int minDes=100000;
			for(int i = 1; i < list.size(); i++) {
				minDes = Math.min(minDes, list.get(i)-list.get(i-1));
			}
			System.out.println(minDes);
		}
	}
}
