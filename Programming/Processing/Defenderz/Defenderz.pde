PImage background;
int a = 3;
int b = 0;
int x = 0;
int gameMode = 0;
color ALIEN1 = color(0, 255, 0);
color ALIEN2 = color(50, 100, 0);
class Defender {
  int x = 20;
  int y;
  int speedY;
  PImage explosion;
  
  Defender(int y, int dy){
    this.y = y;
    this.speedY = dy;
    explosion = loadImage("Images/bum.png");
  }
  
  void render(){
    fill(255, 0, 0);
    rect(x, y, 50, 20);
    triangle(x + 50, y, x + 50, y + 20, x + 60, y + 10);
    fill(0, 0, 100);
    rect(x, y - 10, 20, 10);
  }
  boolean collisionCheck(color alienColor){
   for(int i = 0; i<=20; i++){
   color test = get(this.x + 65,this.y + i);
   if(test == alienColor){
     explosion.resize(140,150);
     image(explosion,this.x - 5,this.y - 50);
     return true;
   }
   }
   return false;
 }
}
Defender player1;
Alien alien1, alien2, alien3;
Bullet bull1;
void setup(){
  size(800, 400);
  background = loadImage("Images/spaceBackground.jpg");
  background.resize(width, height);
  player1 = new Defender(200, 8);
  alien1 = new Alien(750, 200, 4);
  alien2 = new Alien(750, 100, 5);
  alien3 = new Alien(750, 300, 6);
  bull1 = new Bullet(player1.x + 50, player1.y + 5);
  
 
}
void mousePressed(){
  if (gameMode == 0){
    gameMode = 1;
  }
  if (gameMode == 2){
      alien1.x = 750;
      alien2.x = 750;
      alien3.x = 750;
      gameMode = 1;
      a = 3;
    }
}
void draw(){
  
   image(background, x, 0);
   if(gameMode == 0){
     fill(255,255,0);
     textSize(50);
     textAlign(CENTER);
     text("Click to start", 400, 100);
   }
     
   if(gameMode == 1){
    background();
    player1.render();
    alien1.render();
    alien1.move();
    alien2.render();
    alien2.move();
    alien3.render();
    alien3.move();
    textSize(30);
    fill(255, 255, 0);
    text("Life: " + a, 440, 50);
    text("Score: " + b, 330, 50);
    if (alien1.x < 0){
      alien1.x = 750;
      a = a - 1;
      }
     if (alien2.x < 0){
     alien2.x = 750;
     a = a - 1;
     }
     if (alien3.x < 0){
     alien3.x = 750;
     a = a - 1;
     }
     if (a < 0) {
       gameMode = 2;
     }
    
    if(player1.collisionCheck(ALIEN1) == true ){
      gameMode = 2;
     }
 
   }
    
   if(gameMode == 2){
     textSize(50);
     fill(255,255,0);
     textAlign(CENTER);
     text("GAME OVER",400,100);
     textSize(25);
     text("Click to restart", 400, 300);
     textSize(30);
     text("Your score: " + b, 400, 200);
   }
   
  }
void background(){
  image(background, x, 0);
  image(background, x + background.width, 0);  
  x -=4;
  if (x == -background.width){
  x = 0;
  }
}
void keyPressed(){
    if (key == 'w')
    {
     player1.y = player1.y - player1.speedY;
    }
    if (key == 's')
    {
      player1.y = player1.y + player1.speedY;
    }
 }
 
