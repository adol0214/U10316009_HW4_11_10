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
