# head-first-java

## Chapter 2: classes and objects 


![classes_and_objects_overriden](https://user-images.githubusercontent.com/80622894/123913829-41203280-d9b1-11eb-8acb-9237c4f89c51.PNG)

## Chapter 3: primitive types (BCBSILFD)

### 8 primitive types
boolean char byte short
int long float double

### Reserved words
boolean byte char double float int long 
protected abstract final native statis stictfp synchronized
else do while switch case default for
class extends implementes import instanceof interface new
catch finally try throw throws return void

### Heap
```java
Book b = new Book();
Book c = new Book();
b = c;

Active references : 2
Reachable objects : 1
Abandoned objects : 1
```

## Chapter 4: Methods use Instance Variables

### Class
- A class describes what an object knows (instane variable) and what an object does (methods)
![image](https://user-images.githubusercontent.com/80622894/124459239-89c85900-ddc0-11eb-8119-adcbd1369585.png)


### Method
- A method uses paramters. A caller passes arguments
- You can send > 1 thing to a method by:
  1. Calling a 2 parameter method and sending it 2 arguments OR
  2. Pass varilables into a method, as long as the varirable types matches the paratmeter type
- Java is pass-by-value. That means pass-by-copy
- A method must declare a return type -> non-void return  -> must return a value compatible with the declared return type
- A method without without return type ->  void return

### Encapsulation

### Hide the data (Access modifiers)
1. public
2. private
3. public 
