//Call class and name for object
Box instructionFrame;

void setup() {
  size(1280,720);
//size(800,800);
//fullScreen();
  
object_values();
Classes();
variables();
pitcures();
startUp0(); 
startUp(); 
startUp2();
startUp3();
startUp4();

}

void draw() {

//These switch case statements check which page you are on, 
//depending which value the variable pageCounter is on.   

//Also this should be the only thing in the main draw loop.

switch(pageCounter) {
 
case 0: //frontpage
drawFrontpage();

break;



case 100:
introScene();
break;





case 1: //Shaman Scene
background5();
shamanDetect();
shamanE();
convoOne();
movement();
Character();
break;

case 2: // Loading Screen 1
LoadingScreenOne();
break;





//----------------------Quest_1------------------------//


case 10:
backmove=4;
Scene2();
break;

//----------------------Loading_Screen2------------------------//


case 11:
LoadingScreenTwo();
break;




//----------------------Quest_2------------------------//



case 12:
Scene3();
break;







//----------------------Loading_Screen3------------------------//


case 13:
LoadingScreenThree();
break;





//----------------------Quest_3------------------------//



case 14:
TreesCut = TreesCut1 + TreesCut2;
Scene4();
break;







//----------------------Endings------------------------//



case 40:
image(Forrest2Sky,0,0,width,height);
 ButtonForEndChoiceHome();
 Buy_the_forest.display();
 if(TreesCut < 6) {
 Settle_down_in_the_forest.display();
 }
 if(TreesCut == 0) {
 Refuse_to_buy_the_forest.display();
 }
break;

case 41:
ending();
break;
}
}
