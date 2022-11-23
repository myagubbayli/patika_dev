using System;

class Program {
    static void Main(string[] args) {
        int month = DateTime.Now.Month;

        switch (month) {
            case 1:
                System.Console.WriteLine("In january");
                break;
            case 2:
                System.Console.WriteLine("In february");
                break;
            case 11:
                System.Console.WriteLine("In november");
                break;
            default:
                System.Console.WriteLine("Non correct info!");
                break;
        }

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.Console.WriteLine("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.Console.WriteLine("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.Console.WriteLine("Autumn");
                break;
            case 9:
            case 10:
            case 11:
                System.Console.WriteLine("Summer");
                break;
            default:
                System.Console.WriteLine("Non correct info!");
                break;
        }
    }
}