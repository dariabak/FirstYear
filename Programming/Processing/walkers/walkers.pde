  
  
  class Walker{
  int x = 10;
  int y;
  int speedX,speedY;
  int counter = 0;
  int countDir = 1;
  PImage img1,img2,img3,img4;
  
  Walker(int x,int y, int dx, int dy){
  this.x = x;
  this.y = y;
  this.speedX = dx;
  this.speedY = dy;
  img1 = loadImage("Images/walk1.gif");
  img2 = loadImage("Images/walk2.gif");
  img3 = loadImage("Images/walk3.gif");
  img4 = loadImage("Images/walk4.gif");
  }
  void move(){
  x = x + speedX;
  y = y + speedY;
  if (x >= 540){
    x = 540;
    speedX = -speedX;
  }
  if (x <=0){
    x = 0;
    speedX = -speedX;
  }
  if (y >= 450){
    y = 450;
    speedY = -speedY;   
  }
  if (y <=0){
    y = 0;
    speedY = -speedY;
  }
  }
  void render(){
  if (counter >= 0 && counter <=10){
    image(img1, x, y);
  }
  else if (counter > 10 && counter <= 20){
    image(img2, x, y);
  }
  else if (counter > 20 && counter <=30){
    image(img3, x, y);
  }
  else if (counter > 30 && counter <= 35){
    image (img4, x, y);
  }
  else{
    countDir = -countDir;
  }
  counter = counter + countDir;
  }
  void update(){
  render();
  move();
  crash();
  }
  void crash(){
  float minDistance = 10;
  float distance = sqrt(this.x*x + this.y*y);
  if( distance <= minDistance){
    x = -x;
    y = -y;
    speedX = -speedX;
    speedY = -speedY;
  }
   
  }
  }
  Walker person1,person2,person3;
  void setup()
  { 
  size(600,600);
  person1 = new Walker(10, 100, 3, 3);
  person2 = new Walker(400, 10, 4, 4);
  person3 = new Walker(150, 200, 5, 5);
  }
  void draw()
  {
  background(255);
   person1.update();
   person2.update();
   person3.update();
  }
