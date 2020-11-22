
void setup()
{ 
  size(500,500);
  percent(100);
}
void circle(int size)
{
  ellipse(size/2,size/2,size,size);
  ellipse(2*size,2*size,size,size);
}
void percent(int size)
{
  circle(size);
  line(2*size,size/9,size/6,5*size/2);
}
