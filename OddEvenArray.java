public class OddEvenArray{  
public static void main(String args[]){  
int a[]={1,2,3,4,5};  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
System.out.println("odd numbers in array are"+a[i]);  
}  
}  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  
System.out.println("even numbers in array are:"+a[i]);  
}  
}  
}
}  
