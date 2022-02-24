import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1720, 1720);
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
    rect( (float)(width/3.75), 0, (float) (width/13.33), height);
    rect( (float) (width/2.1428), 0, (float) (width/13.33), height);
    rect( (float) (width/1.5), 0, (float) (width/13.33), height);
    rect( (float) (width/1.1538), 0, (float) (width/13.33), height);
    
    // Left side bamboo lines
    line((float) (width/20), (float) (height/6), (float) (width/8), (float) (height/5.454545));
    line((float) (width/20), (float) (height/2.4), (float) (width/8), (float) (height/2.6086));
    line((float) (width/20), (float) (height/1.5), (float) (width/8), (float) (height/1.42857));
    line((float) (width/20), (float) (height/1.09090909), (float) (width/8), (float) (height/1.05263));

    // right side bamboo lines
    line((float) (width/1.153846), (float) (height/6), (float) (width/1.061946), (float) (height/6.6666));
    line((float) (width/1.153846), (float) (height/2.30769), (float) (width/1.061946), (float) (height/2.448));
    line((float) (width/1.153846), (float) (height/1.46341), (float) (width/1.061946), (float) (height/1.411764));
    line((float) (width/1.153846), (float) (height/1.10091), (float) (width/1.061946), (float) (height/1.11111));

    // central bamboo lines
    line((float) (width/3.75), (float) (height/20), (float) (width/2.9268), (float) (height/9.23076));
    line((float) (width/2.1428), (float) (height/10.90909), (float) (width/1.84615), (float) (height/10.34482));
    line((float) (width/1.5), (float) (height/13.636363), (float) (width/1.3483), (float) (height/21.42857));
    line((float) (width/3.75), (float) (height/1.1976), (float) (width/2.92682), (float) (height/1.22199));
    line((float) (width/2.1428), (float) (height/1.09090909), (float) (width/1.84615), (float) (height/1.07719));
    line((float) (width/1.5), (float) (height/1.1764), (float) (width/1.3483), (float) (width/1.1320754));

    // Draw panda ears
    fill(0, 0, 0);
    arc((float) (width/3.42857), (float) (height/3.33), (float) (width/3), (float) (height/3), radians(135), radians(320), OPEN);
    arc((float) (width/1.41176), (float) (height/3.33), (float) (width/3), (float) (height/3), radians(220), radians(405), OPEN);

    // Draw panda face
    fill(255, 255, 255);
    ellipse((float) (width/2), (float) (height/2), (float) (width/1.333), (float) (height/1.6));  
    
    // Draw Panda Eyes
    fill(0, 0, 0);

    arc((float) (width/3), (float) (height/2.10526), (float) (width/4), (float) (height/4), radians(149), radians(301), OPEN);
    arc((float) (width/3.42857), (float) (height/2.30769), (float) (width/4), (float) (height/4), radians(-32), radians(122), OPEN);

    arc((float) (width/1.5), (float) (height/2.10526), (float) (width/4), (float) (height/4), radians(239), radians(391), OPEN);
    arc((float) (width/1.41176), (float) (height/2.30769), (float) (width/4), (float) (height/4), radians(58), radians(212), OPEN);

    fill(255, 255, 255);
    ellipse((float) (width/2.85714), (float) (height/2.38095), (float) (width/20), (float) (height/20));
    ellipse((float) (width/1.53846), (float) (height/2.38095), (float) (width/20), (float) (height/20));

    // Draw panda nose
    fill(0, 0, 0);
    ellipse((float) (width/2), (float) (height/1.6), (float) (width/8), (float) (height/15));

    // Draw Cheeks
    fill(247, 202, 213);
    strokeWeight(0);
    ellipse((float) (width/3.63636363), (float) (height/1.57894), (float) (width/10), (float) (height/17.14285));
    ellipse((float) (width/1.37931), (float) (height/1.57894), (float) (width/10), (float) (height/17.14285));

    // Draw "Whiskers"
    strokeWeight(8);
    line((float) (width/2), (float) (height/1.6), (float) (width/2), (float) (height/1.481481));
    noFill();
    arc((float) (width/2.181818), (float) (height/1.481481), (float) (width/12), (float) (height/15), 0, radians(135));
    arc((float) (width/1.84615), (float) (height/1.481481), (float) (width/12), (float) (height/15), radians(45), radians(180));  
  }
  
  // define other methods down here.
}