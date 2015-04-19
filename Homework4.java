/**
 * Name:陳信邦
 * ID: U10316009
 * Ex: 11.10
 */
import java.util.*;

public class Homework4{
	//main class
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		newMyStack NMS = new newMyStack();
		//把使用者輸入存進Arraylist
		for(int i = 0 ; i < 5 ; i++){
			System.out.print("Enter a string\n");
			String user = input.next();
			NMS.push(user);
		}
		//用迴圈將陣列印出
		while(!NMS.isEmpty()){
			System.out.print(NMS.pop() + " ");
		}
	}
}

class newMyStack extends ArrayList<Object>{
	//判斷是不是空的
	public boolean isEmpty(){
		return super.isEmpty();
	}
	//把資料放進ArrayList
	public void push(String o){
		super.add(o);
	}
	//取得陣列大小
	public int getSize(){
		return super.size();
	}
	//傳回最上層的元素
	public Object peek(){
		return super.get(getSize() - 1);
	}
	//取出資料後刪除
	public Object pop(){
		Object A = super.get(getSize()-1);
		super.remove(getSize()-1);
		return A;
	}
}
