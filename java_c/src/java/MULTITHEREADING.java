package java;

public class MULTITHEREADING {

	public MULTITHEREADING() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		class Table{
			synchronized void printTable(int n) {
				for(int i=1;i<=5;i++) {
					System.out.println(n*i);
					try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}
			}	
			
		}

		public class MULTITHEREADING {
			public static void main(String[] args) {
				
				Table t = new Table();
				
				Thread t1 = new Thread() {
					public void run() {
						t.printTable(5);
					}
				};
				
				Thread t2 = new Thread() {
					public void run() {
						t.printTable(10);
					}
				};
				
				t1.start();
				t2.start();
			}
		}
   
	}

}
