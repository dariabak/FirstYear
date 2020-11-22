int x = 20;
int y = 50;
void setup()
{
  size(300,100);
 for(x=20;x<320;x=x+100)
 {
 motorbike();
 }
}
void motorbike()
{
  fill(255);
  ellipse(x,y,20,20);
  ellipse(x+50,y,20,20);
  fill(211,211,211);
  triangle(x,y,x+50,y,x+25,y-25);
}
