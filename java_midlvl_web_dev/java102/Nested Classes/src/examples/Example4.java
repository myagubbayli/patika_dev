package src.examples;

public class Example4 {
	private int number = 10;
	
    public void run() {
		System.out.println(number);
        
		Inner inner = new Inner();
		inner.run();
        
		System.out.println(number);
	}

    static class Inner {
		public void run()
		{
			// number++; // This line causes the error
		}
	}
}

