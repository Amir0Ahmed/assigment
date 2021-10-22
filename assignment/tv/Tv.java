package tv;


public class Tv {
  
     public static int channel;
   public static  int volumelevel;
  public static  boolean on;
    public static int thecurrentvolume=1;
    public static int thecurrentchannel=1;
   
  
    
    Tv(){
        on=true;
         if (channel>=1&&channel<=120){
              thecurrentchannel =channel ; 
         }
         if (volumelevel>=1&&volumelevel<=7){
              
              thecurrentvolume=volumelevel;
        }
 
           
        }
 public static void turnoff(){
     on=false;
 }
 public static void turnon(){
     on=true;
 }
 public static void ison(){
     if(on== true){
     System.out.println("tv is on");
 }
 }
      public static void isoff(){
     if(on== false){
     System.out.println("tv is off");
 }
 
 }
  public static void setchannel(int newchannel){
        
      if(newchannel>=1&&newchannel<=120){
      }
      thecurrentchannel =newchannel;
          channel=thecurrentchannel;
          
  
  }
  public static void setvolume(int newvolume){
        
      if(newvolume>=1&&newvolume<=7){
      }
        thecurrentvolume =newvolume;
          volumelevel=thecurrentvolume;
      
  }
  public static void channelup(){
        
      if(thecurrentchannel<=119)
       
      {   
          channel=thecurrentchannel;
  channel++;
      }
  }
      public static void channeldown(){
        
      if(thecurrentchannel>=0)
       
      {   
          channel=thecurrentchannel;
  channel--;
      }
  
}
       public static void volumeup(){
        
      if(thecurrentvolume<=6)
       
      {   
          volumelevel=thecurrentvolume;
  volumelevel++;
      }
  }
       public static void volumedown(){
        
      if(thecurrentvolume>=0)
       
      {   
          volumelevel=thecurrentvolume;
  volumelevel--;
      }
  }
       public static void printchannelnumper(){
           System.out.println(" the channel="+channel);
       }
       public static void printvolumenumper(){
           System.out.println(" the volume="+volumelevel);
       }


public static void main(String[] args){

Tv.setvolume(5);
Tv.volumedown();
Tv.printvolumenumper();
}
}
        