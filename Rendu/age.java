class age {
  public static void main (String args[]) {
  int[] age ={45, 54, 23, 32, 64, 46, 28, 82};
  int i,j,ind,x ;
    


for (i=0; i<age.length ;i++){
ind=i;

for(j=i+1;j<age.length;j++){
if (age[j]> age[ind]) {
ind=j;
}
}
x=age[ind];
age[ind]=age[i];
age[i]= x;
}
for(i=0;i<age.length;i++){
System.out.println(age[i]);
}
}
}
 