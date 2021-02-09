




void instagram () {
  
  
//#############################scrollI Funktion##################################//
  
   scrollI=scrollYInsta*sSpeed;
   if(!scrollLock){
   if(scrollI<=1){
   scrollYInsta=scrollYInsta+4;
   }

    if(scrollI>=-3469){
    scrollYInsta=scrollYInsta-4;
   }
 }
 
//##############################################################################//
  
  
  
  
  
  background (255);
  
  
  
  //--------The y - coordinates of every post--------//
  
  
  int Space = 700;
  int AddPost = 0;
  int AddPost1 = AddPost+Space;
  int AddPost2 = AddPost1+Space;
  int AddPost3 = AddPost2+Space;
  int AddPost4 = AddPost3+Space;
  int AddPost5 = AddPost4+Space;
  
  
  //-------Bar Section-------//
  
  
  //The Lower Top Bar 
  int barLTopX = 0;
  int barLTopY = 130;
  int barLTopW = 593;
  int barLTopH = 90;
  fill (255);
  rect (barLTopX, barLTopY+AddPost+scrollI, barLTopW, barLTopH);
  
  //The Bottom Bar
  int barBottomX = 0;
  int barBottomY = 655;
  int barBottomW = 593;
  int barBottomH = 120;
  fill (255);
  rect (barBottomX, barBottomY+AddPost+scrollI, barBottomW, barBottomH);
  
//returns the user to the lockscreen if x amount of time passes    
returnTimer();
  
  
  
  
  //-------Lower Top Bar - Customization-------//
  
  
  //Profile Picture Outer Outline
  int profileX = 45;
  int profileY = 175;
  int profileW = 80;
  int profileH = 80;
  fill (255);
  ellipse (profileX, profileY+AddPost+scrollI, profileW, profileH);
  
  //Profile Picture Outline
  int InnerprofileW = profileW-15;
  int InnerprofileH = profileH-15;
  ellipse (profileX,profileY+AddPost+scrollI,InnerprofileW,InnerprofileH);
  
  //Profile AAU
  image (AalborgLogo,AalborgLogoX,AalborgLogoY+AddPost+scrollI);
  
  //Profile Picture Text
  String ProfileText = "aaucph";
  int ProfileTextX = 100;
  int ProfileTextY = 170;
  color ProfileTextColor = 0;
  fill (ProfileTextColor);
  textSize (20);
  text (ProfileText, ProfileTextX,ProfileTextY+AddPost+scrollI);
  
  String ProfileLocation = "Sydhavn";
  fill (ProfileTextColor);
  textSize (14);
  text (ProfileLocation,ProfileTextX,ProfileTextY+AddPost+20+scrollI);
  
  //Dots at the right side
  int dotX = 575;
  int dotY = 160;
  int dotW = 7;
  int dotH = 7;
  
  color dotColor = 0;
  
  fill (dotColor);
  ellipse (dotX,dotY+AddPost+scrollI,dotW,dotH);
  ellipse (dotX,dotY+AddPost+20+scrollI,dotW,dotH);
  ellipse (dotX,dotY+AddPost+40+scrollI,dotW,dotH);
  
  
  //-------Middle Image - Customization-------//
  
  //Image 1
  image (Image1,barLTopX,barLTopY+barLTopH+AddPost+scrollI);
  
  //Like Counter
  String Like = "20 people like this";
  int LikeX = 20;
  int LikeY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (Like, LikeX, LikeY+AddPost+scrollI);
  
  //Image Text 1
  String ImageText1 = "aaucph Smukt vejr, smuk udsigt. En ny dag på AAUCPH starter!";
  int ImageTextX = 20;
  int ImageTextY = 765;
  fill (ProfileTextColor);
  textSize (16);
  text (ImageText1, ImageTextX, ImageTextY+AddPost+scrollI);
  
  //-------The Bottom Bar - Customization-------//
  
  
  //Variables
  int BottomIconX = 15;
  int BottomIconY = 670;
  
  //"Heart"
  image (Heart,BottomIconX,BottomIconY+AddPost+scrollI);
  
  //"Message"
  image (Chat,BottomIconX+60,BottomIconY+AddPost+scrollI);
  
  //"Share"
  image (BottomPaperplane,BottomIconX+120,BottomIconY+AddPost+scrollI);
  
  
  //-------New Post 1-------//
  
  
  int new1Post1 = barLTopY + AddPost1;
  int new1Post2 = barBottomY + AddPost1;
  int new1Post3 = profileY + AddPost1;
  int new1Post4 = AalborgLogoY + AddPost1;
  int new1Post5 = ProfileTextY + AddPost1;
  int new1Post6 = dotY + AddPost1;
  int new1Post7 = BottomIconY + AddPost1;
  int new1Post9 = ImageTextY + AddPost1; 
  
  fill (255);
  rect(barLTopX,new1Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new1Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new1Post3+scrollI,profileW,profileH);
  ellipse (profileX,new1Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new1Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new1Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new1Post5+20+scrollI);
  ellipse(dotX,new1Post6+scrollI,dotW,dotH);
  ellipse (dotX,new1Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new1Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new1Post7+scrollI);
  image (Chat,BottomIconX+60,new1Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new1Post7+scrollI);
  
  //Kaffepletten Image
  image(Kaffepletten,barLTopX,barLTopY+barLTopH+AddPost1+scrollI);
  
  //Kaffepletten Likes
  String LikeKaffepletten = "35 people like this";
  int LikeKaffeplettenX = 20;
  int LikeKaffeplettenY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeKaffepletten, LikeKaffeplettenX, LikeKaffeplettenY+AddPost1+scrollI);
  
  //Kaffepletten Text
  String Kaffepletten = "aaucph Så er det kaffetid! Kom ned og nyd en kop kaffe hos Kaffepletten";
  fill (ProfileTextColor);
  textSize (16);
  text (Kaffepletten, ImageTextX, new1Post9+scrollI);
  
  
  //----New Post 2----//
  
  
  int new2Post1 = barLTopY + AddPost2;
  int new2Post2 = barBottomY + AddPost2;
  int new2Post3 = profileY + AddPost2;
  int new2Post4 = AalborgLogoY + AddPost2;
  int new2Post5 = ProfileTextY + AddPost2;
  int new2Post6 = dotY + AddPost2;
  int new2Post7 = BottomIconY + AddPost2;
  int new2Post9 = ImageTextY + AddPost2; 
  
  fill (255);
  rect(barLTopX,new2Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new2Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new2Post3+scrollI,profileW,profileH);
  ellipse (profileX,new2Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new2Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new2Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new2Post5+20+scrollI);
  ellipse(dotX,new2Post6+scrollI,dotW,dotH);
  ellipse (dotX,new2Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new2Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new2Post7+scrollI);
  image (Chat,BottomIconX+60,new2Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new2Post7+scrollI);
    
  //Slusen Image  
  image(Slusen,barLTopX,barLTopY+barLTopH+AddPost2+scrollI);
  
  //Slusen Likes
  String LikeSlusen = "41 people like this";
  int LikeSlusenX = 20;
  int LikeSlusenY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeSlusen, LikeSlusenX, LikeSlusenY+AddPost2+scrollI);
  
  //Slusen Text
  String Slusen = "aaucph Vi håber alle sammen Slusen åbner op igen";
  fill (ProfileTextColor);
  textSize (16);
  text (Slusen, ImageTextX, new2Post9+scrollI);
  
  
  //----New Post 3----//
  
  
  int new3Post1 = barLTopY + AddPost3;
  int new3Post2 = barBottomY + AddPost3;
  int new3Post3 = profileY + AddPost3;
  int new3Post4 = AalborgLogoY + AddPost3;
  int new3Post5 = ProfileTextY + AddPost3;
  int new3Post6 = dotY + AddPost3;
  int new3Post7 = BottomIconY + AddPost3;

  int new3Post9 = ImageTextY + AddPost3; 
  
  fill (255);
  rect(barLTopX,new3Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new3Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new3Post3+scrollI,profileW,profileH);
  ellipse (profileX,new3Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new3Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new3Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new3Post5+20+scrollI);
  ellipse(dotX,new3Post6+scrollI,dotW,dotH);
  ellipse (dotX,new3Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new3Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new3Post7+scrollI);
  image (Chat,BottomIconX+60,new3Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new3Post7+scrollI);
  
  //Bro Image
  image(Bro,barLTopX,barLTopY+barLTopH+AddPost3+scrollI);
  
  //Bro Likes 
  String LikeBro = "13 people like this";
  int LikeBroX = 20;
  int LikeBroY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeBro, LikeBroX, LikeBroY+AddPost3+scrollI);
  
  //Bro Text
  String Bro = "aaucph #studieliv";
  fill (ProfileTextColor);
  textSize (16);
  text (Bro, ImageTextX, new3Post9+scrollI);
  
  
  //----New Post 4----//
  
  
  int new4Post1 = barLTopY + AddPost4;
  int new4Post2 = barBottomY + AddPost4;
  int new4Post3 = profileY + AddPost4;
  int new4Post4 = AalborgLogoY + AddPost4;
  int new4Post5 = ProfileTextY + AddPost4;
  int new4Post6 = dotY + AddPost4;
  int new4Post7 = BottomIconY + AddPost4;

  int new4Post9 = ImageTextY + AddPost4; 
  
  fill (255);
  rect(barLTopX,new4Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new4Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new4Post3+scrollI,profileW,profileH);
  ellipse (profileX,new4Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new4Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new4Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new4Post5+20+scrollI);
  ellipse(dotX,new4Post6+scrollI,dotW,dotH);
  ellipse (dotX,new4Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new4Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new4Post7+scrollI);
  image (Chat,BottomIconX+60,new4Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new4Post7+scrollI);
  
  //Vandtorvet Image
  image(Vandtorvet,barLTopX,barLTopY+barLTopH+AddPost4+scrollI);
  
  //Vandtorvet Likes
  String LikeVandtorvet = "17 people like this";
  int LikeVandtorvetX = 20;
  int LikeVandtorvetY = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeVandtorvet, LikeVandtorvetX, LikeVandtorvetY+AddPost4+scrollI);
  
  //Vandtorvet Text
  String Vandtorvet = "aaucph Vandtorvet set oppefra";
  fill (ProfileTextColor);
  textSize (16);
  text (Vandtorvet, ImageTextX, new4Post9+scrollI);
  
  
  //----New Post 4----//
  
  
  int new5Post1 = barLTopY + AddPost5;
  int new5Post2 = barBottomY + AddPost5;
  int new5Post3 = profileY + AddPost5;
  int new5Post4 = AalborgLogoY + AddPost5;
  int new5Post5 = ProfileTextY + AddPost5;
  int new5Post6 = dotY + AddPost5;
  int new5Post7 = BottomIconY + AddPost5;

  int new5Post9 = ImageTextY + AddPost5; 
  
  fill (255);
  rect(barLTopX,new5Post1+scrollI,barLTopW,barLTopH);
  rect(barBottomX, new5Post2+scrollI, barBottomW, barBottomH);
  ellipse(profileX,new5Post3+scrollI,profileW,profileH);
  ellipse (profileX,new5Post3+scrollI,InnerprofileW,InnerprofileH);
  image(AalborgLogo,AalborgLogoX,new5Post4+scrollI);
  fill (ProfileTextColor);
  textSize (20);
  text(ProfileText,ProfileTextX,new5Post5+scrollI);
  textSize (14);
  text (ProfileLocation,ProfileTextX,new5Post5+20+scrollI);
  ellipse(dotX,new5Post6+scrollI,dotW,dotH);
  ellipse (dotX,new5Post6+20+scrollI,dotW,dotH);
  ellipse (dotX,new5Post6+40+scrollI,dotW,dotH);
  image (Heart,BottomIconX,new5Post7+scrollI);
  image (Chat,BottomIconX+60,new5Post7+scrollI);
  image (BottomPaperplane,BottomIconX+120,new5Post7+scrollI);
  
  //Smile8 Image
  image(Smile8,barLTopX,barLTopY+barLTopH+AddPost5+scrollI);
  
  //Smile8 Likes
  String LikeSmile8 = "33 people like this";
  int LikeSmile8X = 20;
  int LikeSmile8Y = 745;
  fill (ProfileTextColor);
  textSize (18);
  text (LikeSmile8, LikeSmile8X, LikeSmile8Y+AddPost5+scrollI);
  
  //Smile8 Text
  String Smile8 = "aaucph #Smilelab Kom og eksperimenter!";
  fill (ProfileTextColor);
  textSize (16);
  text (Smile8, ImageTextX, new5Post9+scrollI);
  
  
  //-------Fixated Bars-------//
  
  
  
  
 //----------------------hvid top bar -----------------------------------------------------
  rectMode(CORNER);
  fill (#FFFFFF);
  noStroke();
  rect (yStart,xStart,width,topbarH);
  
   
  
  //Insert Top Bar here!
  topbar();
  
  //The Top Bar 
  int barTopX = 0;
  int barTopY = 40;
  int barTopW = 593;
  int barTopH = 90;
  fill (255);
  rect (barTopX, barTopY, barTopW, barTopH);
  
  //The Lower Bottom Bar
  int barLBottomY = height-height/26;
  int barLBottomH = 65;
  fill (255);
  rect(barBottomX,barLBottomY,barBottomW,barLBottomH);
  
  
  //-------Top Bar - Customization-------//
  
  
  //Camera Logo - Box
  int cameraX = 15;
  int cameraY = 55;
  int cameraW = 60;
  int cameraH = 60;
  int cameraCorner = 8;
  fill (255);
  rect (cameraX, cameraY, cameraW, cameraH,cameraCorner);
  
  //Camera Logo - Lens
  int lensX = 45; 
  int lensY = 85;
  int lensW = 30;
  int lensH = 30;
  ellipse (lensX, lensY, lensW, lensH);
  
  //Instagram Logo
  image (InstagramText,190,60);
  
  //Paperplane Icon
  image (TopPaperplane,TopPaperplaneX,TopPaperplaneY);
  

  
  
  
  homebutton();  


}
