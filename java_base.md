## 基本数据类型

### 整数类型

- byte

  > 占用 1 个字节
  >
  > 值域是 -128 ~ 127

- short

  > 占用 2 个字节
  >
  > 值域是 -32768 ~ 32767

- int

  > 占用 4 个字节
  >
  > 整数的默认类型
  >
  > 值域是 -2 ^ 31 ~ 2 ^ 31 - 1，即 -2147483648 ~ 2147483647

- long

  > 占用 8 个字节
  >
  > 值域是 -9223372036854774808 ~ 9223372036854774807

### 浮点类型

- float

  > 占用 4 个字节
  >
  > 符合 IEEE 754 标准的浮点数

- double

  > 占用 8 个字节
  >
  > 浮点数的默认类型
  >
  > double 精度是 float 的两倍

### 布尔类型

- boolean

  > 占用 1 个字节，值域为 true，false

### 字符数据类型

- char

  > 占用 2 个字节，
  >
  > 值域是所有字符
  >
  > 字符串是双引号，字符为单引号

## 字符串

字符串不是 Java 中的基本数据类型

字符串不是 Java 中的基本数据类型的明显标志是 String 不是 Java 中的保留字

## bit 和 byte

一个二进制的位叫做一个 bit。网络带宽中的单位，都是 bit。

八个二进制的位组成一个byte。硬盘等存储的单位，都是 byte。

byte 是计算机中基本的衡量存储的单位，计算机在对外使用时不会用 bit 作为划分存储的单位。

## 运算符

两个 int 相加，结果类型为 int。

两个 byte 相加，结果类型为 int。

int / int 的结果类型为 int。

- 取模（求余）运算符 %

  > 浮点数也可以取模

- 布尔运算符

  > ! 、&、 &&、 |、 ||

### 位移运算符

- \>\>   符号位不动，其余为右移，符号位后边正数补零，负数补一，又称带符号右移。
- \>\>\>  符号位一起右移，左边补零，又称无符号右移。
- <<   左移，右边补零。左移没有带符号一说，因为符号位在左侧。

### 运算符的优先级

> [Java 运算符 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-operators.html) 

## 数据类型自动装换

- 自动类型转换

  > 不会出现问题的类型转换，编程语言可以做自动类型装换，比如低精度的数字向高精度的数字转换。
  >
  > 自动类型转换可以发生在算数运算，也可以发生在赋值运算

- 数值精度顺序

  > double > float > long > int > short > byte 

- char 可以转换为 int

  > char 可以转换为 int
  >
  > 虽然都是占据两个字节的存储空间，但因为 char 为无符号数，值域超出了 short 可以表示的范围，所以不可以自动转为 short 。

## 强制数据类型转换

- 强制类型转换

  > 可能出现问题的类型转换，需要使用强制类型转换，比如高精度数值向低精度数值转换。
  >
  > 强制类型转换也是操作符：语法为使用小括号括起来的目标类型放在被转换的值前面
  >
  > 强制转换会造成数据精度丢失

- 数值溢出

  > 数值计算一旦溢出，结果将失去原有的意义。比如，两个正数会加出负数。
  >
  > 要对能够处理的值有大概的估计。

- 与 C++ 等语言不同，Java 中并不能认为 1 为 true，0 为 false。另外在 int 和 boolean之间不能进行强制类型转换。 

## 编码与字符集

![编码与字符集](D:\Learn\零基础学Java_臧萌\Java_Base\md_images\编码与字符集.png)

## 作用域

> 内层代码块可以使用外层代码块的变量，但不可以声明与外层代码块同名的变量
>
> 外层代码块不能使用内层代码块声明的变量
>
> 同一个命名空间（代码块）中不能重复声明同名的变量

## 数组

> 数组有固定的长度
>
> 数组里的每个元素都有初始值，初始值与类型有关。对于数字类型，初始值为 0 。对于 boolean 类型，初始值为 false。
>
> 以二维数组为例，其实可以单独改变二维数组中某个子数组的长度。

```java
int[][] i2 = new int[3][4];
System.out.println(i2[2].length); // 4
i2[2] = new int[9];
for (int i = 0; i < i2.length; i++) {
	System.out.println(i2[i].length); // 4 4 9
}
```

## 引用类型

> 创建引用类型数组时，引用数组的元素会被赋引用类型的缺省值 null

> 以下内容属于我自己的理解，所以可能会有错

字符串、数组、类属于引用类型

Java 有一个堆内存用于存放引用的实例对象，在 Java 中每个实例都有其所属的类，类就相当于实例的模板。某个特定的类，它的实例需要多大的内存是固定的，这样更好进行堆内存的分配，这也是为何对一般的 Java 字符串（String 类）进行加法操作的时候，会新建对应的字符串，而不是在原有字符串的基础上进行直接操作。

```Java
public class Product {
    int count;		// 4 个字节
    double price;	// 8 个字节
    String name;	// 与安装的 JDK 有关，若为 32 位，则引用类型变量占用 4 个字节。若为 64 位，则引用类型变量占用 8 个字节。
}
```

## 访问修饰符

访问修饰符可用于类、静态方法、静态变量、成员方法、成员变量、构造方法

非 public 修饰的类，类名可以和文件名不同（使用当前包下的类则不需要引用）

java.lang.* 下的类不需要显式的 import

| 访问修饰符 | 权限                                                         |
| ---------- | ------------------------------------------------------------ |
| public     | public 修饰的成员变量，可以被任意包下该类的实例访问(全局可见) |
| default    | default 修饰的成员变量，只能被同一包下该类的实例访问(当前包可见) |
| private    | 只能被在该类中定义的方法的代码访问（当前类可见）             |

## Debug

> Step Over 执行一行

> Step Into  进入被调用的方法内部继续调试

> Step Out   执行到方法结束，返回到调用方法的地方

> Resume Program  跳至下一个断点，或者程序结束

> 选中代码，右键选中 Evaluate Expression，在对话框中可以输入任意的表达式，来修改变量的值

> 条件断点：给断点设置条件，只有满足条件时，程序才会在该断点处停止

## 面向对象的三大特性

### 封装

用类定义成员变量，并把操作成员变量的代码都放在类里，就是封装

> 可以集中管理，自己的成员变量别人不可以乱来，避免出现非法的状态，比如库存为负数
>
> 代码逻辑公用，避免代码重复
>
> 好的封装可以更好地抽象一类事物

### 多态

子类覆盖（重写）父类方法，从而实现同一个方法的不同行为

## 构造方法

> 构造方法的方法名必须与类名一致，而且构造方法没有返回值。
>
> 如果类中没有显式的添加一个构造方法，Java 会给每个类默认自带一个无参数的构造方法
>
> 如果我们自定义添加了类的构造方法，则 Java 不会再默认添加无参数的构造方法
>
> 构造方法无法被点操作符调用或者在普通方法里调用，只能通过 new 语句在创建对象时间接调用
>
> 构造方法不能有返回值，因为返回值没有意义，new 语句永远返回的是创建出来的对象的引用
>
> 在构造方法里，才能调用重载的构造方法，语法为**this(实参列表)**，在构造方法里调用重载的构造方法时，必须为方法的第一行
>
> 构造方法不能自己调用自己，这会是死循环
>
> 成员变量的定义和构造方法中的代码会被编进 <init> 方法中来执行，<init> 方法会先执行成员变量的初始化，再执行构造方法的代码

## 静态变量

静态变量命名：字母全大写，并以下划线分隔

### 访问静态变量

> 类名.静态变量名
>
> import static 导入静态变量或静态方法(新语法)

## 静态方法

静态方法也叫类方法，其特点是只能使用参数和静态变量，换言之，静态方法不能直接使用成员变量，也就是没有 this 自引用的方法

## 静态代码块

```java
public class Xxx {
    static {
    
	}
}
```

> 一个类中可以有任意多个静态代码块，按定义的顺序依次执行
>
> 静态代码块可以使用在其前面定义的静态变量，但若是仅仅进行赋值操作，则也可以访问在其后面定义的静态变量
>
> 静态代码块的执行时机：第一次用这个类进行 new 操作时执行静态代码块。导入类或用类定义变量不会触发类中静态代码块的执行
>
> 静态变量的定义和静态代码块中代码会被编进 <cinit> 方法中执行，cinit 即 class init

## StringBuilder

> StringBuilder 是一个非常方便的用来拼接和处理字符串的类，和 String 不同的是，StringBuilder 是可变的

## 继承

### 继承与组合

> 继承表达的是一种 "is-a" 的关系，也就是说，在类构造的世界中，"子类为父类的一种特殊类别"
>
> 组合表达的是一种 "has a" 的关系
>
> 组合和继承，即 "XX 到底是 YY 的一种，还是只是组合了 YY"，比如 "手机到底是手电筒的一种，还是组合了一个可以当手电的闪光灯？"
>
> 继承可以覆盖（重写）父类方法，组合则不可以

### super：子类与父类对象沟通的桥梁

子类对象里可以认为有一个特殊的父类对象，子类对象和父类对象之间通过 super 关键字进行沟通

注意 super 是子类与父类对象沟通的桥梁，但并不是一个父类实例的引用，在子类中只能通过 super.XXX 或 super() 来调用父类的方法、属性、构造器，而不能单独使用 super

> 在子类的方法中，可以 return this; 来返回自引用，但不能 return super;
>
> 通过 super() 调用父类构造方法时，super(); 必须是子类构造方法的第一个语句

### 子类的构造方法默认会自动调用父类无参数的构造方法 super()

​	![IDEA 查看类的继承关系](D:\Learn\零基础学Java_臧萌\Java_Base\md_images\IDEA 查看类的继承关系.jpg)

### 父类和子类的引用的赋值关系

> 父类的引用可以指向子类的对象，反之则不行，不能让子类的引用指向父类的对象
>
> 因为子类继承了父类的方法和属性，所以父类对象能做到的，子类的对象肯定能做到，即我们可以在子类的对象上执行父类的方法

```java
TestFather testF = new Test(); // OK
Test test = new TestFather(); // Error
```

> 若父类的引用指向子类的实例，则父类的引用只能像访问父类对象一样使用子类对象
>
> 能调用哪些方法，是引用决定的，具体执行哪个类的方法，是引用指向的对象决定的：**（需要重点理解，源代码参考 2-40 ）**
>
> ​	0、这就是覆盖的精髓，覆盖是多态中最重要的一种
>
> ​	1、引用的类型决定了可以执行哪些操作（即可以调用哪些方法）
>
> ​	2、而具体调用的是子类覆盖父类的方法，还是父类自己的方法则由被引用的对象决定（若被引用的对象为子类实例则为前者，被引用的对象为父类实例则为后者，多级继承亦是如此）（若一个方法没有被其子类覆盖，则子类对象调用的方法自然是在父类中定义的，简单点说就是子类对象调用某一方法时，优先在子类中，若没有对应的方法，则依次到其父类中找）
>
> ![多态：到底调用的是那个方法](D:\Learn\零基础学Java_臧萌\Java_Base\md_images\多态：到底调用的是那个方法.jpg)

```java
// Test 类继承 TestFather 类
// Test 类和 TestFather 类都有成员变量 name
// Test 类覆盖（重写）了 describe 实例方法
// Test 类独有 testSoloName 属性和 testSoloDescribe 方法
Test test = new Test();
test.name = "test";
test.testSoloName = "testSoloName";
test.describe();
test.testSoloDescribe();

TestFather testF = new Test();
testF.describe();  // 这里会调用 Test 类对象的 describe 方法，而不是其父类的 describe 方法
testF.testSoloDescribe();  // Error
((Test) testF).testSoloDescribe();
testF.name = "test";  // 实际上该语句修改的是父类对象上的 name 属性，而不是子类对象上的 name 属性
testF.testSoloName = "testSoloName";  // Error
((Test) testF).testSoloName = "testSoloName";
```

