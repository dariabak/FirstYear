
class Alien {
  int x;
  int y;
  int speedX;
  int dy;
  
  Alien(int x, int y, int dx) {
  this.x = x;
  this.y = y;
  this.speedX = dx;
  }
  void render() {
    fill(ALIEN1);
    ellipse(x, y, 30, 30);
    fill(ALIEN2);
    ellipse(x, y, 50, 15);
  }
  void move() {
    x = x - speedX;
    float dy = random(-5, 5);
    y = y + (int)dy;
  }
   boolean isShot(Bullet bullet){
    if(bullet!=null){
      if(abs(this.x-bullet.x) < 10  && abs(this.y-bullet.y) < 10)
      return true;
    }
    return false;
  }
}
