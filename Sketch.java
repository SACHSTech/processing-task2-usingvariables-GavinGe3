import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Set initial stroke weight  
        
    strokeWeight(4);
    
    // Draw background bamboo
    fill(181, 211, 61);
    rect( (float) (width/20), 0, (float) (width/13.33), height);
    rect( (float)(width/3.75), 0, 45, 600);
    rect(280, 0, 45, 600);
    rect(400, 0, 45, 600);
    rect(520, 0, 45, 600);
    
    // Left side bamboo lines
    line(30, 100, 75, 110);
    line(30, 250, 75, 230);
    line(30, 400, 75, 420);
    line(30, 550, 75, 570);

    // right side bamboo lines
    line(520, 100, 565, 90);
    line(520, 260, 565, 245);
    line(520, 410, 565, 425);
    line(520, 545, 565, 540);

    // central bamboo lines
    line(160, 50, 205, 65);
    line(280, 55, 325, 58);
    line(400, 44, 445, 28);

    line(160, 501, 205, 491);
    line(280, 550, 325, 557);
    line(400, 510, 445, 530);

    // Draw panda ears
    fill(0, 0, 0);
    arc(175, 180, 200, 200, radians(135), radians(320), OPEN);
    arc(425, 180, 200, 200, radians(220), radians(405), OPEN);

    // Draw panda face
    fill(255, 255, 255);
    ellipse(300, 300, 450, 375);  
    
    // Draw Panda Eyes
    fill(0, 0, 0);

    arc(200, 285, 150, 150, radians(149), radians(301), OPEN);
    arc(175, 260, 150, 150, radians(-32), radians(122), OPEN);

    arc(400, 285, 150, 150, radians(239), radians(391), OPEN);
    arc(425, 260, 150, 150, radians(58), radians(212), OPEN);

    fill(255, 255, 255);
    ellipse(210, 252, 30, 30);
    ellipse(390, 252, 30, 30);

    // Draw panda nose
    fill(0, 0, 0);
    ellipse(300, 375, 75, 40);

    // Draw Cheeks
    fill(247, 202, 213);
    strokeWeight(0);
    ellipse(165, 380, 60, 35);
    ellipse(435, 380, 60, 35);

    // Draw "Whiskers"
    strokeWeight(8);
    line(300, 375, 300, 405);
    noFill();
    arc(275, 405, 50, 40, 0, radians(135));
    arc(325, 405, 50, 40, radians(45), radians(180));  
  }
  
  // define other methods down here.
}