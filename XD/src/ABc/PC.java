package ABc;

class PC{
CPU cpu;
HardDisk HD;
void setCPU(CPU c){
cpu=c;
}
void setHardDisk(HardDisk h){
HD=h;
}
void show(){
System.out.println("CPU�ٶ�:"+cpu.getSpeed());
System.out.print("Ӳ������:"+HD.getAmount());
}
}