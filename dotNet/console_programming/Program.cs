using System;

namespace console_programming {
    class Program {
        public static void Main(string[] args) {
            Console.WriteLine("Hello world!");
            Console.WriteLine("Give your name: ");
            string name = Console.ReadLine();
            Console.WriteLine("Give your surname: ");
            string surname = Console.ReadLine();

            Console.WriteLine("Hello " + name + " " + surname);
        }
    }
}