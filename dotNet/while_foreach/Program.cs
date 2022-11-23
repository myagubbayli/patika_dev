using System;

class Program {
    static void Main(string[] args) {
        System.Console.Write("Enter number: ");
        int number = int.Parse(Console.ReadLine());
        int counter = 1;
        int total = 0;

        while (counter <= number) {
            total += counter;
            counter++;
        }
        System.Console.WriteLine(total/number);
        
        char character = 'a';
        while(character < 'z') {
            System.Console.Write(character);
            character++;
        }
        System.Console.WriteLine();

        System.Console.WriteLine("****** FOREACH ******");
        string[] cars = {"BMW", "Ford", "Toyota", "Nissan"};

        foreach (var car in cars) {
            System.Console.WriteLine(car);
        }
    }
}