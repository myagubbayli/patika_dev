using System;

class Program {
    static void Main(string[] args) {
        string[] colors = new string[5];

        string[] animals = {"Cat", "Dog", "Bird", "Monkey"};

        int[] series;
        series = new int[5];

        colors[0] = "Blue";
        series[3] = 10;

        System.Console.WriteLine(animals[1]);
        System.Console.WriteLine(series[3]);
        System.Console.WriteLine(colors[0]);

        System.Console.Write("Enter numbers");
        int seriesLength = int.Parse(Console.ReadLine());
        int[] numberSeries = new int[seriesLength];

        for (int i = 0; i < seriesLength; i++) {
            System.Console.Write("Please enter {0} number: ", i + 1);
            numberSeries[i] = int.Parse(Console.ReadLine());
        }

        int total = 0;

        foreach(var number in numberSeries) {
            total += number;
        }
        System.Console.WriteLine("Average: " + total/seriesLength);
    }
    
}