using System;

class Program {
    static void Main(string[] args) {
        //System.Console.WriteLine("Please give a number: ");
        //int counter = int.Parse(Console.ReadLine());
//
        //for (int i = 1; i <= counter; i++) {
        //    if (i % 2 == 1) 
        //        System.Console.WriteLine(i);
        //}
//
        //int oddTotal = 0;
        //int evenTotal = 0;
//
        //for (int i = 1; i <= 1000; i++) {
        //    if (i % 2 == 1)
        //        oddTotal += i;
        //    else 
        //        evenTotal += i;
        //}
//
        //System.Console.WriteLine("Odd total: " + oddTotal);
        //System.Console.WriteLine("Even total: " + evenTotal);

        for (int i = 1; i < 10; i++) {
            if (i == 4) 
                break;
            System.Console.WriteLine(i);
        }
        for (int i = 1; i < 10; i++) {
            if (i == 4)
                continue;
            System.Console.WriteLine(i);
        }
    }
}