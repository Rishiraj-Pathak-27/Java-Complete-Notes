# Strings Interning & New In Java

In Strings we use the interning to save the space of the intern pool & use the memory efficiently.

## Interning

```
Eg 1. String str = "Hello";
      String gtr = "Hello";
```

Both will point to same memory as both the words are same.

``` 
Eg 2. String str = "Hello";
      String get = "Mello";
```

As both the words are different it will points to 2 different memories.


## New 

We use new keyword to make different memory location to the same word intentionally.

```
Eg 3. String s = "Hello";
      String x = new String("Hello");
```

Here Both the strings will point towards different memory locations.

```
Eg 4. String s = "Hello";
      String x = "Hello";
      x = "Mello";
```

In this case before `x = "Mello"` both the s & x are pointing to same locations in intern pool, But as the x changes to "Mello" the pointer of x changes from `x = "Hello"` --> `x = "Mello"` and hence new memory location is created.


