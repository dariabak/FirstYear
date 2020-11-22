class Bird { 
   int x; 
   int y;
   int speedX, speedY;
   int counter = 0;
   int countDir=1;
   PImage image1,image2,image3;
Bird(int x, int y, int dx, int dy){
     this.x = x;
     this.y = y;
     this.speedX=dx;
     this.speedY = dy;
     image1 = loadImage("Images/bird1.png");
     image2 = loadImage("Images/bird2.png");
     image3 = loadImage("Images/bird3.png");
   }
void move()
{
   x = x+speedX;
   y = y+speedY;
   if (x >= 1000 - image1.width){
     x = 1000 - image1.width;
     speedX = -speedX;
   }
   if(x <= 0){
     x = 0;
     speedX = -speedX;
   }
   if (y >= 1000 - image1.height){
     y = 1000 - image1.height;
     speedY = -speedY;
   }
   if(y<= 0){
     y = 0;
     speedY = -speedY;
   }
}
void render()
   {
      if (counter>=0 && counter<=10){
        image(image1,x,y);
      }
      else if (counter>10 && counter<=20){
        image(image2,x,y);
      }
      else if (counter>20 && counter<=25)
      {
        image(image3,x,y);
      }
      else 
      {
        countDir = -countDir; //reverse sequence
      }
      counter = counter + countDir;   
   }
}
Bird polly, bluey;

void setup()
{
   size(1000,1000);
   polly = new Bird(500,100,-3,2);
   bluey= new Bird(500,150,-5,-5);
}
void draw()
{
  background(255);
  polly.render();
  polly.move();
  bluey.render();
  bluey.move();
}
