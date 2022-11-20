# Proje 3

**[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]** dizisinin Binary-Search-Tree aşamalarını yazınız.

**Örnek:** root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

Bu projede `root` olarak `5` i seçelim. Bundan sonra listenin elemanı olarak 7, 5-den büyük olduğu için 5-in sağına gelecek.             
```
             5          
              \
               \
                \
                 \
                  7       
```
Sonrasında 1, 5-den küçük olduğu için 5-in soluna gelecek.    
```         
             5          
            / \
           /   \
          /     \
         /       \
        1         7       
```
Sonrasında 8, 5-den büyük olduğu için 5-in sağına geçecek, 7-den büyük olduğu için de sağına yazılacak.      
```       
             5          
            / \
           /   \
          /     \
         /       \
        1         7       
                   \
                    \
                     8    
```
Sonrasında 3, 5-den küçük olduğu için 5-in soluna geçecek, 1-den büyük olduğu için de sağına yazılacak.  
```          
             5          
            / \
           /   \
          /     \
         /       \
        1         7       
         \         \
          \         \
           3         8    
```
Sonrasında 6, 5-den büyük olduğu için 5-in sağına geçecek, 7-den küçük olduğu için de soluna yazılacak.
```             
             5          
            / \
           /   \
          /     \
         /       \
        1         7       
         \       / \
          \     /   \
           3   6     8    
```
Sonrasında 0, 5-den küçük olduğu için 5-in soluna geçecek, 1-den küçük olduğu için de soluna yazılacak.
```
             5          
            / \
           /   \
          /     \
         /       \
        1         7       
       / \       / \
      /   \     /   \
     0     3   6     8    
```
Sonrasında 9, 5-den büyük olduğu için 5-in sağına geçecek, 7-den büyük olduğu için de sağına geçecek. 8-den de büyük olduğu için sağına yazılacak.
```
             5          
            / \
           /   \
          /     \
         /       \
        1         7       
       / \       / \
      /   \     /   \
     0     3   6     8    
                      \
                       \
                        9
```
Sonrasında 4, 5-den küçük olduğu için 5-in soluna geçecek, 1-den büyük olduğu için sağına geçecek. 3-den de büyük olduğu için sağına yazılacak.
```
             5          
            / \
           /   \
          /     \
         /       \
        1         7       
       / \       / \
      /   \     /   \
     0     3   6     8    
            \         \   
             \         \
              4         9
```
