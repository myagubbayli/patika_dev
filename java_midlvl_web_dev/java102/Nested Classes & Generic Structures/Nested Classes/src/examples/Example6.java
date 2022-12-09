package src.examples;

public int add(int... numbers) {
	int sum = 0;
	for (int number : numbers)
	{
		sum += number;
	}
	return sum;
}

public double add(double... numbers) {
	double sum = 0.0;
	for (double number : numbers)
	{	
		sum += number;
	}
	return sum;
}

System.out.println(add(5, 4, 3)); // Konsola 12 yazar
System.out.println(add(9.0, 8.5, 8.0)); // Konsola 25.5 yazar
