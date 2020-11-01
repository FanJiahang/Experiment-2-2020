# Experinment-2-2020
## 实验二
# 实验内容
 用类描述计算机中CPU的速度和硬盘的容量

#实验要求
  CPU 类 要求 getSpeed()返回 speed 的值，要求 setSpeed(int m)方法将参数 m 的值 赋值给 speed。 spa
HardDisk 类 要求 getAmount()返回 amount 的值， 要求 setAmount(int m)方法将 参数 m 的值赋值给 amount。code
PC 类 要求 setCPU(CPU c)将参数 c 的值赋值给 cpu，要求 setHardDisk(HardDisk h)方法将参数 h 的值赋值给 HD， 要求 show()方法能显示 cpu 的速度和 硬盘的容量。
对象
 主类 Test 的要求 （1） main 方法中建立一个 CPU 对象 cpu，cpu 将本身的 speed 设置为 2200； blog
（2） main 方法中建立一个 HardDisk 对象 disk，disk 将本身的 amount 设置为 200； get
（3） main 方法中建立一个 PC 对象 pc； class
（4） pc 调用 setCPU(CPU c)方法，调用时实参是 cpu； 程序
（5） pc 调用 setHardDisk(HardDisk h)方法，调用时实参是 disk; 方法
（6） pc 调用 show()方法。
#实验过程
  创建一个package命名为shiyan，在其中分别创建CPU,PC,HardDisk,Test类
  CPU class中使用 getSpeed() 返回了speed的值
  PC class中参数c的值，通过setCPU（CPU c）的方法赋值给了CPU
  HardDisk class中运用setAmount(int m)的方法将m的值赋给amount
  Test class中将CPU的速度设置为2200
                    将disk的amount设置为200
  pc分别调用出setCPU（CPU c）、setHardDisk（HardDisk）方法，实参分别为cpu、disk
  pc再次调用show（）方法
#实验结果
CPU的速度是2200
硬盘的容量是200

#核心代码
  	int speed;
	int getSpeed(){
	return speed;
	}
	void setSpeed(int m){
	speed=m;
	}

  	void setCPU(CPU c){
	cpu=c;
	}
	void setHardDisk(HardDisk h){
	HD=h;
	}

  CPU cpu=new CPU();
HardDisk disk=new HardDisk();
cpu.setSpeed(2200);
disk.setAmount(200);
PC pc=new PC();
pc.setCPU(cpu);
pc.setHardDisk(disk);
pc.show();

  	int amount;
	int getAmount(){
	return amount;
	}
	void setAmount(int m){
	amount=m;
	}
#实验感想
  通过这次实验,我初步掌握了类中定义的构造方法，以及定义类的属性
  在实验中也遇到了一些困难，但是在查看教材111页研究PC与CPU和HardDisk的关联UML图后，我掌握了他们三者间的关系，排除了实验中的错误，完成了这次实验
