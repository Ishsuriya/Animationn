package patterns;
public class Patterns {
    public static void main(String[] args) {
        
        /* 
        for(int row=1;row<=5;row=row+2){
          for(int i=1;i<=5;i++){
            System.out.print(row+" ");
          }
       
        System.out.println();
        }
      
       for(int row=1;row<=1;row++){
       for(int col=1;col<=12;col++){
           System.out.print(col+"\t");
           if(col%3==0)
           {
            System.out.println();
           }
       }  
    }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*"+"  ");
        }
            System.out.println();
        }
         for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*"+"  ");
        }
            System.out.println();
        }*/
            for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if(j==1||(j==2&&i==2)||(i==2&&j==4)||(j==3&&i==3)||j==5){
                      System.out.print("M ");
                 }
                 else{
                     System.out.print("  ");
                 }
               }
             System.out.println();
            }
         System.out.println();
         for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==5||j==3){
                    System.out.print("I ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            }
        System.out.println();
        
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if(i==1||(i==2&&j==1)||i==3||(j==5&&i==4)||i==5){
                     System.out.print("S ");
                 }
                 else{
                     System.out.print("  ");
                 }
             }
                 System.out.println();
         } 
         System.out.println();
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if(j==1||i==3||j==5){
                     System.out.print("H ");
                 }
                 else{
                     System.out.print("  ");
                 }
             }
                 System.out.println();
             }
            System.out.println();
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if(i==1||i==3||i==5||(j==1&&i==2)||(j==5&&i==4)){
                     System.out.print("S"+" ");
                 }
                 else{
                     System.out.print("  ");
                 }
             }
             System.out.println();
             }
         System.out.println();
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if(i==5||j==1||j==5){
                     System.out.print("U"+" ");
                 }
                 
                 else{
                 System.out.print("  ");
             }
         }
             System.out.println();
         }
         System.out.println();
        
         
         for(int i=1;i<=6;i++){
             for(int j=1;j<=5;j++){
                 if(i==1||j==1||i==3||(j==5&&i==2)||(j==3&&i==4)||(j==4&&i==5)||(j==5&&i==6)){
                     System.out.print("R"+" ");
                 }
                 
                 else{
                 System.out.print("  ");
             }
         }
             System.out.println();
         }
          System.out.println();
        for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if(i==1||i==5||j==3){
                     System.out.print("I"+" ");
                 }
                 
                 else{
                 System.out.print("  ");
             }
         }
             System.out.println();
         }
        System.out.println();
    
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if((i==1&&j==1)||(i==1&&j==5)||(i==2&&j==2)||(i==2&&j==4)||(j==3&&i==3)||(j==3&&i==4)||(j==3&&i==5)){
                     System.out.print("Y"+" ");
                 }
                 
                 else{
                 System.out.print("  ");
             }
         }
             System.out.println();
         }
         System.out.println();
         
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
                 if((i==1||i==3||j==1||j==5)){
                     System.out.print("A ");
                 }
                 
                 else{
                 System.out.print("  ");
             }
         }
             System.out.println();
         }
         
}
}
    


    

  

    

