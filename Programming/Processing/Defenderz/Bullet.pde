class Bullet{
  int x;
  int y;
  int speedX = 3;
  
  Bullet(int x, int y){
    this.x = x;
    this.y = y;
  }
  void render(){
    fill(255, 255, 0);
    rect(x, y, 30, 10);
    triangle(x + 30, y, x + 40, y + 5, x + 30, y + 10);
  }
  void move(){
    x = x + speedX;
  }
}
