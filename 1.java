import java.lang.*;
class Task1 implements Runnable
{
 public void run(){
int i;
for(i=1;i<=500;i++){
System.out.println(i);}
try{
Thread.sleep(200);}
catch(InterruptedException e){
System.out.print(e);}}}
class Task2 implements Runnable
{
 public void run(){
int i;
for(i=501;i<=1000;i++){
System.out.println(i);}
try{
Thread.sleep(200);}
catch(InterruptedException e){
System.out.print(e);} } }
class Main{
public static void main(String a[])throws Exception{
Task1 t1=new Task1();
Thread th1=new Thread(t1);
th1.start();
Task2 t2=new Task2();
Thread th2=new Thread(t2);
th1.join();
th2.start();
th1.join();}}