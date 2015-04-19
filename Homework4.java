class newMyStack extends ArrayList<Object>{
	public boolean isEmpty(){
		return super.isEmpty();
	}
	public void push(String o){
		super.add(o);
	}
	public int getSize(){
		return super.size();
	}
	public Object peek(){
		return super.get(getSize() - 1);
	}
	public Object pop(){
		Object A = super.get(getSize()-1);
		super.remove(getSize()-1);
		return A;
	}
}
