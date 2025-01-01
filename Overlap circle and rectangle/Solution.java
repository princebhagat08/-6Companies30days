class Solution {

    public static boolean checkOverlap(int r, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if(xCenter <= x1 ){
            if(yCenter <= y2 && yCenter >= y1){
                 if(r*r >= (xCenter - x1)*(xCenter - x1)) return true;
                 else return false;
            }else{
                if(yCenter >= y1){
                    if(r*r > ((xCenter-x1)*(xCenter-x1) + (yCenter- y2)*(yCenter - y2) )) return true;
                    else return false;
                }else{
                     if(r*r >= ((xCenter-x1)*(xCenter-x1) + (yCenter- y1)*(yCenter - y1) )) return true;
                    else return false;

                }
            }
            

        }else if(xCenter >= x2 ){
            if(yCenter <= y2 && yCenter >= y1){
                if(r*r >= (xCenter - x2)*(xCenter - x2)) return true;
                else return false;
            }else{
                if(yCenter >= y1){
                    if(r*r >= ((xCenter-x2)*(xCenter-x2) + (yCenter- y2)*(yCenter - y2) )) return true;
                    else return false;
                }else{
                     if(r*r >= ((xCenter-x2)*(xCenter-x2) + (yCenter- y1)*(yCenter - y1) )) return true;
                    else return false;

                }

            }
              
           

        }else if(yCenter >=y2 ){
           
                     if(r*r  >= (yCenter - y2)* (yCenter - y2)) return true;
                     else return false;
          
            

        }else if(yCenter <=y1){
       
                    if(r*r >= (yCenter - y1)*(yCenter - y1)) return true;
                    else return false;
           
            

        }
        return true;
    }



   public static void main(String[] args){
    boolean ans = checkOverlap(1,0,0,1,1,3,3);
    System.out.print("Are circle and rectangle overlapping?..." + ans);
   }



}