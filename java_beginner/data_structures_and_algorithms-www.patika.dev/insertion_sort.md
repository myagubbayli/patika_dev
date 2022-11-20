# Proje 1

**[22,27,16,2,18,6]** -> Insertion Sort

1. **Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.**
   1. [2,27,16,22,18,6] - `2` dizinin en küçük elemanıdır, `22` ile yer değiştirir.
   2. [2,6,16,22,18,27] - İkinci küçük sayımız `6` dır, `27` ile yer değiştirir.
   3. [2,6,16,18,22,27] - Üçüncü küçük sayı `16` dır, yeri doğru olduğundan dolayı değişiklik gerektirmez. Dördüncü sayı `18` dir `22` ile yer değiştirir. En son olarak `22` ve `27` doğru yerlerindedirler, değişiklik gerektirmez.

------

2. **Big-O gösterimini yazınız.**

   Dizide n tane eleman olduğunu varsayarsak:

   1. [`2,`27,16,22,18,6] - n tane işlem yapılacaktır.
   2. [`2,6,`16,22,18,27] - n-1 tane işlem yapılacaktır.
   3. [`2,6,16,`18,22,27] - n-2 tane işlem yapılacaktır.
   4. [`2,6,16,18`,22,27] - n-3 tane işlem yapılacaktır.
   5. [`2,6,16,18,22,`27] - n-4 tane işlem yapılacaktır.

   En son dizinin altıncı elemanına geldiğimiz için işlemlerin devam etmesine gerek yoktur. Bu dizi için takip edilmesi gereken işlem yapısı yukarıdaki sonuçları göz önünde bulundurarak - `n+(n-1)+(n-2)+(n-3)+(n-4)+...+1`den (n²+n)/2 elde edilir. Burada:

   `Burada Big-O gösterimimiz n² dir. O(n²)`

------

3. **Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız**
   1. **Average case: Aradığımız sayının ortada olması**
   2. **Worst case: Aradığımız sayının sonda olması**
   3. **Best case: Aradığımız sayının dizinin en başında olması.**

​	[2,6,16,**18**,22,27] dizimize bakılırsa, aradığımız 18 sayısı dizinin ortasında yer almaktadır. Bu da bize **Average case** sonucunu veriyor.

------

4. **[7,3,5,8,2,9,4,15,6**] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

​	Dizide n tane eleman olduğunu varsayarsak:

​		1. [**2**,3,5,8,7,9,4,15,6]

​		2. [2,**3**,5,8,7,9,4,15,6]

​		3. [2,3,**4**,8,7,9,5,15,6]

​		4. [2,3,4,**5**,7,9,8,15,6]
