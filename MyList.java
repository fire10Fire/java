package javaapplication4;


import java.util.Arrays;

public class MyList<E> {
    private E[] elements;

    private int CAPACITY = 10;
    private int size =0;
    
    public MyList() {
    
        this.elements=(E[])new Object[10];
   
    }

    public MyList(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.elements = (E[]) new Object[CAPACITY];
    }

    public int getCAPACITY() {
        return CAPACITY;
    }
    public void add(E a){
        //if(size>=elements.length){}
        elements[size]=a;
        size++;
        if((size)==elements.length){
            addCapacity();
        }
        }
    public void addCapacity(){
    this.CAPACITY=CAPACITY*2;
    E[] newElements=(E[])new Object[CAPACITY];
    for(int i=0;i<elements.length;i++){
        newElements[i]=elements[i];
    }
    this.elements= newElements;
//(E[])new Object[CAPACITY];
   
    }
    public int size(){
        return this.size;
    }
    public E  get(int index){
        if(index<0&&index>(elements.length)){
            return null;}
        else
        return elements[index];
    }
    public void remove (int index){
        E giden= elements[index];
        elements[size]=null;
    for(int i=0;i+index+1<size;i++){
        elements[index+i]=elements[index+1+i];
    }
        this.size=size-1;
        System.out.println("");
        System.out.println(giden+"'elemanı diziden çıkarılmıştır. ");
    }

   
    @Override
    public String toString(){
        String liste ="[";
            int sayac=1;
        for(E a:elements){
            if(a!=null&&sayac==1){
                liste=liste+a;
            }
            else if(a!=null&&sayac!=1){
              liste+=","+a;
            }
            sayac++;
        }
            liste+="]";
            
        return liste;
    }
     public void set(int index,E e){
     if(index<0||index>=this.size){
         System.out.println("null");
     }   else
         elements[index]=e;
     }
      public int indexOf(E data){
      int sonuc=-1;
      for(E eleman:elements){
          sonuc++;
          if(eleman==data){
          return sonuc;
          }
      }
      return -1;}
      public int lastIndexOf(E data){
      int sonuc=-1;
      int son=-1;
      for (E eleman:elements){
          sonuc++;
          if(eleman==data){
            son=sonuc;
          }
      }
      return son;
      }
      public boolean isEmpty(){
      if(size==0){
          return true;
      }
      return false;
      }
      public E[] toArray(){
          E[] array= (E[]) new Object[size];
          for(int i=0;i<size;i++){
          array[i]=elements[i];
          }
          return array;
      }
      public void clear(){
          for(int i=0;i<size;i++){
         elements[i]=null;
          }
        this.size=0;
      }
      public MyList<E> subList(int start,int finish){
          MyList<E>  myList = new MyList<>();
          if(start>=0&&finish<size){
          for(int i=start;i<=finish;i++){
             myList.add(this.get(i));
          }
          }
          return myList;
      }
      public boolean contains(E data){
      for(E a:elements){
          if(a==data)
              return true;
      }
      return false;}
    
}
    
    