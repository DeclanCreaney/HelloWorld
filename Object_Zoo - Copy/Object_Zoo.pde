Creature Stonecluster;
Creature Stonecluster2;
int move;
boolean bounce;
void setup() {
  size(500,500);

Stonecluster2 = new Creature(color (#FF4B7B), color (#7EDBFF), 1, 250, 250);
Stonecluster = new Creature(color (#A09E9E), color (#ED81EB), 2, 250,250);

bounce = true;
}

void draw() {
  background(25,170,50);
  Stonecluster.draw();
  Stonecluster.move(mouseX,mouseY);
  Stonecluster2.draw();
  Stonecluster2.bounce(2,500);
 
}
