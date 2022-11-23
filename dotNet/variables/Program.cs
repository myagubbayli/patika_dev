// Variable conversions
string str20 = "20";
int int20 = 20;
string newValue = str20 + int20.ToString();
Console.WriteLine(newValue); // Output 2020

int int21 = int20 + Convert.ToInt32(str20);
Console.WriteLine(int21); // Output 40

int int22 = int20 + int.Parse(str20); // Output 40

// Datetime
string datetime = DateTime.Now.ToString("dd.MM.yyyy");
Console.WriteLine(datetime);

string datetime2 = DateTime.Now.ToString("dd/MM/yyyy");
Console.WriteLine(datetime2);

// time
string hour = DateTime.Now.ToString("HH:mm");
Console.WriteLine(hour);