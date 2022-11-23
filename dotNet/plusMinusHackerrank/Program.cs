using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Result
{

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<int> arr){
        float minus = 0f, plus = 0f, zero = 0f, total;
        foreach (var n in arr) {
            if (n < 0)
                minus += 1;
            else if (n > 0)
                plus += 1;
            else 
                zero += 1;
        }
        total = minus + plus + zero;
        System.Console.WriteLine((plus / total).ToString("0.000000"));
        System.Console.WriteLine((minus / total).ToString("0.000000"));
        System.Console.WriteLine((zero / total).ToString("0.000000"));
    }

}

class Solution
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> arr = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt32(arrTemp)).ToList();

        Result.plusMinus(arr);
    }
}