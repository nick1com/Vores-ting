import processing.sound.*;

import processing.video.*;

SoundFile mySoundFile;


void setup() {
  size(640, 360);
  background(255);
    
  // Load a soundfile from the /data folder of the sketch and play it back
  mySoundFile = new SoundFile(this, "01 The Boondocks Main Title.m4a");
  mySoundFile.play();
}      

void draw() {
    mySoundFile.play();
}
