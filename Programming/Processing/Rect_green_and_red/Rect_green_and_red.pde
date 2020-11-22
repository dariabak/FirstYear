int x = 10;
int y = 20;
void setup(){
  size(500, 500);
  circles();
}
void circles(){
  for(int j=0;j<10;j++)
  {
    for(int i=0;i<10;i++)
    { if(i == j){
      fill(255,0,0);
    }
    else{
      fill(0,255,0);
    }
      ellipse(x,y,15,15);
      x=x+20;
    }
    x=10;
    y=y+20;
  }
}
