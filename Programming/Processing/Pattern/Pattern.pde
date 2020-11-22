void setup(){
  size(500, 500);
  pattern(20, 20, 40);
}
void rects(int x, int y, int size){
  for(int i=0; i<5; i++)
  {
    for(int j=0; j<5; j++)
    {
      rect(x, y, size, size);
      x = x + size;
    }
    x = x - 5*size;
    y = y + size;
  }
      
}
void pattern(int x, int y, int size){
  rects(x, y, size);
  for(int k=0; k<5; k++)
  {
    for(int l=0; l<5; l++)
    {
      ellipse(x + size/2, y + size/2, size/2, size/2);
      x = x + size;
    }
    x = x - 5*size;
    y = y + size;
  }
}
