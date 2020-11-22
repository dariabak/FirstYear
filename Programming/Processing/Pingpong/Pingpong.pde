int x;
int b = 0;
int a = 0;
int ballX = 250;
int ballY; 
int batX,batY;
int deltaX = 3; 
int deltaY = 1;
void setup(){
size(500,250); 
noLoop();
}
void keyPressed(){
  if(key == 'd'){
    batX = batX + 20;
  }
  if(key == 'a'){
    batX = batX - 20;
  }
}

void draw(){ 
  game();

   }
void ball(){
  background(200);
  ellipse(ballX,ballY,15,15);
  ballX = ballX + deltaX;
  ballY = ballY + deltaY;
  if(ballX >= 500){
  deltaX = -deltaX;
  }
  if(ballX <= 0){
  deltaX = -deltaX;
  }
  
  if(ballY <= 0){
  deltaY= -deltaY;
}
}
void platform(){
  fill(255);
  rect(batX,235,60,10);
  if(batX <= 0){
    batX = 0;
  }
  if(batX >= 500){
    batX = 500;
  }
}
void game(){
  background(255);
  ball();
  platform();
  if(ballY == 235){
    if(ballX>=batX && ballX<=(batX+60)){
      deltaY = -deltaY;
    }
  }
  score();
 
   if(ballY >= 250){
      for(int i=0; i<3; i++){
       ballX = 250;
       ballY = 0;
   }
}
}

void score(){
  
  
  text(b, 150, 30);
  if(ballY == 235){
    b = b + 1;
  }
  text("Score", 100, 30);
    
}
void mouseReleased() {
  loop();
}
