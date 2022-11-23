using System;

class Program {
    static void Main(string[] args) {
        int time = DateTime.Now.Hour;
        System.Console.WriteLine(time);

        if (time >= 6 && time < 11) 
            System.Console.WriteLine("Good Morning!");
        else if (time <= 18)
            System.Console.WriteLine("Good days!");
        else 
            System.Console.WriteLine("Good nights!");

        string result = time <= 18 ? "Good days!" : "Good night!";

        result = time >= 6 && time < 11 ? "Good Morning!" : time <= 18 ? "Good Days!" : "Good night!";

        System.Console.WriteLine(result);
    }
}