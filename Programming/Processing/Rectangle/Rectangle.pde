
int y=30;
void setup()
{ size(500,500);
}
void keyPressed(){
    if(key == 'w')
    {
     y = y - 25;
    }
    if(key == 's')
    {
      y = y + 25;
    }
   
 }  
 void draw(){
   background(255);
   rect(20,y,30,30);
   if(y < 0 ){ 
     y = 500;
   }
   if(y > 500){
     y = 0;
   }
 }
 
