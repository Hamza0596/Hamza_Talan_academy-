class epeecollegues{
public static void main(String[] args){
String[] pernoms= {"alban","jim","bob","seb","teilo","charles","xavier"};
int i,j, indice;
String x;

for(i=0;i<pernoms.length-1;i++){
for(j =pernoms.length-1;j>i ; j--){

indice=0;
while(indice<Math.min(pernoms[j-1].length(),pernoms[j].length())){

if (pernoms[j].charAt(indice)<pernoms[j-1].charAt(indice)){
x=pernoms[j];
pernoms[j]=pernoms[j-1];
pernoms[j-1]=x;
indice=Math.min(pernoms[j-1].length(),pernoms[j].length());
}

else if(pernoms[j].charAt(indice)>pernoms[j-1].charAt(indice)){
indice=Math.min(pernoms[j-1].length(),pernoms[j].length());
}

else {
indice++;
}
}
}
}

for(i=0;i<pernoms.length;i++){
System.out.println(pernoms[i]);
}
}
}