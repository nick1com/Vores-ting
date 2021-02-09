




void returnTimer() {
  
  
//The part of the timer that shows the current time
int currentTime = millis() - captureTime; 
 currentTimeMess = millis() - captureTimeMess; 
 //timer that states that if more than x milliseconds pass, it will return us to the "lockScreen"
if(currentTime > millisLock5){
  page1 = true;
  page2 = false;
  page3 = false;
  page4 = false;
  page5 = false;
  page6 = false;
  page7 = false;
  page8 = false;
  page9 = false;
  page10 = false;
  page11 = false;
 
  captureTime = millis();
  captureTimeForFakeClock = millis();
  captureTimeForNotification = millis();
  captureTimeForAnimation = millis();
 }  
}
