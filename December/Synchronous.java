package MutliThreading;
class Table {
	void printTheTable(int n) {
		synchronized(this) {
			for(int i = 1; i <= 10; i++){
				System.out.println(n+" * "+i+" = "+(n*i));
				try{
					Thread.sleep(1000);
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
			System.out.println("\n");
		}
	}
}

class TableThreading extends Thread {
	Table t;
	int num;
	TableThreading(Table t, int num){
		this.t = t;
		this.num = num;
	}
	public void run(){
		t.printTheTable(num);
	}
}

public class Synchronous  {
	public static void main(String[] args) {
		Table TBLE = new Table();
		TableThreading TT1 = new TableThreading(TBLE, 4);
		TT1.start();
		
		TableThreading TT2 = new TableThreading(TBLE, 3);
		TT2.start();
		
		TableThreading TT3 = new TableThreading(TBLE, 7);
		TT3.start();
	}
}
