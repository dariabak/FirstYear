class Arrow {
 int x;
 int y;
 int w = 50;
 int h = 50;
 int speedX;
 int speedY;
 PImage img1, img2, img3, img4;

 Arrow(int x, int y, int dx, int dy) {
  this.x = x;
  this.y = y;
  this.speedX = dx;
  this.speedY = dy;
  img1 = loadImage("Images/arrow1.png");
  img2 = loadImage("Images/arrow2.png");
  img3 = loadImage("Images/arrow3.png");
  img4 = loadImage("Images/arrow4.png");
 }
 void move() {
  x = x + speedX;
  y = y + speedY;
  if (x >= (width - w)) {
   speedX = -speedX;
  }
  if (x <= 0) {
   speedX = -speedX;
  }
  if (y >= (height - h)) {
   speedY = -speedY;
  }
  if (y <= 0) {
   speedY = -speedY;
  }
 }
 void render() {
  img1.resize(w, h);
  img2.resize(w, h);
  img3.resize(w, h);
  img4.resize(w, h);
  if (speedX < 0 && speedY < 0) {
   image(img1, x, y);
  }
  if (speedX < 0 && speedY > 0) {
   image(img4, x, y);
  }
  if (speedX > 0 && speedY > 0) {
   image(img3, x, y);
  }
  if (speedX > 0 && speedY < 0) {
   image(img2, x, y);
  }
 }
 boolean collisionCheck(Arrow other) {
  if (other!= null) {
   if (abs(this.x - other.x) < w && abs(this.y - other.y) < h)
    this.speedX = -this.speedX;
   this.speedY = -this.speedY;
   return true;
  }
  return false;
 }
 void update() {
  render();
  move();
 }
}

Arrow arr1, arr2, arr3;
void setup() {
 size(500, 500);
 arr1 = new Arrow(10, 20, 4, -2);
 arr2 = new Arrow(300, 150, -2, 2);
 arr3 = new Arrow(60, 300, 3, 2);
}
void draw() {
 background(255);
 arr1.update();
 arr2.update();
 arr3.update();
 arr1.collisionCheck(arr2);
 arr1.collisionCheck(arr3);
 arr2.collisionCheck(arr1);
 arr2.collisionCheck(arr3);
 arr3.collisionCheck(arr1);
 arr3.collisionCheck(arr2);
}
