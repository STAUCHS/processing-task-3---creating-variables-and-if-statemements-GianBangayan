import processing.core.PApplet;
/**
* A program Sketch.java that displays a image of a robot that randomizes it's placement on the screen
* @author: G. Bangayan
* 
*/
public class Sketch extends PApplet {
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  
  public void settings() {
	// put your size call here
    size(800,800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
   //Line Drawing function using start and end coordinates
  public void drawLine(int intStartX, int intStartY, int intEndX, int intEndY){
    beginShape();
    vertex(intStartX,intStartY);
    vertex(intEndX,intEndY);
    endShape(CLOSE);
  }

  //define random variables
  int intRandX;
  int intRandY;
  //Set Background Colour and set random position
  public void setup() {
    intRandX = (int)random(500);
    intRandY = (int)random(500);
    if(intRandX > 250 && intRandY > 250){
      background(255, 0, 0);
    }
    else if(intRandX < 250 && intRandY > 250){
      background(0, 0, 255);
    }
    else if(intRandX > 250 && intRandY < 250){
      background(0, 0, 0);
    }
    else{
      background(255, 188, 0);
    }
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    float fltHeightRatio = (float)0.3;
    float fltWidthRatio = (float)0.3;
    //change robot colour
    fill(160, 160, 160);
    //draw robot head
    beginShape();
      vertex(100*fltWidthRatio + intRandX, 100*fltHeightRatio + intRandY);
      vertex(100*fltWidthRatio + intRandX, 700*fltHeightRatio + intRandY);
      vertex(700*fltWidthRatio + intRandX, 700*fltHeightRatio + intRandY);
      vertex(700*fltWidthRatio + intRandX, 100*fltHeightRatio + intRandY);
    endShape(CLOSE);

    //Draw Eyeballs
    fill(255, 255, 255);
    ellipse(250*fltWidthRatio + intRandX, 300*fltHeightRatio + intRandY, 200*fltWidthRatio, 200*fltHeightRatio);
    ellipse(550*fltWidthRatio + intRandX, 300*fltHeightRatio + intRandY, 200*fltWidthRatio, 200*fltHeightRatio);
    //Draw Pupils
    fill(0, 0, 0);
    ellipse(550*fltWidthRatio + intRandX, 300*fltHeightRatio + intRandY, 50*fltWidthRatio, 50*fltHeightRatio);
    ellipse(250*fltWidthRatio + intRandX, 300*fltHeightRatio + intRandY, 50*fltWidthRatio, 50*fltHeightRatio);

    //Draw Mouth box
    fill(200, 200, 200);
    beginShape();
    vertex(250*fltWidthRatio + intRandX, 600*fltHeightRatio + intRandY);
    vertex(250*fltWidthRatio + intRandX, 500*fltHeightRatio + intRandY);
    vertex(550*fltWidthRatio + intRandX, 500*fltHeightRatio + intRandY);
    vertex(550*fltWidthRatio + intRandX, 600*fltHeightRatio + intRandY);
    endShape(CLOSE);

    //Draw Mouth diamond
    fill(230, 230, 230);
    beginShape();
    vertex(250*fltWidthRatio + intRandX, 550*fltHeightRatio + intRandY);
    vertex(400*fltWidthRatio + intRandX, 600*fltHeightRatio + intRandY);
    vertex(550*fltWidthRatio + intRandX, 550*fltHeightRatio + intRandY);
    vertex(400*fltWidthRatio + intRandX, 500*fltHeightRatio + intRandY);
    endShape(CLOSE);

    // Draw mouth lines
    fill(0, 0, 0);
    drawLine(Math.round(250 * fltWidthRatio + intRandX), Math.round(600 * fltHeightRatio + intRandY), Math.round(250 * fltWidthRatio + intRandX), Math.round(500* fltHeightRatio + intRandY));
    drawLine(Math.round(300 * fltWidthRatio + intRandX), Math.round(600 * fltHeightRatio + intRandY), Math.round(300 * fltWidthRatio + intRandX), Math.round(500* fltHeightRatio + intRandY));
    drawLine(Math.round(350 * fltWidthRatio + intRandX), Math.round(600 * fltHeightRatio + intRandY), Math.round(350 * fltWidthRatio + intRandX), Math.round(500* fltHeightRatio + intRandY));
    drawLine(Math.round(400 * fltWidthRatio + intRandX), Math.round(600 * fltHeightRatio + intRandY), Math.round(400 * fltWidthRatio + intRandX), Math.round(500* fltHeightRatio + intRandY));
    drawLine(Math.round(450 * fltWidthRatio + intRandX), Math.round(600 * fltHeightRatio + intRandY), Math.round(450 * fltWidthRatio + intRandX), Math.round(500* fltHeightRatio + intRandY));
    drawLine(Math.round(500 * fltWidthRatio + intRandX), Math.round(600 * fltHeightRatio + intRandY), Math.round(500 * fltWidthRatio + intRandX), Math.round(500* fltHeightRatio + intRandY));
    drawLine(Math.round(550 * fltWidthRatio + intRandX), Math.round(600 * fltHeightRatio + intRandY), Math.round(550 * fltWidthRatio + intRandX), Math.round(500* fltHeightRatio + intRandY));
   // define other methods down here.

   //draw head antenna 
   fill(0, 0, 0);
   beginShape();
   vertex(385*fltWidthRatio + intRandX, 100*fltHeightRatio + intRandY);
   vertex(415*fltWidthRatio + intRandX, 100*fltHeightRatio + intRandY);
   vertex(415*fltWidthRatio + intRandX, 50*fltHeightRatio + intRandY);
   vertex(385*fltWidthRatio + intRandX, 50*fltHeightRatio + intRandY);
   endShape(CLOSE);

   //Draw head antenna bobble
   fill(255, 0, 0);
   ellipse(400*fltWidthRatio + intRandX, 50*fltHeightRatio + intRandY, 50*fltWidthRatio , 50*fltHeightRatio);
  
    // Displays time
   int intHours = hour();
   int intMinutes = minute();
   fill(255,255,255);
   textSize(50);
   text(intHours, 200, 200);
   text(intMinutes, 200, 250);
  }
}